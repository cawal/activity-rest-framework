package br.usp.ffclrp.dcm.lssb.activityrest.bootstrap.server;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;


@ApplicationPath("/")
public class ApplicationConfig extends Application {
;
	
	
	public ApplicationConfig() {
		super();
		System.err.println("==========================================================================");
	}

	public Set<Class<?>> getClasses(){
		Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
		resources.add(br.usp.ffclrp.dcm.lssb.activityrest.bootstrap.server.RootEndpoint.class);
		return resources;
	}
	
	
}
