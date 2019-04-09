package br.usp.ffclrp.dcm.lssb.activityrest.dao;

public interface FileSystemRepositoryProperties {
	
	public String getNonExecutedAnalysesRootDirectory();
	public String getSucceededAnalysesRootDirectory();
	public String getFailedAnalysesRootDirectory();
	public String getRunningAnalysesRootDirectory();	

}
