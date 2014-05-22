package it.aco.mandragora.userExample.serviceFacade;

import it.aco.mandragora.exception.ServiceFacadeException;
import it.aco.mandragora.serviceFacade.ServiceFacade;


public interface UserExampleServiceFacade extends ServiceFacade {

    public void insertUpdateAndDelete(Object insertVO, Object updateVO, Object deleteVO) throws ServiceFacadeException;;
}
