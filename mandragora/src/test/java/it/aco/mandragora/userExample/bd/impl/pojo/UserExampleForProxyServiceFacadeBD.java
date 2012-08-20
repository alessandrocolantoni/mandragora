package it.aco.mandragora.userExample.bd.impl.pojo;

import it.aco.mandragora.bd.BD;
import it.aco.mandragora.bd.impl.pojo.PojoManagerBD;
import it.aco.mandragora.exception.ApplicationException;


public class UserExampleForProxyServiceFacadeBD extends PojoManagerBD implements BD {

    protected static UserExampleForProxyServiceFacadeBD userExampleForProxyServiceFacadeBD = null;

    static {
        try {
            if (userExampleForProxyServiceFacadeBD!=null) throw new ApplicationException("thrown in the static block of UserExampleForProxyServiceFacadeBD: static instance is already set");
            userExampleForProxyServiceFacadeBD = new UserExampleForProxyServiceFacadeBD();
        }catch (Exception e){
            throw new RuntimeException("Exception thrown in the static block of UserExampleForProxyServiceFacadeBD "+ e.toString(),e);
        }

        ServiceFacadeFactoryClassName = "UserExampleForProxyServiceFacadeBD.ServiceFacadeFactoryClass" ;
        ServiceFacadeClassName = "UserExampleForProxyServiceFacadeBD.ServiceFacadeClass" ;

    }
    protected UserExampleForProxyServiceFacadeBD(){
    }
    public static PojoManagerBD getInstance() {/*It has to return PojoManagerBD to not clash with getInstance of PojoManagerBD */
        return userExampleForProxyServiceFacadeBD;
    }
    /* overwrite the methods you want of PojoManagerBD*/

   /* implements the methods of UserBD not present in BD*/
}