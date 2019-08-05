package br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement;

import java.io.File;

import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.exceptions.JobCreationFail;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.FunctionalEntity;

/**
 * JobFactory provides the service of create an adequate Job instance for 
 * the activity instance and the FunctionalEntity call description
 * @author cawal
 *
 */
public interface JobFactory {
	
	/**
	 * Create an Job instance of the suitable Job subclass for the FunctionalEntity.
	 * @param activityInstance The AnalysisActivity instance with the parameter values and datasets
	 * @param toolDescription The FunctionalEntity description, presenting the invocation template. 
	 * @param workingDirectory The directory that will be used for running the Job;
	 * @return An executable Job Instance.
	 * @throws JobCreationFail
	 */
	public Job createJob(AnalysisActivity activityInstance,
			FunctionalEntity toolDescription,
			File workingDirectory)
			throws JobCreationFail;
}