package it.aco.mandragora.userExample.serviceFacade.sessionFacade.remoteFacade.SLSB.userExample2;


import javax.ejb.CreateException;
import javax.ejb.EJBHome;
import java.rmi.RemoteException;

public interface UserExample2SLSBFacadeHome extends EJBHome {


    UserExample2SLSBFacade create() throws RemoteException,CreateException;



}