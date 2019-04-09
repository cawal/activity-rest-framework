#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.usp.ffclrp.dcm.lssb.activityrest.rest.BasicApplicationJAXRSConfig;
import io.swagger.jaxrs.config.BeanConfig;

@ApplicationPath("/")
public class ApplicationConfig extends BasicApplicationJAXRSConfig {
	
	public ApplicationConfig() {
		super();
		
	}
	
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = super.getClasses();
		
		// add here all classes with JAX-RS annotations
		resources.add(${package}.RootResource.class);
		
		return resources;
	}
	
}
