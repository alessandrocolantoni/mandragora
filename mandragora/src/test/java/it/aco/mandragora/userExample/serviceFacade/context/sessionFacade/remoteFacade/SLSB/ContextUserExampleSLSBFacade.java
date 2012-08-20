package it.aco.mandragora.userExample.serviceFacade.context.sessionFacade.remoteFacade.SLSB;

import org.apache.commons.chain.Context;

import javax.ejb.EJBObject;
import java.rmi.RemoteException;


public interface ContextUserExampleSLSBFacade extends EJBObject {

    public void insertInTwoDB(Context context) throws RemoteException;

}





