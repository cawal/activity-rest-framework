package br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement;

/**
 * A Observer interface used by jobs to notify state changes 
 * in their life cycle. 
 * @author cawal
 *
 */
public interface JobObserver {
	
	/**
	 * Notifies the observer that a job started.
	 * @param job the recently started job
	 */
	public void notifyStarted(Job job);

	/**
	 * Notifies the observer that a job has failed.
	 * @param job the recently failed job
	 */
	public void notifyFailure(Job job);
	
	/**
	 * Notifies the observer that a job has ended successful.
	 * @param job the recently terminated job
	 */
	public void notifySuccess(Job job);
	
}
