package it.aco.mandragora.userExample.serviceFacade.sessionFacade.remoteFacade.SLSB.userExample;

import it.aco.mandragora.serviceFacade.ServiceFacade;
import it.aco.mandragora.userExample.serviceFacade.UserExampleServiceFacade;
import it.aco.mandragora.exception.ServiceLocatorException;
import it.aco.mandragora.exception.ServiceFacadeException;
import it.aco.mandragora.common.ServiceLocator;

import javax.ejb.SessionContext;
import javax.ejb.SessionBean;
import java.rmi.RemoteException;


public class UserExampleSLSBFacadeBean  implements SessionBean {


    private SessionContext sc;
    protected static String ServiceFacadeFactoryClassName = "UserExampleSLSBFacadeBean.ServiceFacadeFactoryClass" ;
    protected static String ServiceFacadeClassName = "UserExampleSLSBFacadeBean.ServiceFacadeClass" ;


    static private org.apache.log4j.Category log = org.apache.log4j.Logger.getLogger(UserExampleSLSBFacadeBean.class.getName());
    public UserExampleSLSBFacadeBean(){}

    public void ejbCreate(){}
    public void ejbRemove(){}
    public void ejbActivate(){}
    public void ejbPassivate(){}
    public void setSessionContext(SessionContext sc){this.sc=sc; }







    protected ServiceFacade getServiceFacade()throws RemoteException {
        try{
            return ServiceLocator.getInstance().getServiceFacade(ServiceFacadeFactoryClassName,ServiceFacadeClassName);
        }catch (ServiceLocatorException e) {
            log.error("ServiceLocatorException caught in UserExampleSLSBFacadeBean.getContextServiceFacade(): " + e.toString());
            throw new RemoteException("RemoteException thrown in UserExampleSLSBFacadeBean.getContextServiceFacade()" + e.toString(),e);
        }
    }


    public void insertTwoValueobjects(Object insert1VO, Object insert2VO) throws RemoteException{
        try {
            ServiceFacade serviceFacade = getServiceFacade();
            serviceFacade.insert(insert1VO);
            serviceFacade.insert(insert2VO);
        } catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in UserExampleSLSBFacadeBean.insertTwoValueobjects(Object insert1VO, Object insert2VO) : " + e.toString());
            throw new RemoteException("RemoteException thrown in UserExampleSLSBFacadeBean.insertTwoValueobjects(Object insert1VO, Object insert2VO) " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception caught in UserExampleSLSBFacadeBean.insertTwoValueobjects(Object insert1VO, Object insert2VO): " + e.toString());
            throw new RemoteException("RemoteException thrown in UserExampleSLSBFacadeBean.insertTwoValueobjects(Object insert1VO, Object insert2VO) " + e.toString(),e);
        }
    }




    public void insertAndUpdate(Object insertVO, Object updateVO) throws RemoteException{
        try {
            ServiceFacade serviceFacade = getServiceFacade();
            serviceFacade.insert(insertVO);
            serviceFacade.update(updateVO);
        } catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in UserExampleSLSBFacadeBean.insertAndUpdate(Object insertVO, Object updateVO) : " + e.toString());
            throw new RemoteException("RemoteException thrown in UserExampleSLSBFacadeBean.insertAndUpdate(Object insertVO, Object updateVO) " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception caught in UserExampleSLSBFacadeBean.insertAndUpdate(Object insertVO, Object updateVO): " + e.toString());
            throw new RemoteException("RemoteException thrown in UserExampleSLSBFacadeBean.insertAndUpdate(Object insertVO, Object updateVO) " + e.toString(),e);
        }
    }


    public void insertTwoValueobjectsAndRollback(Object insert1VO, Object insert2VO) throws RemoteException{
        try {
            ServiceFacade serviceFacade = getServiceFacade();
            serviceFacade.insert(insert1VO);
            serviceFacade.insert(insert2VO);
            Object testInserted1VO = serviceFacade.findObjectByTemplate(insert1VO);
            log.info("UserExampleSLSBFacadeBean.insertTwoValueobjectsAndRollback(Object insert1VO, Object insert2VO) : testInserted1VO is :"+testInserted1VO.toString());
            Object testInserted2VO = serviceFacade.findObjectByTemplate(insert2VO);
            log.info("UserExampleSLSBFacadeBean.insertTwoValueobjectsAndRollback(Object insert1VO, Object insert2VO) : testInserted2VO is :"+testInserted2VO.toString());
            sc.setRollbackOnly();
        } catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in UserExampleSLSBFacadeBean.insertTwoValueobjectsAndRollback(Object insert1VO, Object insert2VO) : " + e.toString());
            throw new RemoteException("RemoteException thrown in UserExampleSLSBFacadeBean.insertTwoValueobjectsAndRollback(Object insert1VO, Object insert2VO) " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception caught in UserExampleSLSBFacadeBean.insertTwoValueobjectsAndRollback(Object insert1VO, Object insert2VO): " + e.toString());
            throw new RemoteException("RemoteException thrown in UserExampleSLSBFacadeBean.insertTwoValueobjectsAndRollback(Object insert1VO, Object insert2VO) " + e.toString(),e);
        }
    }

    public void insertUpdateAndDelete(Object insertVO, Object updateVO, Object deleteVO) throws RemoteException{
        try {
            UserExampleServiceFacade serviceFacade = (UserExampleServiceFacade)getServiceFacade();
            serviceFacade.insertUpdateAndDelete(insertVO, updateVO, deleteVO);

        } catch (ServiceFacadeException e) {
            log.error("ServiceFacadeException caught in UserExampleSLSBFacadeBean.insertUpdateAndDelete(Object insertVO, Object updateVO, Object deleteVO) : " + e.toString());
            throw new RemoteException("RemoteException thrown in UserExampleSLSBFacadeBean.insertUpdateAndDelete(Object insertVO, Object updateVO, Object deleteVO) " + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception caught in UserExampleSLSBFacadeBean.insertUpdateAndDelete(Object insertVO, Object updateVO, Object deleteVO): " + e.toString());
            throw new RemoteException("RemoteException thrown in UserExampleSLSBFacadeBean.insertUpdateAndDelete(Object insertVO, Object updateVO, Object deleteVO) " + e.toString(),e);
        }
    }


}
