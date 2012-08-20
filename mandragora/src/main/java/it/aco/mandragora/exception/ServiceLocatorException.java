package it.aco.mandragora.exception;

import it.aco.mandragora.exception.ApplicationException;

/**
 *    This is an application exception that would be captured by the front-end.
 *    It is used to alert the application that the ServiceLocator class ran into
 *    an exception while trying to locate a resource requested by the end-user.
 *
 *    @author  John Carnell
 */
public class ServiceLocatorException extends ApplicationException {
    Throwable exceptionCause = null;
    
    /** Creates a new instance of ServiceLocatorException */
    public ServiceLocatorException(String msg) {
        super(msg);
    }
    
    public ServiceLocatorException(String msg, Throwable exception){
      super(msg, exception);   
      exceptionCause = exception;
    }
    
    /**Overriding the stack trace*/
    public void printStackTrace(){
      if (exceptionCause!=null){
        System.err.println("An exception has been caused by: " + exceptionCause.toString());
        exceptionCause.printStackTrace();
      }
    }
}