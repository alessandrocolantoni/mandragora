package it.aco.mandragora.userExample.serviceFacade.context.sessionFacade.remoteFacade.SLSB;

import javax.ejb.EJBHome;
import javax.ejb.CreateException;
import java.rmi.RemoteException;


public interface  ContextUserExampleSLSBFacadeHome  extends EJBHome {

    ContextUserExampleSLSBFacade create() throws RemoteException, CreateException;

}