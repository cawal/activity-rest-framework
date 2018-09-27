package br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement;

import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.exceptions.*;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.impl.JobConfig;


/**
 * JobManager defines the interface for submitting a 
 * analysis job for execution, query its state and cancel it
 * (if possible).
 * @author cawal
 *
 */
public interface JobManager {
	
	public void submit(String jobId, Job job) throws JobCantStartException;
	
	//public void submit(String jobId, JobConfig jobConfig) throws JobCantStartException;
	
	public JobState getState(String jobId) throws JobNotFoundException;
	
	public void cancel(String jobId) throws JobCancellationException;
	
}
