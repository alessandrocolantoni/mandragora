package it.aco.mandragora.exception;

import org.apache.commons.lang.exception.NestableException;


//public class MandragoraException extends Exception {
public class MandragoraException extends NestableException {
    Throwable exceptionCause = null;

    public MandragoraException() {
        super();
    }
    
    /** Creates a new instance of MandragoraException */
    public MandragoraException(String exceptionMsg) {
        super(exceptionMsg);
    }
    
    public MandragoraException(String exceptionMsg, Throwable exception){
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