package it.aco.mandragora.userExample.bd.impl.SLSB;

import it.aco.mandragora.userExample.bd.UserExampleBD;
import it.aco.mandragora.userExample.serviceFacade.sessionFacade.remoteFacade.SLSB.userExample.UserExampleSLSBFacade;
import it.aco.mandragora.bd.impl.SLSB.SLSBManagerBD;
import it.aco.mandragora.exception.ApplicationException;
import it.aco.mandragora.exception.ServiceLocatorException;
import it.aco.mandragora.userExample.serviceFacade.sessionFacade.remoteFacade.SLSB.userExample.UserExampleSLSBFacadeHome;
import it.aco.mandragora.serviceFacade.sessionFacade.remoteFacade.SLSB.crud.CrudSLSBFacadeHome;
import it.aco.mandragora.serviceFacade.sessionFacade.remoteFacade.SLSB.business.BusinessSLSBFacadeHome;
import it.aco.mandragora.common.ServiceLocator;
import it.aco.mandragora.common.Utils;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import java.rmi.RemoteException;


public class UserExampleSLSBManagerBD extends SLSBManagerBD implements UserExampleBD {

    static private org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(UserExampleSLSBManagerBD.class.getName());

    protected UserExampleSLSBFacadeHome userExampleSLSBFacadeHome;

    protected static UserExampleSLSBManagerBD userExampleSLSBManagerBD = null;

    static {
        try {
            if (userExampleSLSBManagerBD!=null) throw new ApplicationException("thrown in the static block of UserExampleSLSBManagerBD: static instance is already set");
            userExampleSLSBManagerBD = new UserExampleSLSBManagerBD();
        }catch (Exception e){
            throw new RuntimeException("Exception thrown in the static block of UserExampleSLSBManagerBD "+ e.toString(),e);
        }

    }

    protected UserExampleSLSBManagerBD()throws ApplicationException{
        try{
            ServiceLocator serviceLocator = ServiceLocator.getInstance();
            businessSLSBFacadeHome = (BusinessSLSBFacadeHome)serviceLocator.getEJBHome(Utils.getStringFromMandragoraProperties("UserExampleSLSBManagerBD.businessManager"));
            //business = businessHome.create();
            crudSLSBFacadeHome = (CrudSLSBFacadeHome)serviceLocator.getEJBHome(Utils.getStringFromMandragoraProperties("UserExampleSLSBManagerBD.crudManager"));
            //crud = crudHome.create();

            userExampleSLSBFacadeHome = (UserExampleSLSBFacadeHome)serviceLocator.getEJBHome(Utils.getStringFromMandragoraProperties("UserExampleSLSBManagerBD.userExampleManager"));
        } catch(ServiceLocatorException e){
            throw new ApplicationException("ServiceLocator Exception en el constructor de UserExampleSLSBManagerBD "+ e.toString());
        } catch(Exception e){
            e.printStackTrace();
            log.error("ERROR in Constructor UserExampleSLSBManagerBD "+e);
            throw new ApplicationException("Error in UserExampleSLSBManagerBD "+ e.toString());
        }
    }



    public static SLSBManagerBD getInstance() {/*It has to return SLSBManagerBD to not clash with getInstance of SLSBManagerBD */
        return userExampleSLSBManagerBD;
    }



    public void insertTwoValueobjects(Object insert1VO, Object insert2VO) throws ApplicationException{
        try {
            UserExampleSLSBFacade userExampleSLSBFacade= userExampleSLSBFacadeHome.create();
            userExampleSLSBFacade.insertTwoValueobjects( insert1VO,  insert2VO);
        } catch (RemoteException e) {
            log.error("RemoteException caught in UserExampleSLSBManagerBD.insertTwoValueobjects(Object insert1VO, Object insert2VO) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in UserExampleSLSBManagerBD.insertTwoValueobjects(Object insert1VO, Object insert2VO) " + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in UserExampleSLSBManagerBD.insertTwoValueobjects(Object insert1VO, Object insert2VO) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in UserExampleSLSBManagerBD.insertTwoValueobjects(Object insert1VO, Object insert2VO) " + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in UserExampleSLSBManagerBD.insertTwoValueobjects(Object insert1VO, Object insert2VO) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in UserExampleSLSBManagerBD.insertTwoValueobjects(Object insert1VO, Object insert2VO) " + e.toString(),e);
        }
    }

    public void insertAndUpdate(Object insertVO, Object updateVO) throws ApplicationException{
        try {
            UserExampleSLSBFacade userExampleSLSBFacade= userExampleSLSBFacadeHome.create();
            userExampleSLSBFacade.insertAndUpdate( insertVO,  updateVO);
        } catch (RemoteException e) {
            log.error("RemoteException caught in UserExampleSLSBManagerBD.insertAndUpdate(Object insertVO, Object updateVO) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in UserExampleSLSBManagerBD.insertAndUpdate(Object insertVO, Object updateVO) " + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in UserExampleSLSBManagerBD.insertAndUpdate(Object insertVO, Object updateVO) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in UserExampleSLSBManagerBD.insertAndUpdate(Object insertVO, Object updateVO) " + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in UserExampleSLSBManagerBD.insertAndUpdate(Object insertVO, Object updateVO): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in UserExampleSLSBManagerBD.insertAndUpdate(Object insertVO, Object updateVO) " + e.toString(),e);
        }
    }

    public void insertTwoValueobjectsAndRollback(Object insert1VO, Object insert2VO) throws ApplicationException{
        try {
            UserExampleSLSBFacade userExampleSLSBFacade= userExampleSLSBFacadeHome.create();
            userExampleSLSBFacade.insertTwoValueobjectsAndRollback( insert1VO,  insert2VO);
        } catch (RemoteException e) {
            log.error("RemoteException caught in UserExampleSLSBManagerBD.insertTwoValueobjectsAndRollback(Object insert1VO, Object insert2VO) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in UserExampleSLSBManagerBD.insertTwoValueobjectsAndRollback(Object insert1VO, Object insert2VO) " + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in UserExampleSLSBManagerBD.insertTwoValueobjectsAndRollback(Object insert1VO, Object insert2VO) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in UserExampleSLSBManagerBD.insertTwoValueobjectsAndRollback(Object insert1VO, Object insert2VO) " + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in UserExampleSLSBManagerBD.insertTwoValueobjectsAndRollback(Object insert1VO, Object insert2VO): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in UserExampleSLSBManagerBD.insertTwoValueobjectsAndRollback(Object insert1VO, Object insert2VO) " + e.toString(),e);
        }
    }

    public void insertUpdateAndDelete(Object insertVO, Object updateVO, Object deleteVO)  throws ApplicationException{
        try {
            UserExampleSLSBFacade userExampleSLSBFacade= userExampleSLSBFacadeHome.create();
            userExampleSLSBFacade.insertUpdateAndDelete( insertVO,  updateVO,  deleteVO) ;
        } catch (RemoteException e) {
            log.error("RemoteException caught in UserExampleSLSBManagerBD.insertUpdateAndDelete(Object insertVO, Object updateVO, Object deleteVO)  : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in UserExampleSLSBManagerBD.insertUpdateAndDelete(Object insertVO, Object updateVO, Object deleteVO) " + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in UserExampleSLSBManagerBD.insertUpdateAndDelete(Object insertVO, Object updateVO, Object deleteVO)  : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in UserExampleSLSBManagerBD.insertUpdateAndDelete(Object insertVO, Object updateVO, Object deleteVO)  " + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in UserExampleSLSBManagerBD.insertUpdateAndDelete(Object insertVO, Object updateVO, Object deleteVO) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in UserExampleSLSBManagerBD.insertUpdateAndDelete(Object insertVO, Object updateVO, Object deleteVO)  " + e.toString(),e);
        }
    }
}
