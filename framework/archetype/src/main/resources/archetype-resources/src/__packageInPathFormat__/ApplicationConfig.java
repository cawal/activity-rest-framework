#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};


import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.ws.rs.ApplicationPath;

import br.usp.ffclrp.dcm.lssb.activityrest.dao.FileSystemActivityRepository;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.ActivityRestConfig;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.BasicApplicationJAXRSConfig;
import br.usp.ffclrp.dcm.lssb.activityrest.util.ModelsService;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;

@ApplicationPath("/")
public class ApplicationConfig extends BasicApplicationJAXRSConfig {
	
	final String ACTIVITYREST_PROPERTIES = "activityrest.properties";
	static final String ACTIVITY_DESCRIPTION = "activity.aadl";

	ActivityRestConfig config;
	
	public ApplicationConfig() {
		super();

		this.config = new ActivityRestConfig();
		try {
			Activity activityModel = ModelsService.retrieveAADLModel(
					this.getClass().getResourceAsStream(
							ACTIVITY_DESCRIPTION));
			
			this.config.setActivityModel(activityModel);
			Properties deploymentProperties = new Properties();
			deploymentProperties.load(
					this.getClass().getResourceAsStream(ACTIVITYREST_PROPERTIES));
			
			File nonExecutedActivityStorage = 
					new File(deploymentProperties.getProperty("activityrest.repositories.nonExecuted"));
			this.config.setNewAnalysisRepository(
					new FileSystemActivityRepository(nonExecutedActivityStorage, activityModel));
			
			File runningActivityStorage = 
					new File(deploymentProperties.getProperty("activityrest.repositories.running"));
			this.config.setRunningAnalysisRepository(
					new FileSystemActivityRepository(runningActivityStorage, activityModel));
			
			File failedActivityStorage = 
					new File(deploymentProperties.getProperty("activityrest.repositories.failed"));
			this.config.setFailedAnalysisRepository(
					new FileSystemActivityRepository(failedActivityStorage, activityModel));
			
			File succeededActivityStorage = 
					new File(deploymentProperties.getProperty("activityrest.repositories.succeeded"));
			this.config.setSuccededAnalysisRepository(
					new FileSystemActivityRepository(succeededActivityStorage, activityModel));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = super.getClasses();
		
		// add here all classes with JAX-RS annotations
		
		return resources;
	}
	
	@Override
	public Map<String, Object> getProperties() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("activityrest.config", this.config);
		return map;
	}
	
}
