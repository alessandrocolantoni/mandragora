package it.aco.mandragora.userExample.serviceFacade.sessionFacade.remoteFacade.SLSB.userExample;

import javax.ejb.EJBObject;
import java.rmi.RemoteException;

public interface UserExampleSLSBFacade extends EJBObject {

    public void insertTwoValueobjects(Object insert1VO, Object insert2VO) throws RemoteException;
    public void insertAndUpdate(Object insertVO, Object updateVO) throws RemoteException;
    public void insertTwoValueobjectsAndRollback(Object insert1VO, Object insert2VO) throws RemoteException;
    public void insertUpdateAndDelete(Object insertVO, Object updateVO, Object deleteVO)throws RemoteException;
}
