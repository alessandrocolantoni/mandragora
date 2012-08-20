package it.aco.mandragora.userExample.serviceFacade.sessionFacade.remoteFacade.SLSB.userExample;


import javax.ejb.CreateException;
import javax.ejb.EJBHome;
import java.rmi.RemoteException;

public interface UserExampleSLSBFacadeHome extends EJBHome {


    UserExampleSLSBFacade create() throws RemoteException,CreateException;



}