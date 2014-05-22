package it.aco.mandragora.exception;


public class ServiceFacadeFactoryException extends MandragoraException {
    Throwable exceptionCause = null;

    public ServiceFacadeFactoryException() {
        super();
    }

    /** Creates a new instance of ServiceFacadeFactoryException */
    public ServiceFacadeFactoryException(String exceptionMsg) {
        super(exceptionMsg);
    }

    public ServiceFacadeFactoryException(String exceptionMsg, Throwable exception){
       super(exceptionMsg,exception);
    }
}