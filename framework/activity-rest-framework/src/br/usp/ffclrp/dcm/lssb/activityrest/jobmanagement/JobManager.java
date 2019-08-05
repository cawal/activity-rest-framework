package br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement;

import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.exceptions.JobCancellationException;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.exceptions.JobCantStartException;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.exceptions.JobNotFoundException;

/**
 * JobManager defines the interface for submitting a
 * analysis job for execution, query its state and cancel it
 * (if possible).
 * 
 * @author cawal
 *
 */
public interface JobManager {
	
	/**
	 * Submits a Job instance for processing and associates it to an identifier.
	 * 
	 * @param jobId
	 *            The identifier to be associated with the job.
	 * @param job
	 *            The observable Job itself.
	 * @throws JobCantStartException
	 */
	public void submit(String jobId, Job job) throws JobCantStartException;
	
	/**
	 * Retrieves the state of a running/finished Job.
	 * 
	 * @param jobId
	 *            The id of the job to query.
	 * @return the JobState
	 * @throws JobNotFoundException
	 *             if the identifier does not is associated to
	 *             any job.
	 */
	public JobState getState(String jobId) throws JobNotFoundException;
	
	/**
	 * Tries to cancel a running Job.
	 * 
	 * @param jobId
	 *            The identifier of the Job.
	 * @throws JobCancellationException
	 *             If the identifier is not associated to any Job
	 *             or the Job already finished
	 *             or the Job was previously canceled.
	 */
	public void cancel(String jobId) throws JobCancellationException;
	
}
