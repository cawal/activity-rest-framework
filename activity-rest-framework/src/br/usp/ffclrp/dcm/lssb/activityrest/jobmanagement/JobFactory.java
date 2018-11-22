package br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement;

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
	public Job createJob(AnalysisActivity activityInstance,
			FunctionalEntity toolDescription)
			throws JobCreationFail;
}