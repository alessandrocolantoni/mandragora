package it.aco.mandragora.exception;


public class ApplicationServiceException extends MandragoraException {
    Throwable exceptionCause = null;

    public ApplicationServiceException() {
        super();
    }

    /** Creates a new instance of ApplicationServiceException */
    public ApplicationServiceException(String exceptionMsg) {
        super(exceptionMsg);
    }

    public ApplicationServiceException(String exceptionMsg, Throwable exception){
       super(exceptionMsg,exception);
    }
}