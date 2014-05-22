package it.aco.mandragora.exception;


public class ApplicationServiceFactoryException extends MandragoraException {
    Throwable exceptionCause = null;

    public ApplicationServiceFactoryException() {
        super();
    }

    /** Creates a new instance of ApplicationServiceFactoryException */
    public ApplicationServiceFactoryException(String exceptionMsg) {
        super(exceptionMsg);
    }

    public ApplicationServiceFactoryException(String exceptionMsg, Throwable exception){
       super(exceptionMsg,exception);
    }
}