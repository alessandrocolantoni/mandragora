package it.aco.mandragora.exception;


public class MethodInterceptorException extends MandragoraException {

    public MethodInterceptorException() {
        super();
    }

    /** Creates a new instance of MethodInterceptorException */
    public MethodInterceptorException(String exceptionMsg) {
        super(exceptionMsg);
    }

    public MethodInterceptorException(String exceptionMsg, Throwable exception){
       super(exceptionMsg,exception);
    }

}