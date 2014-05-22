package it.aco.mandragora.userExample.bd;

import it.aco.mandragora.bd.BD;
import it.aco.mandragora.exception.ApplicationException;


public interface UserExample2BD extends BD {


    public void insertInTwoDB(Object insert1VO, Object insert2VO, String dbAlias1, String dbAlias2) throws ApplicationException;
    public void insertInTwoDBAndRollback(Object insert1VO, Object insert2VO, String dbAlias1, String dbAlias2) throws ApplicationException;


}
