package it.aco.mandragora.userExample.serviceFacade.sessionFacade.remoteFacade.SLSB.userExample2;

import javax.ejb.EJBObject;
import java.rmi.RemoteException;

public interface UserExample2SLSBFacade extends EJBObject {

    public void insertInTwoDB(Object insert1VO, Object insert2VO, String dbAlias1, String dbAlias2) throws RemoteException;
    public void insertInTwoDBAndRollback(Object insert1VO, Object insert2VO, String dbAlias1, String dbAlias2) throws RemoteException;

}