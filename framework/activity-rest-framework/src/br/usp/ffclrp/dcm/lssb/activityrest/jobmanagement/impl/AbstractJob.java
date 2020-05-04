package br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.impl;

import java.util.ArrayList;
import java.util.List;

import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.Job;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.JobObserver;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.JobState;

public abstract class AbstractJob implements Job {
	protected String id;
	protected JobConfig jobConfig;
	protected JobState state = JobState.CREATED;
	
	protected List<JobObserver> observers;
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public JobState getState() {
		return state;
	}
	
	public void addObserver(JobObserver observer) {
		if (this.observers == null) {
			this.observers = new ArrayList<>();
		}
		
		if (observer != null) {
			this.observers.add(observer);
		}
	}
	
	protected void setState(JobState newState) {
		switch (newState) {
		
		case CREATED:
			break;
		
		case RUNNING:
			if (this.state == JobState.CREATED) {
				this.state = JobState.RUNNING;
				notifyStarted();
			}
			break;
		
		case SUCCEEDED:
			if (this.state == JobState.RUNNING) {
				this.state = JobState.SUCCEEDED;
				notifySuccess();
			}
			break;
		
		case FAILED:
			if (this.state == JobState.RUNNING) {
				this.state = JobState.FAILED;
				notifyFailure();
			}
			break;
		
		
		case CANCELED:
			this.state = JobState.FAILED;
			notifyFailure();
			break;
			
		}
	}
	
	protected void notifyStarted() {
		observers.forEach(o -> o.notifyStarted(this));
	}
	
	protected void notifySuccess() {
		this.observers.forEach(o -> o.notifySuccess(this));
	}
	
	protected void notifyFailure() {
		this.observers.forEach(o -> o.notifyFailure(this));
	}
	
}
