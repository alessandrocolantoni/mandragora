package it.aco.mandragora.exception;

/**
 *
 * @author  Alessandro Colantoni
 * @todo     Need to Javadoc this
 */
public class OjbPbCoreException extends Exception {
    Throwable exceptionCause = null;
    
    
    /** Creates a new instance of DataAccessException */
    public OjbPbCoreException(String exceptionMsg) {
        super(exceptionMsg);
    }
    
    public OjbPbCoreException(String exceptionMsg, Throwable exception){
       super(exceptionMsg);   
       exceptionCause = exception;
    }
    
    public void printStackTrace(){
        if (exceptionCause!=null){
           System.err.println("An exception has been caused by: ");
           exceptionCause.printStackTrace();
        }
        
    }
    
    
    
}