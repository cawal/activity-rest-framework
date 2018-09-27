package br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.impl;

import java.util.ArrayList;
import java.util.List;

import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.Job;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.JobObserver;

public abstract class AbstractJob implements Job {
	protected String id;
	protected JobConfig jobConfig;
	
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
	
	public void addObserver(JobObserver observer) {
		if (this.observers == null) {
			this.observers = new ArrayList<>();
		}
		
		if (observer != null) {
			this.observers.add(observer);
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
