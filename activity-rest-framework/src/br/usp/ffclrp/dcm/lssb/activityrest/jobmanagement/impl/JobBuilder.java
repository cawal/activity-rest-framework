package br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.impl;

import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.Job;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.exceptions.JobCreationFail;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.exceptions.NonSupportedFunctionalEntity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.FunctionalEntity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity;


/**
 * This interface must be implemented by dedicated builders for each possible 
 * functional interface type in the AADM metamodel. Then, the new builder may
 * be registered in the ActivityREST framework.
 * @author cawal
 *
 */
public interface JobBuilder {
	/**
	 * Receives the activity instance (with its parameters and datasets)
	 * and the description of the functional entity that is used for 
	 * execute such activity. Then, verifies if know how to create a job
	 * for executing such activity. If it can, creates and returns the job.
	 * 
	 * 
	 * @param activityInstance The activity instance to be executed.
	 * @param functionalEntity The description of how to execute the job 
	 * 		  in the AADM metamodel.
	 * @return a job that can be executed.
	 * @throws JobCreationFail if the JobBuilder cant create the job 
	 */
	public Job create(AnalysisActivity activityInstance, FunctionalEntity functionalEntity)
			throws JobCreationFail;
}
