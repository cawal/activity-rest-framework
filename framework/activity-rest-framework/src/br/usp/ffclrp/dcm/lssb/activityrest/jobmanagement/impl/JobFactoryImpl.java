package br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.impl;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.Job;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.JobBuilder;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.JobFactory;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.exceptions.JobCreationFail;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.exceptions.NonSupportedFunctionalEntity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.FunctionalEntity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.impl.CommandLineToolImpl;

/**
 * This is a utility class for creating a Job for different
 * types of FunctionalEntities in the AADM metamodel.
 * More JobBuilders can be added in future.
 * 
 * @author cawal
 */
public class JobFactoryImpl implements JobFactory {
	
	/**
	 * This map is used to associate a given FunctionalEntity subclass (in the
	 * Analysis Activity Description Language) and the JobBuilder subclass that
	 * creates the suitable Job instance for this FunctionalEntity.
	 */
	Map<Class<? extends FunctionalEntity>, Class<? extends JobBuilder>> builderMap =
			new HashMap<>();
	
	public JobFactoryImpl() {
		builderMap.put(CommandLineToolImpl.class, CommandLineJobBuilder.class);
	}
	
	/**
	 * Create a suitable Job for a given AnalysisActivity instance based in the
	 * description of the FunctionalEntity.
	 * 
	 * @param activityInstance
	 *            the instance containing values for input datasets
	 *            and execution parameters
	 * @param toolDescription
	 *            the Analysis Activity Description Language model's
	 *            FunctionalEntity description that denotes how the analysis
	 *            activity instance
	 *            must be executed.
	 * @param workingDirectory
	 *            The working directory to be used during the execution.
	 * 
	 * @return A Job instance that may be executed and observed.
	 * 
	 * @throws JobCreationFail
	 *             if no builder was found for the given FunctionalEntity
	 *             description or if the information in the AnalysisActivity
	 *             instance is not valid according to the
	 *             FunctionalEntity description.
	 */
	public Job createJob(AnalysisActivity activityInstance,
			FunctionalEntity toolDescription,
			File workingDirectory)
			throws JobCreationFail {
		
		try {
			Job job = null;
			
			Class<?> builderClass = builderMap.get(toolDescription.getClass());
			
			if (builderClass == null) {
				throw new NonSupportedFunctionalEntity(
						toolDescription.getClass());
			}
			// some reflexive access to create the builder
			JobBuilder builder = (JobBuilder) builderClass.newInstance();
			job = builder.create(activityInstance, toolDescription,
					workingDirectory);
			
			return job;
		} catch (Exception e) {
			throw new JobCreationFail("Job creation fail for activity instance",
					e);
		}
	}
	
}
