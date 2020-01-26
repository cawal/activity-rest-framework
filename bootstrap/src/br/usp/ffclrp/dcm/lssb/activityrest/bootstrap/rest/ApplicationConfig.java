package br.usp.ffclrp.dcm.lssb.activityrest.bootstrap.rest;

import java.util.Collections;
import java.util.Optional;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")  

public class ApplicationConfig extends Application { 
	
	public ApplicationConfig() {
		super();
		System.out.println("HEY"); 
		System.out.println("HEY"); 
		System.out.println("HEY");  
		System.out.println("HEY");  
	}
	
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new java.util.HashSet<Class<?>>();

		// add here all classes with JAX-RS annotations
		resources.addAll(this.getSupportClasses());
//		resources.addAll(this.getXMLMessageBodyProviders());
		resources.add(br.usp.ffclrp.dcm.lssb.activityrest
				.bootstrap.rest.endpoints.RootResource.class);
//		
//		// user extensions 
//		Optional<Set<Class<?>>> classesExtension = 	this.getExtensionClasses();
//		resources.addAll(classesExtension.orElse(Collections.emptySet()));
		
		return resources;
	}
	
	public Set<Class<?>> getSupportClasses(){
		Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
//		
//		// allow cross-site requests
		resources.add(
				br.usp.ffclrp.dcm.lssb.activityrest.bootstrap.rest.providers.CorsFilter.class);
//		
//		// for auto-generate swagger descriptions
//		resources.add(io.swagger.jaxrs.listing.ApiListingResource.class);
//		resources.add(io.swagger.jaxrs.listing.SwaggerSerializers.class);
		
		return resources;
	}
	
	private Set<Class<?>> getXMLMessageBodyProviders(){
		Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
//		resources.add(
//				br.usp.ffclrp.dcm.lssb.activityrest.rest.providers.messagebodyparsers.xml.AnalysisActivityXMLMessageBodyWriter.class);
//		resources.add(
//				br.usp.ffclrp.dcm.lssb.activityrest.rest.providers.messagebodyparsers.xml.ParameterMessageBodyReader.class);
//		resources.add(
//				br.usp.ffclrp.dcm.lssb.activityrest.rest.providers.messagebodyparsers.xml.JobInstanceXMLMessageBodyWriter.class);
//		resources.add(
//				br.usp.ffclrp.dcm.lssb.activityrest.rest.providers.messagebodyparsers.xml.FileRepresentationXMLMessageBodyWriter.class);
		return resources;
	}
	
	public Optional<Set<Class<?>>> getExtensionClasses(){
		return Optional.empty();
	}
	

	public Optional<Set<Class<?>>> getExtensionSingletons(){
		return Optional.empty();
	}
	
	@Override
	public Set<Object> getSingletons() {
		Set<Object> singletons = super.getSingletons();
		

		Optional<Set<Class<?>>> userExtensions = this.getExtensionSingletons();
		singletons.addAll(userExtensions.orElse(Collections.emptySet()));
		
		return singletons;
	}
	
}
