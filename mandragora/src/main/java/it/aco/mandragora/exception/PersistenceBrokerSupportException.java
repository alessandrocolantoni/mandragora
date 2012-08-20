package it.aco.mandragora.exception;


public class PersistenceBrokerSupportException extends MandragoraException {

    public PersistenceBrokerSupportException() {
        super();
    }

    /** Creates a new instance of PersistenceBrokerSupportException */
    public PersistenceBrokerSupportException(String exceptionMsg) {
        super(exceptionMsg);
    }

    public PersistenceBrokerSupportException(String exceptionMsg, Throwable exception){
       super(exceptionMsg,exception);
    }

}