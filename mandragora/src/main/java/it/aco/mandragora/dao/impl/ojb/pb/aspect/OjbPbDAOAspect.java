package it.aco.mandragora.dao.impl.ojb.pb.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.apache.ojb.broker.PersistenceBroker;
import org.apache.ojb.broker.OptimisticLockException;
import it.aco.mandragora.dao.impl.ojb.pb.AdvisedOjbPbDAO;
import it.aco.mandragora.dao.impl.ojb.pb.core.OjbPbCore;
import it.aco.mandragora.dao.impl.ojb.pb.support.PersistenceBrokerSupport;
import it.aco.mandragora.exception.PersistenceBrokerSupportException;
import it.aco.mandragora.exception.DataAccessException;
import it.aco.mandragora.exception.DataOptimisticLockException;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.ArrayList;


@Aspect
public class OjbPbDAOAspect {

    //private PersistenceBrokerSupport persistenceBrokerSupport;
    //private OjbPbCore ojbPbCore;
    static private org.apache.log4j.Category log = org.apache.log4j.Logger.getLogger(OjbPbDAOAspect.class.getName());

/*    
    @DeclareParents(value="it.aco.mandragora.dao.impl.ojb.pb.AdvisedOjbPbDAO")
    public static DAO advisedOjbPbDAO;

    @Pointcut("execution(public * find*(..))")
    private void anyFinderMethod() {}

    @Pointcut("anyOjbPbDAOMethod() && anyFinderMethod()")
    private void anyOjbPbDAOFinderMethod() {}
*/

    @Pointcut("target(it.aco.mandragora.dao.impl.ojb.pb.AdvisedOjbPbDAO)")
    private void anyAdvisedOjbPbDAOMethod() {}

    @Pointcut("@annotation(it.aco.mandragora.dao.annotation.Read)")
    private void anyReadMethod() {}

    @Pointcut("@annotation(it.aco.mandragora.dao.annotation.CreateUpdateDelete)")
    private void anyCreateUpdateDeleteMethod() {}

    @Pointcut("anyAdvisedOjbPbDAOMethod() && anyReadMethod()")
    private void anyAdvisedOjbPbDAOReadMethod() {}

    @Pointcut("anyAdvisedOjbPbDAOMethod() && anyCreateUpdateDeleteMethod()")
    private void anyAdvisedOjbPbDAOCreateUpdateDeleteMethod() {}



    @Around("anyAdvisedOjbPbDAOReadMethod()")
    public Object read(ProceedingJoinPoint pjp) throws Throwable {
        log.info("************Entering the OjbPbDAOAspect.read(ProceedingJoinPoint pjp)***************");

        PersistenceBrokerSupport persistenceBrokerSupport = null;
        PersistenceBroker pb = null;
        Object result = null;
        try{
            AdvisedOjbPbDAO advisedOjbPbDAO = (AdvisedOjbPbDAO) pjp.getTarget();
            persistenceBrokerSupport = advisedOjbPbDAO.getPersistenceBrokerSupport() ;
            OjbPbCore ojbPbCore = advisedOjbPbDAO.getOjbPbCore();

            pb = persistenceBrokerSupport.getPersistenceBroker();
            Object[] newArgs = buildNewArgs(pjp,pb);
            Method ojbPbCoreMethod = getMethodToInvoke(pjp);


            result = ojbPbCoreMethod.invoke(ojbPbCore,newArgs);





        }catch(PersistenceBrokerSupportException e) {
            log.error("PersistenceBrokerSupportException thrown in  OjbPbDAOAspect.read(ProceedingJoinPoint pjp) : " + e.toString());
            throw new DataAccessException("Error in OjbPbDAOAspect.read(ProceedingJoinPoint pjp): " + e.toString(),e);
        }catch(IllegalAccessException e) {
            log.error("IllegalAccessException thrown in  OjbPbDAOAspect.read(ProceedingJoinPoint pjp) : " + e.toString());
            throw new DataAccessException("Error in OjbPbDAOAspect.read(ProceedingJoinPoint pjp): " + e.toString(),e);
        }catch(InvocationTargetException e) {
            log.error("InvocationTargetException thrown in  OjbPbDAOAspect.read(ProceedingJoinPoint pjp) : " + e.toString());
            throw new DataAccessException("Error in OjbPbDAOAspect.read(ProceedingJoinPoint pjp): " + e.toString(),e);
        }catch (Exception e) {
            log.error("Exception thrown in OjbPbDAOAspect.read(ProceedingJoinPoint pjp): " + e.toString());
            throw new DataAccessException("Error in  OjbPbDAOAspect.read(ProceedingJoinPoint pjp): " + e.toString(),e);
        }  finally {
            try{

                persistenceBrokerSupport.releasePersistenceBroker(pb);

            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException thrown in  OjbPbDAOAspect.read(ProceedingJoinPoint pjp) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in  OjbPbDAOAspect.read(ProceedingJoinPoint pjp) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the OjbPbDAOAspect.read(ProceedingJoinPoint pjp)***************");
        return result;


    }

    @Around("anyAdvisedOjbPbDAOCreateUpdateDeleteMethod()")
    public Object createUpdateDelete(ProceedingJoinPoint pjp) throws Throwable {
        log.info("************Entering the OjbPbDAOAspect.createUpdateDelete(ProceedingJoinPoint pjp)***************");
        PersistenceBrokerSupport persistenceBrokerSupport = null;
        PersistenceBroker pb = null;
        Object result = null;
        try{

            AdvisedOjbPbDAO advisedOjbPbDAO = (AdvisedOjbPbDAO) pjp.getTarget();
            persistenceBrokerSupport = advisedOjbPbDAO.getPersistenceBrokerSupport() ;
            OjbPbCore ojbPbCore = advisedOjbPbDAO.getOjbPbCore();



            pb = persistenceBrokerSupport.getPersistenceBroker();
            Object[] newArgs = buildNewArgs(pjp,pb);
            Method ojbPbCoreMethod = getMethodToInvoke(pjp);

            persistenceBrokerSupport.beginTransaction(pb);
            result = ojbPbCoreMethod.invoke(ojbPbCore,newArgs);
            persistenceBrokerSupport.commit(pb);

        } catch (OptimisticLockException e) {
            log.error("OptimisticLockException in OjbPbDAOAspect.createUpdateDelete(ProceedingJoinPoint pjp): " + e.toString());
        	try{
                persistenceBrokerSupport.rollback(pb); // change of policy. Now the if OptimisticLockException is rolled back , depends as other Exceptions, on if the environment is
                                                   // managed or not.
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException: problem rolling back in the catch block of the OptimisticLockException in OjbPbDAOAspect.createUpdateDelete(ProceedingJoinPoint pjp): " + pbsEx.toString());
            }
            throw new DataOptimisticLockException("Error in OjbPbDAOAspect.createUpdateDelete(ProceedingJoinPoint pjp): " + e.toString(),e);

        } catch (PersistenceBrokerSupportException e) {
            log.error("PersistenceBrokerSupportException in OjbPbDAOAspect.createUpdateDelete(ProceedingJoinPoint pjp): " + e.toString());
            try{
                persistenceBrokerSupport.rollback(pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException : problem rolling back in the catch block of the PersistenceBrokerSupportException in OjbPbDAOAspect.createUpdateDelete(ProceedingJoinPoint pjp): " + pbsEx.toString());
            }
            throw new DataAccessException("Error in OjbPbDAOAspect.createUpdateDelete(ProceedingJoinPoint pjp): " + e.toString(),e);

        }catch (IllegalAccessException e) {
            log.error("IllegalAccessException in OjbPbDAOAspect.createUpdateDelete(ProceedingJoinPoint pjp): " + e.toString());
            try{
                persistenceBrokerSupport.rollback(pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException: problem rolling back in the catch block of the IllegalAccessException in OjbPbDAOAspect.createUpdateDelete(ProceedingJoinPoint pjp): " + pbsEx.toString());
            }
            throw new DataAccessException("Error in OjbPbDAOAspect.createUpdateDelete(ProceedingJoinPoint pjp): " + e.toString(),e);

        }catch (InvocationTargetException e) {
            log.error("InvocationTargetException in OjbPbDAOAspect.createUpdateDelete(ProceedingJoinPoint pjp): " + e.toString());
            try{
                persistenceBrokerSupport.rollback(pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException: problem rolling back in the catch block of the InvocationTargetException in OjbPbDAOAspect.createUpdateDelete(ProceedingJoinPoint pjp): " + pbsEx.toString());
            }
            throw new DataAccessException("Error in OjbPbDAOAspect.createUpdateDelete(ProceedingJoinPoint pjp): " + e.toString(),e);

        }catch (Exception e) {
            log.error("Exception thrown in OjbPbDAOAspect.createUpdateDelete(ProceedingJoinPoint pjp): " + e.toString());
            try{
                persistenceBrokerSupport.rollback(pb);
            } catch (PersistenceBrokerSupportException pbsEx){
                log.error("PersistenceBrokerSupportException : problem rolling back in the catch block of the Exception in  OjbPbDAOAspect.createUpdateDelete(ProceedingJoinPoint pjp): " + pbsEx.toString());
            }
            throw new DataAccessException("Error in OjbPbDAOAspect.createUpdateDelete(ProceedingJoinPoint pjp): " + e.toString(),e);

        }finally {
            try{

                persistenceBrokerSupport.releasePersistenceBroker(pb);

            } catch(PersistenceBrokerSupportException e) {
                log.error("PersistenceBrokerSupportException:problem releasing the ob in   OjbPbDAOAspect.createUpdateDelete(ProceedingJoinPoint pjp) in the finally clause: " + e.toString());
                throw new DataAccessException("Error in   OjbPbDAOAspect.createUpdateDelete(ProceedingJoinPoint pjp) in the finally clause: " + e.toString(),e);
            }
        }
        log.info("************Done with the OjbPbDAOAspect.createUpdateDelete(ProceedingJoinPoint pjp)***************");
        return result;
    }



    private Object[] buildNewArgs(ProceedingJoinPoint pjp, PersistenceBroker pb ) throws Throwable {
        log.info("************Entering the OjbPbDAOAspect.buildNewArgs(ProceedingJoinPoint pjp, PersistenceBroker pb )***************");

        Object[] newArgs = null;
        try{
            Object[] args = pjp.getArgs();
            newArgs = new Object[args.length+1];
            for (int i=0; i<args.length;i++){
                newArgs[i] = args[i];
            }
            newArgs[args.length]=pb;

        }catch (Exception e) {
            log.error("Exception thrown in OjbPbDAOAspect.buildNewArgs(ProceedingJoinPoint pjp, PersistenceBroker pb ): " + e.toString());

            throw new Exception("Exception thrown in OjbPbDAOAspect.buildNewArgs(ProceedingJoinPoint pjp, PersistenceBroker pb ): " + e.toString(),e);

        }
        log.info("************Done with the OjbPbDAOAspect.buildNewArgs(ProceedingJoinPoint pjp, PersistenceBroker pb )***************");
        return newArgs;
    }


    private Method getMethodToInvoke(ProceedingJoinPoint pjp) throws Throwable {
        log.info("************Entering the OjbPbDAOAspect.getMethodToInvoke(ProceedingJoinPoint pjp, Object[] args)***************");
        Method ojbPbCoreMethod=null;
        try{
            Signature signature =   pjp.getSignature();
            log.info("OjbPbDAOAspect.getMethodToInvoke(ProceedingJoinPoint pjp, Object[] args):signature.getName() = "+signature.getName());
            log.info("OjbPbDAOAspect.getMethodToInvoke(ProceedingJoinPoint pjp, Object[] args):signature.getClass() = "+signature.getClass().toString());
            log.info("OjbPbDAOAspect.getMethodToInvoke(ProceedingJoinPoint pjp, Object[] args):pjp.getArgs() = "+pjp.getArgs().toString());

            //ojbPbCoreMethod= OjbPbCore.class.getMethod(signature.getName(),signature.getClass());
            //ojbPbCoreMethod= OjbPbCore.class.getMethod(signature.getName(),pjp.getArgs());


            Object[] args = pjp.getArgs();

            Class[] parameterTypes = new Class[args.length+1];
            for (int i=0; i<args.length;i++)  {
                parameterTypes[i]=args[i].getClass();
            }
            parameterTypes[args.length]=PersistenceBroker.class;
            ojbPbCoreMethod= OjbPbCore.class.getMethod(signature.getName(),parameterTypes);

            //Method method = signature.


        }catch (NoSuchMethodException e) {
            log.error("NoSuchMethodException thrown in OjbPbDAOAspect.getMethodToInvoke(ProceedingJoinPoint pjp): " + e.toString());

            throw new Exception("Exception thrown in OjbPbDAOAspect.getMethodToInvoke(ProceedingJoinPoint pjp): " + e.toString(),e);

        }catch (Exception e) {
            log.error("Exception thrown in OjbPbDAOAspect.getMethodToInvoke(ProceedingJoinPoint pjp): " + e.toString());

            throw new Exception("Exception thrown in OjbPbDAOAspect.getMethodToInvoke(ProceedingJoinPoint pjp): " + e.toString(),e);

        }
        log.info("************Done with the OjbPbDAOAspect.getMethodToInvoke(ProceedingJoinPoint pjp)***************");
        return ojbPbCoreMethod;
    }
}
