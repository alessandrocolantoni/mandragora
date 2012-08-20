package it.aco.mandragora.exception;


public class PersistenceBrokerSupportFactoryException extends MandragoraException {
    Throwable exceptionCause = null;

    public PersistenceBrokerSupportFactoryException() {
        super();
    }

    /** Creates a new instance of PersistenceBrokerSupportFactoryException */
    public PersistenceBrokerSupportFactoryException(String exceptionMsg) {
        super(exceptionMsg);
    }

    public PersistenceBrokerSupportFactoryException(String exceptionMsg, Throwable exception){
       super(exceptionMsg,exception);
    }
}