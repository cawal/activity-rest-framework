package br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.impl;

import java.util.HashMap;
import java.util.Map;

import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.Job;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.JobFactory;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.exceptions.JobCreationFail;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.exceptions.NonSupportedFunctionalEntity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineTool;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.FunctionalEntity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.CommandLineToolImpl;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity;

/**
 * This is a utility class for creating a Job for different 
 * types of FunctionalEntities in the AADM metamodel.
 * More JobBuilders can be added in future.
 * @author cawal
 */
public class JobFactoryImpl implements JobFactory {
	
	Map<Class<? extends FunctionalEntity>,Class<? extends JobBuilder>> builderMap = new HashMap<>();
	
	public JobFactoryImpl() {
		builderMap.put(CommandLineToolImpl.class, CommandLineJobBuilder.class);
	}
	
	public Job createJob(AnalysisActivity activityInstance, 
						FunctionalEntity toolDescription) 
		throws JobCreationFail {
		
		try {
			Job job = null;
			
			Class<?> builderClass = builderMap.get(toolDescription.getClass());
			
			if(builderClass == null) {
				throw new NonSupportedFunctionalEntity(toolDescription.getClass());
			}
			
			JobBuilder builder = (JobBuilder) builderClass.newInstance();
			job = builder.create(activityInstance, toolDescription);
			
			return job;
		} catch (Exception e) {
			throw new JobCreationFail("Job creation fail for activity instance",e);
		}
	}
	
}
