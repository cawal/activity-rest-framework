package br.usp.ffclrp.dcm.lssb.activityrest.dao;

@Deprecated
public interface FileSystemRepositoryProperties {
	
	public String getNonExecutedAnalysesRootDirectory();
	public String getSucceededAnalysesRootDirectory();
	public String getFailedAnalysesRootDirectory();
	public String getRunningAnalysesRootDirectory();	

}
