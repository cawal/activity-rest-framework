package br.usp.ffclrp.dcm.lssb.activityrest.rest;

import java.util.Map;

import br.usp.ffclrp.dcm.lssb.activityrest.dao.ActivityRepository;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;
import lombok.Data;

@Data
public class ActivityRestConfig {
	Activity activityModel;
	ActivityRepository newAnalysisRepository;
	ActivityRepository failedAnalysisRepository;
	ActivityRepository succededAnalysisRepository;
	ActivityRepository runningAnalysisRepository;
	Map<String,ParameterValidator> parameterConstraints;
	Map<String,InputDatasetValidator> inputDatasetConstraints;
	
}
