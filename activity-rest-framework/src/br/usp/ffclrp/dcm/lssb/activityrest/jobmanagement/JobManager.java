package br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement;

import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.exceptions.*;

public interface JobManager {
	
	public void submit(String jobId, JobConfig jobConfig) throws JobCantStartException;
	
	public JobState getState(String jobId) throws JobNotFoundException;
	
	public void cancel(String jobId) throws JobCancellationException;
	
	
}
