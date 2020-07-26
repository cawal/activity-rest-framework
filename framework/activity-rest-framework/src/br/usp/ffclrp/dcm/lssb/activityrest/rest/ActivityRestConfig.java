package br.usp.ffclrp.dcm.lssb.activityrest.rest;

import java.util.Map;

import br.usp.ffclrp.dcm.lssb.activityrest.dao.ActivityRepository;
import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.Deployment;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.validation.InputDatasetValidator;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.validation.ParameterValidator;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.JobManager;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;
import lombok.Data;

@Data
public class ActivityRestConfig {
	Activity activityModel;
	Deployment deploymentModel;
	ActivityRepository newAnalysisRepository;
	ActivityRepository failedAnalysisRepository;
	ActivityRepository succededAnalysisRepository;
	ActivityRepository runningAnalysisRepository;
	Map<String,ParameterValidator> parameterConstraints;
	Map<String,InputDatasetValidator> inputDatasetConstraints;
	JobManager jobManager;
	
}
