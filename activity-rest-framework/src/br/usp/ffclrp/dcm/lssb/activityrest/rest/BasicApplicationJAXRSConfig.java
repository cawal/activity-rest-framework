package br.usp.ffclrp.dcm.lssb.activityrest.rest;

import java.util.Set;

import javax.ws.rs.core.Application;

public class BasicApplicationJAXRSConfig extends Application {
	
	public BasicApplicationJAXRSConfig() {
		super();
		
		
	}
	
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
		// add here all classes with JAX-RS annotations
		resources.add(
				br.usp.ffclrp.dcm.lssb.activityrest.rest.providers.messagebodyparsers.xml.AnalysisActivityXMLMessageBodyWriter.class);
		
		resources.add(
				br.usp.ffclrp.dcm.lssb.activityrest.rest.providers.messagebodyparsers.xml.ParameterMessageBodyReader.class);
		
		// Filter for allowing Cross-Origin Resource Sharing
		resources.add(
				br.usp.ffclrp.dcm.lssb.activityrest.rest.providers.CorsFilter.class);
		
		// for auto-generate swagger descriptions
		resources.add(io.swagger.jaxrs.listing.ApiListingResource.class);
		resources.add(io.swagger.jaxrs.listing.SwaggerSerializers.class);
		
		// for HAL-JSON Support
		// resources.add(HalJsonFromObjectMessageBodyWriter.class);
		// resources.add(HalJsonToObjectMessageBodyReader.class);
		
		return resources;
	}
	
}
