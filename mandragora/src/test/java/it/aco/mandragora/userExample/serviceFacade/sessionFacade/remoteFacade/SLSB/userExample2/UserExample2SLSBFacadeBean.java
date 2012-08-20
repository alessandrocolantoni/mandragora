package it.aco.mandragora.userExample.serviceFacade.sessionFacade.remoteFacade.SLSB.userExample2;

import it.aco.mandragora.serviceFacade.ServiceFacade;
import it.aco.mandragora.exception.ServiceLocatorException;
import it.aco.mandragora.exception.ServiceFacadeException;
import it.aco.mandragora.common.ServiceLocator;
import it.aco.mandragora.context.MandragoraContext;
import it.aco.mandragora.context.ContextHandler;

import javax.ejb.SessionContext;
import javax.ejb.SessionBean;
import java.rmi.RemoteException;


public class UserExample2SLSBFacadeBean implements SessionBean {


    private SessionContext sc;
    protected static String ServiceFacadeFactoryClassName = "UserExample2SLSBFacadeBean.ServiceFacadeFactoryClass" ;
    protected static String ServiceFacadeClassName = "UserExample2SLSBFacadeBean.ServiceFacadeClass" ;


    static private org.apache.log4j.Category log = org.apache.log4j.Logger.getLogger(UserExample2SLSBFacadeBean.class.getName());
    public UserExample2SLSBFacadeBean(){}

    public void ejbCreate(){}
    public void ejbRemove(){}
    public void ejbActivate(){}
    public void ejbPassivate(){}
    public void setSessionContext(SessionContext sc){this.sc=sc; }







    protected ServiceFacade getServiceFacade()throws RemoteException {
        try{
            return ServiceLocator.getInstance().getServiceFacade(ServiceFacadeFactoryClassName,ServiceFacadeClassName);
        }catch (ServiceLocatorException e) {
            log.error("ServiceLocatorException caught in UserExample2SLSBFacadeBean.getServiceFacade(): " + e.toString());
            throw new RemoteException("RemoteException thrown in UserExample2SLSBFacadeBean.getServiceFacade()" + e.toString(),e);
        }
    }



    public void insertInTwoDB(Object insert1VO, Object insert2VO, String dbAlias1, String dbAlias2)   throws RemoteException{
        try {
            ServiceFacade serviceFacade = getServiceFacade();
            MandragoraContext localSession = (MandragoraContext)((ContextHandler)serviceFacade).getLocalSession();
            localSession.put("jcdAlias",dbAlias1);
            serviceFacade.insert(insert1VO);
            localSession.put("jcdAlias",dbAlias2);
            serviceFacade.insert(insert2VO);

        } catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in UserExample2SLSBFacadeBean.insertInTwoDB(Object insert1VO, Object insert2VO, String dbAlias1, String dbAlias2) : " + e.toString());
            throw new RemoteException("RemoteException thrown in UserExample2SLSBFacadeBean.insertInTwoDB(Object insert1VO, Object insert2VO, String dbAlias1, String dbAlias2) " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception caught in UserExample2SLSBFacadeBean.insertInTwoDB(Object insert1VO, Object insert2VO, String dbAlias1, String dbAlias2) : " + e.toString());
            throw new RemoteException("RemoteException thrown in UserExample2SLSBFacadeBean.insertInTwoDB(Object insert1VO, Object insert2VO, String dbAlias1, String dbAlias2) " + e.toString(),e);
        }
    }

    public void insertInTwoDBAndRollback(Object insert1VO, Object insert2VO, String dbAlias1, String dbAlias2) throws RemoteException{
        try {
            ServiceFacade serviceFacade = getServiceFacade();
            MandragoraContext localSession = (MandragoraContext)((ContextHandler)serviceFacade).getLocalSession();

            localSession.put("jcdAlias",dbAlias1);
            serviceFacade.insert(insert1VO);

            localSession.put("jcdAlias",dbAlias2);
            serviceFacade.insert(insert2VO);

            localSession.put("jcdAlias",dbAlias1);
            Object testInserted1VO = serviceFacade.findObjectByTemplate(insert1VO);
            log.info("UserExample2SLSBFacadeBean.iinsertInTwoDBAndRollback(Object insert1VO, Object insert2VO, String dbAlias1, String dbAlias2) : testInserted1VO is :"+testInserted1VO.toString());

            localSession.put("jcdAlias",dbAlias2);
            Object testInserted2VO = serviceFacade.findObjectByTemplate(insert2VO);
            log.info("UserExample2SLSBFacadeBean.insertInTwoDBAndRollback(Object insert1VO, Object insert2VO, String dbAlias1, String dbAlias2)  : testInserted2VO is :"+testInserted2VO.toString());
            sc.setRollbackOnly();
        } catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in UserExample2SLSBFacadeBean.insertInTwoDBAndRollback(Object insert1VO, Object insert2VO, String dbAlias1, String dbAlias2) : " + e.toString());
            throw new RemoteException("RemoteException thrown in UserExample2SLSBFacadeBean.insertInTwoDBAndRollback(Object insert1VO, Object insert2VO, String dbAlias1, String dbAlias2)  " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception caught in UserExample2SLSBFacadeBean.insertInTwoDBAndRollback(Object insert1VO, Object insert2VO, String dbAlias1, String dbAlias2) : " + e.toString());
            throw new RemoteException("RemoteException thrown in UserExample2SLSBFacadeBean.insertInTwoDBAndRollback(Object insert1VO, Object insert2VO, String dbAlias1, String dbAlias2)  " + e.toString(),e);
        }
    }




}