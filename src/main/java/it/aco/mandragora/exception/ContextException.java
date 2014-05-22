package it.aco.mandragora.exception;


public class ContextException extends MandragoraException {

    public ContextException() {
        super();
    }

    /** Creates a new instance of ContextException */
    public ContextException(String exceptionMsg) {
        super(exceptionMsg);
    }

    public ContextException(String exceptionMsg, Throwable exception){
       super(exceptionMsg,exception);
    }

}