package it.aco.mandragora.userExample.bd.context;

import it.aco.mandragora.bd.context.ContextBD;
import it.aco.mandragora.exception.ApplicationException;
import org.apache.commons.chain.Context;


public interface UserExample2ContextBD extends ContextBD {

    public void insertInTwoDB(Context context)throws ApplicationException;


}
