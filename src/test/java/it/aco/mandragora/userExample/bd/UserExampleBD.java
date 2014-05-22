package it.aco.mandragora.userExample.bd;

import it.aco.mandragora.exception.ApplicationException;
import it.aco.mandragora.bd.BD;


public interface UserExampleBD extends BD {
    
    public void insertTwoValueobjects(Object insert1VO, Object insert2VO)   throws ApplicationException;
    public void insertAndUpdate(Object insertVO, Object updateVO)   throws ApplicationException;
    public void insertTwoValueobjectsAndRollback(Object insert1VO, Object insert2VO) throws   ApplicationException;
    public void insertUpdateAndDelete(Object insertVO, Object updateVO, Object deleteVO)  throws ApplicationException;
}
