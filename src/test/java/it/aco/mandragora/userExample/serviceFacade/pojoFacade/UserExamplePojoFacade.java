package it.aco.mandragora.userExample.serviceFacade.pojoFacade;

import it.aco.mandragora.userExample.serviceFacade.UserExampleServiceFacade;
import it.aco.mandragora.serviceFacade.pojoFacade.PojoFacade;
import it.aco.mandragora.exception.ServiceFacadeException;
import it.aco.mandragora.exception.DataAccessException;
import it.aco.mandragora.dao.DAO;

public class UserExamplePojoFacade extends PojoFacade implements UserExampleServiceFacade {



    protected static UserExamplePojoFacade userExamplePojoFacade = null;

    private static org.apache.log4j.Category log = org.apache.log4j.Logger.getLogger(UserExamplePojoFacade.class.getName());

    static {
        try {
            if (userExamplePojoFacade!=null) throw new ServiceFacadeException("thrown in the static block of UserExamplePojoFacade: static instance is already set");
            userExamplePojoFacade = new UserExamplePojoFacade();
        }catch (Exception e){
            throw new RuntimeException("Exception thrown in the static block of UserExamplePojoFacade "+ e.toString(),e);
        }

        ApplicationServiceFactoryClassName = "UserExamplePojoFacade.ApplicationServiceFactoryClass" ;
        ApplicationServiceClassName = "UserExamplePojoFacade.ApplicationServiceClass" ;

        DAOFactoryClassName = "UserExamplePojoFacade.DAOFactoryClass" ;
        DAOClassName =   "UserExamplePojoFacade.DAOClass" ;
    }

    protected UserExamplePojoFacade() {
    }

    public static PojoFacade getInstance() {/*It has to return PojoFacade to not clash with getInstance of PojoFacade */
        return userExamplePojoFacade;
    }




    public void insertUpdateAndDelete(Object insertVO, Object updateVO, Object deleteVO) throws ServiceFacadeException {
        try {
            DAO dao = getDAO();
            dao.insert(insertVO);
            dao.update(updateVO);
            dao.delete(deleteVO);
        } catch (DataAccessException e) {
            log.error("DataAccessException caught in UserExamplePojoFacade.insertUpdateAndDelete(Object insertVO, Object updateVO, Object deleteVO): " + e.toString());
            throw new ServiceFacadeException("ServiceFacadeException thrown in UserExamplePojoFacade.insertUpdateAndDelete(Object insertVO, Object updateVO, Object deleteVO)" + e.toString(),e);
        } catch (Exception e) {
            log.error("Exception caught in UserExamplePojoFacade.insertUpdateAndDelete(Object insertVO, Object updateVO, Object deleteVO): " + e.toString());
            throw new ServiceFacadeException("ServiceFacadeException thrown in UserExamplePojoFacade.insertUpdateAndDelete(Object insertVO, Object updateVO, Object deleteVO)" + e.toString(),e);
        }
    }

}
