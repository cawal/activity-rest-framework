package br.usp.ffclrp.dcm.lssb.activityrest.dao;

public interface FileSystemDaoProperties {
	
	public String getNonExecutedAnalysesRootDirectory();
	public String getSucceededAnalysesRootDirectory();
	public String getFailedAnalysesRootDirectory();
	public String getRunningAnalysesRootDirectory();
	
	/*
	nonExecutedAnalysisDao.localStorage=/tmp/agilent-one-color-microarray-normalization/new-analyses
	succeededAnalysisDao.localStorage=/tmp/agilent-one-color-microarray-normalization/succeeded-analyses
	failedAnalysisDao.localStorage=/tmp/agilent-one-color-microarray-normalization/failed-analyses
	runningAnalysisDao.localStorage=/tmp/agilent-one-color-microarray-normalization/running-analyses
	analysisActivity.parametersTemplate=parameters-template.json
	analysisActivity.parametersSubPath=/parameters.json
	analysisActivity.inputDataSetsSubpath=/inputs
	analysisActivity.outpuDataSetsSubpath=/outputs
	*/
}
