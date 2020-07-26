package br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.jobs;

import br.usp.ffclrp.dcm.lssb.activityrest.dao.ActivityRepository;
import br.usp.ffclrp.dcm.lssb.activityrest.dao.RepositoryTransferService;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.Job;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.JobObserver;

public class MoveInstanceJobObserver implements JobObserver {
	
	
	final ActivityRepository nonExecutedCollection;
	final ActivityRepository runningCollection;
	final ActivityRepository succeededCollection;
	final ActivityRepository failedCollection;
	
	public MoveInstanceJobObserver(
			ActivityRepository nonExecutedCollection,
			ActivityRepository runningCollection,
			ActivityRepository succeededCollection,
			ActivityRepository failedCollection) {
		this.nonExecutedCollection = nonExecutedCollection;
		this.runningCollection = runningCollection;
		this.succeededCollection = succeededCollection;
		this.failedCollection = failedCollection;
	}
	
	@Override
	public void notifyStarted(Job job) {
		// do nothing
	}
	
	@Override
	public void notifyFailure(Job job) {
		try {
			RepositoryTransferService.moveInstance(
					job.getId(),
					runningCollection,
					failedCollection);
		} catch (Exception e) {
		}
		
	}
	
	@Override
	public void notifySuccess(Job job) {
		try {
			RepositoryTransferService.moveInstance(
					job.getId(),
					runningCollection,
					succeededCollection);
		} catch (Exception e) {
		}
		
	}
	
}
