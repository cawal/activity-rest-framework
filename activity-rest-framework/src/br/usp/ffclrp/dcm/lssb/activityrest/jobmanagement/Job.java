package br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement;

/**
 * Job consists of a observable task that can be executed in the
 * background. 
 * Job notifies its observers that a event in its life cycle occured.
 * @author cawal
 *
 */
public interface Job extends Runnable {
	/**
	 * Get the job identifier string
	 * @return the id
	 */
	public String getId();
	

	/**
	 * Add a observer to job. Implementations MUST allow the 
	 * instance to have more than one observer.
	 * Further, implementations MUST call the observers methods
	 * after a job's state transition.
	 * 
	 * @param observer A JobObserver to be notified after a state
	 * 					transition.
	 */
	public void addObserver(JobObserver observer);
	
}
