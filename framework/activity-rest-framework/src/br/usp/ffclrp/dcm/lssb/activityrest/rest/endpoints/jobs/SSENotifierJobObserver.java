package br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.jobs;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.sse.OutboundSseEvent;
import javax.ws.rs.sse.Sse;
import javax.ws.rs.sse.SseEventSink;

import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.Job;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.JobObserver;

public class SSENotifierJobObserver implements JobObserver {
	
	SseEventSink eventSink;
	Sse sse;
	
	public SSENotifierJobObserver(SseEventSink eventSink, Sse sse) {
		this.sse = sse;
		this.eventSink = eventSink;
	}
	
	@Override
	public void notifyStarted(Job job) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void notifyFailure(Job job) {
		final OutboundSseEvent event = sse.newEventBuilder()
				.name("activity-state")
				.mediaType(MediaType.TEXT_PLAIN_TYPE)
				.data(String.class, "FAILED")
				.build();
		eventSink.send(event);
	
		// nothing to do after it
		eventSink.close();
		
	}
	
	@Override
	public void notifySuccess(Job job) {
		final OutboundSseEvent event = sse.newEventBuilder()
				.name("activity-state")
				.mediaType(MediaType.TEXT_PLAIN_TYPE)
				.data(String.class, "SUCCEEDED")
				.build();
		eventSink.send(event);
	
		// nothing to do after it
		eventSink.close();
		
	}
	
}
