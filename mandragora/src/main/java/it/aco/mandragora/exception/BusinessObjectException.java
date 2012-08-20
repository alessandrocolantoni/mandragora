package it.aco.mandragora.exception;

/**
 *
 *  todo     Need to Javadoc this
 */
public class BusinessObjectException extends Exception {
    Throwable exceptionCause = null;
    
    
    /** Creates a new instance of BusinessObjectException */
    public BusinessObjectException(String exceptionMsg) {
        super(exceptionMsg);
    }
    
    public BusinessObjectException(String exceptionMsg, Throwable exception){
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