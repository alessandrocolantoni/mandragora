package it.aco.mandragora.exception;

/**
 *
 * @author  John Carnell
 * @todo     Need to Javadoc this
 */
public class DataAccessException extends Exception {
    Throwable exceptionCause = null;
    
    
    /** Creates a new instance of DataAccessException */
    public DataAccessException(String exceptionMsg) {
        super(exceptionMsg);
    }
    
    public DataAccessException(String exceptionMsg, Throwable exception){
       super(exceptionMsg);   
       exceptionCause = exception;
        exception.printStackTrace(); // added by alessandro on 12-01-2003
    }
    
    public void printStackTrace(){
        if (exceptionCause!=null){
           System.err.println("An exception has been caused by: ");
           exceptionCause.printStackTrace();
        }
        
    }
    
    
    
}