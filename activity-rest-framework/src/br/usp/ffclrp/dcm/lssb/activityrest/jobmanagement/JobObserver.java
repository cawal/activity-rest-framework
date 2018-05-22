package br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement;

/**
 * A Observer interface used by jobs to notify state changes in their life cycle. 
 * @author cawal
 *
 */
public interface JobObserver {
	
	public void notifyStarted(Job job);
	
	public void notifyFailure(Job job);
	
	public void notifySuccess(Job job);
	
}
