package it.aco.mandragora.userExample.bd.impl.SLSB;

import it.aco.mandragora.userExample.bd.UserExample2BD;
import it.aco.mandragora.bd.impl.SLSB.SLSBManagerBD;
import it.aco.mandragora.exception.ApplicationException;
import it.aco.mandragora.exception.ServiceLocatorException;
import it.aco.mandragora.userExample.serviceFacade.sessionFacade.remoteFacade.SLSB.userExample2.UserExample2SLSBFacadeHome;
import it.aco.mandragora.userExample.serviceFacade.sessionFacade.remoteFacade.SLSB.userExample2.UserExample2SLSBFacade;
import it.aco.mandragora.serviceFacade.sessionFacade.remoteFacade.SLSB.crud.CrudSLSBFacadeHome;
import it.aco.mandragora.serviceFacade.sessionFacade.remoteFacade.SLSB.business.BusinessSLSBFacadeHome;
import it.aco.mandragora.common.ServiceLocator;
import it.aco.mandragora.common.Utils;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import java.rmi.RemoteException;


public class UserExample2SLSBManagerBD extends SLSBManagerBD implements UserExample2BD {

    static private org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(UserExample2SLSBManagerBD.class.getName());

    protected UserExample2SLSBFacadeHome userExample2SLSBFacadeHome;

    protected static UserExample2SLSBManagerBD userExample2SLSBManagerBD = null;

    static {
        try {
            if (userExample2SLSBManagerBD!=null) throw new ApplicationException("thrown in the static block of UserExample2SLSBManagerBD: static instance is already set");
            userExample2SLSBManagerBD = new UserExample2SLSBManagerBD();
        }catch (Exception e){
            throw new RuntimeException("Exception thrown in the static block of UserExample2SLSBManagerBD "+ e.toString(),e);
        }

    }

    protected UserExample2SLSBManagerBD()throws ApplicationException{
        try{
            ServiceLocator serviceLocator = ServiceLocator.getInstance();
            businessSLSBFacadeHome = (BusinessSLSBFacadeHome)serviceLocator.getEJBHome(Utils.getStringFromMandragoraProperties("UserExampleSLSBManagerBD.businessManager"));
            //business = businessHome.create();
            crudSLSBFacadeHome = (CrudSLSBFacadeHome)serviceLocator.getEJBHome(Utils.getStringFromMandragoraProperties("UserExampleSLSBManagerBD.crudManager"));
            //crud = crudHome.create();

            userExample2SLSBFacadeHome = (UserExample2SLSBFacadeHome)serviceLocator.getEJBHome(Utils.getStringFromMandragoraProperties("UserExample2SLSBManagerBD.userExample2Manager"));
        } catch(ServiceLocatorException e){
            throw new ApplicationException("ServiceLocator Exception en el constructor de UserExample2SLSBManagerBD "+ e.toString());
        } catch(Exception e){
            e.printStackTrace();
            log.error("ERROR in Constructor UserExample2SLSBManagerBD "+e);
            throw new ApplicationException("Error in UserExample2SLSBManagerBD "+ e.toString());
        }
    }



    public static SLSBManagerBD getInstance() {/*It has to return SLSBManagerBD to not clash with getInstance of SLSBManagerBD */
        return userExample2SLSBManagerBD;
    }



    public void insertInTwoDB(Object insert1VO, Object insert2VO, String dbAlias1, String dbAlias2) throws ApplicationException{
        try {
            UserExample2SLSBFacade userExample2SLSBFacade= userExample2SLSBFacadeHome.create();
            userExample2SLSBFacade.insertInTwoDB( insert1VO,  insert2VO,  dbAlias1,  dbAlias2);
        } catch (RemoteException e) {
            log.error("RemoteException caught in UserExample2SLSBFacade.insertInTwoDB(Object insert1VO, Object insert2VO, String dbAlias1, String dbAlias2): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in UserExample2SLSBFacade.insertInTwoDB(Object insert1VO, Object insert2VO, String dbAlias1, String dbAlias2) " + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in UserExample2SLSBFacade.insertInTwoDB(Object insert1VO, Object insert2VO, String dbAlias1, String dbAlias2) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in UserExample2SLSBFacade.insertInTwoDB(Object insert1VO, Object insert2VO, String dbAlias1, String dbAlias2)" + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in UserExample2SLSBFacade.insertInTwoDB(Object insert1VO, Object insert2VO, String dbAlias1, String dbAlias2) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in UserExample2SLSBFacade.insertInTwoDB(Object insert1VO, Object insert2VO, String dbAlias1, String dbAlias2) " + e.toString(),e);
        }
    }

    public void insertInTwoDBAndRollback(Object insert1VO, Object insert2VO, String dbAlias1, String dbAlias2) throws ApplicationException{
        try {
            UserExample2SLSBFacade userExample2SLSBFacade= userExample2SLSBFacadeHome.create();
            userExample2SLSBFacade.insertInTwoDBAndRollback( insert1VO,  insert2VO,  dbAlias1,  dbAlias2);
        } catch (RemoteException e) {
            log.error("RemoteException caught in UserExample2SLSBFacade.insertInTwoDBAndRollback(Object insert1VO, Object insert2VO, String dbAlias1, String dbAlias2): " + e.toString());
            throw new ApplicationException("ApplicationException thrown in UserExample2SLSBFacade.insertInTwoDBAndRollback(Object insert1VO, Object insert2VO, String dbAlias1, String dbAlias2) " + e.toString(),e);
        } catch (CreateException e) {
            log.error("CreateException caught in UserExample2SLSBFacade.insertInTwoDBAndRollback(Object insert1VO, Object insert2VO, String dbAlias1, String dbAlias2) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in UserExample2SLSBFacade.insertInTwoDBAndRollback(Object insert1VO, Object insert2VO, String dbAlias1, String dbAlias2)" + e.toString(),e);
        } catch (EJBException e) {
            log.error("EJBException caught in UserExample2SLSBFacade.insertInTwoDBAndRollback(Object insert1VO, Object insert2VO, String dbAlias1, String dbAlias2) : " + e.toString());
            throw new ApplicationException("ApplicationException thrown in UserExample2SLSBFacade.insertInTwoDBAndRollback(Object insert1VO, Object insert2VO, String dbAlias1, String dbAlias2) " + e.toString(),e);
        }
    }


}