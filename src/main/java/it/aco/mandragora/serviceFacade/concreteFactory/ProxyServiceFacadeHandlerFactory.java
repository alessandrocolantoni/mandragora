package it.aco.mandragora.serviceFacade.concreteFactory;

import it.aco.mandragora.serviceFacade.ServiceFacade;
import it.aco.mandragora.serviceFacade.ServiceFacadeFactory;
import it.aco.mandragora.exception.ServiceFacadeFactoryException;
import it.aco.mandragora.common.ServiceLocator;
import it.aco.mandragora.util.configuration.impl.MandragoraConfigurator;
import it.aco.mandragora.context.ContextHandler;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.Enhancer;
import org.apache.ojb.broker.util.configuration.Configurator;
import org.apache.ojb.broker.util.configuration.Configuration;


public class ProxyServiceFacadeHandlerFactory extends ServiceFacadeFactory {

    private static ProxyServiceFacadeHandlerFactory proxyServiceFacadeHandlerFactory;
    static {
        proxyServiceFacadeHandlerFactory = new ProxyServiceFacadeHandlerFactory();
    }

    private ProxyServiceFacadeHandlerFactory(){
	}

    public static ProxyServiceFacadeHandlerFactory getInstance(){
        return proxyServiceFacadeHandlerFactory;
    }

    private org.apache.log4j.Category log =org.apache.log4j.Logger.getLogger(ProxyServiceFacadeHandlerFactory.class.getName());


   /**
   * TODO: use MandragoraOjbPb.properties,MandragoraOjbPbConfiguration,MandragoraOjbPbConfigurator
   * This method returns the implementation of the interface {@link ServiceFacade} specified by the input string <code>serviceFacadeClassName</code>.<br/>
   * The implementation returned is a Proxy instance built with the CGlib framework.
   * The proxy instance holds a {@link MethodInterceptor} implementation looked up by the method {@link ServiceLocator#getMethodInterceptor(String methodInterceptorFactoryClassName, String methodInterceptorClassName)},
   * where: <br/>
   * <code>methodInterceptorFactoryClassName = "ProxyServiceFacadeHandlerFactory."+serviceFacadeClassName+".methodInterceptorFactoryClassName"</code> and <br/>
   * <code>methodInterceptorClassName = "ProxyServiceFacadeHandlerFactory."+serviceFacadeClassName+".methodInterceptorClassName"</code><br/>
   * <br/>
   * The proxy instance implementation of BD will be a subclass of the class {@link ContextHandler}br/> and will implement
   * all the interface of the class specified by the mapping entry of <code>bdClassName</code> in <code>Mandragora.properties</code>
   * <br/>
   * @param serviceFacadeClassName Specifies the implementation of interface {@link ServiceFacade} to return.
   * @return Will be returned the value mapped in <code>Mandragora.properties</code> with <code>serviceFacadeClassName</code>
   * @throws ServiceFacadeFactoryException
   */
    public ServiceFacade getServiceFacade(String serviceFacadeClassName) throws ServiceFacadeFactoryException {
        ServiceFacade serviceFacade;
        try{
            log.info("ProxyServiceFacadeHandlerFactory.getServiceFacade(String serviceFacadeClassName) : serviceFacadeClassName = "+serviceFacadeClassName);
            MethodInterceptor methodInterceptor = ServiceLocator.getInstance().getMethodInterceptor("ProxyServiceFacadeHandlerFactory."+serviceFacadeClassName+".methodInterceptorFactoryClassName","ProxyServiceFacadeHandlerFactory."+serviceFacadeClassName+".methodInterceptorClassName");
            Configurator configurator = MandragoraConfigurator.getInstance();
            Configuration config = configurator.getConfigurationFor(null);
            Class  realServiceFacadeClass = config.getClass("ProxyServiceFacadeHandlerFactory."+serviceFacadeClassName+".realServiceFacadeClassName", null);

            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(ContextHandler.class);
            enhancer.setInterfaces(realServiceFacadeClass.getInterfaces());
            enhancer.setCallback(methodInterceptor);
            serviceFacade = (ServiceFacade)enhancer.create();

        }catch(Exception e){
            throw new ServiceFacadeFactoryException("Error in  ProxyServiceFacadeHandlerFactory.getServiceFacade(String serviceFacadeClassName) : " + e.toString(),e);
        }
        return serviceFacade;
    }


    /**
     *  This method acts as <code>getBD("ProxyBDHandlerDefaultClass")</code>; see {@link #getServiceFacade(String serviceFacadeClassName)};
     * @return  getServiceFacade("ProxyServiceFacadeHandlerDefaultClass"); see {@link #getServiceFacade(String serviceFacadeClassName)}
     * @throws ServiceFacadeFactoryException
     */
    public ServiceFacade getServiceFacade()throws ServiceFacadeFactoryException {
        return getServiceFacade("ProxyServiceFacadeHandlerDefaultClass");
    }
}
