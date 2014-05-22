package it.aco.mandragora.exception;

/**
 *
 * todo     Need to Javadoc this
 */
public class ServiceFacadeException extends Exception {
    Throwable exceptionCause = null;
    
    
    /** Creates a new instance of BusinessObjectException */
    public ServiceFacadeException(String exceptionMsg) {
        super(exceptionMsg);
    }
    
    public ServiceFacadeException(String exceptionMsg, Throwable exception){
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