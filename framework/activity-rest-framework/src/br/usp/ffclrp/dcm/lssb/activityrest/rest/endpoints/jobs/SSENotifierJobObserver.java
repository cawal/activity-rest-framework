package br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.jobs;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Link;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.sse.OutboundSseEvent;
import javax.ws.rs.sse.Sse;
import javax.ws.rs.sse.SseEventSink;

import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.Job;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.JobObserver;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.representations.AnalysisActivityStateRepresentation;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.representations.JobInstanceRepresentation;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.representations.LinkRepresentation;

public class SSENotifierJobObserver implements JobObserver {
	
	SseEventSink eventSink;
	Sse sse;
	UriInfo uriInfo;
	
	public SSENotifierJobObserver(SseEventSink eventSink,
			Sse sse, 
			UriInfo uriInfo) {
		this.sse = sse;
		this.eventSink = eventSink;
		this.uriInfo = uriInfo;
	}
	
	public void notifyState(Job job) {
		switch(job.getState()) {
		case CREATED:
			break;
		case RUNNING:
			notifyStarted(job);
			break;
		case SUCCEEDED:
			notifySuccess(job);
		case FAILED:
			notifyFailure(job);
		case CANCELED:
			notifyFailure(job);
		}
		
	}
	
	@Override
	public void notifyStarted(Job job) {

		System.err.println("SSE notify STARTED");
		
		List<LinkRepresentation> links = new ArrayList<>();
		
		final JobInstanceRepresentation representation =
				new JobInstanceRepresentation(job.getId(),
						null, 
						links);
		representation.setState(AnalysisActivityStateRepresentation.RUNNING);
		
		final OutboundSseEvent event = sse.newEventBuilder()
				.name("activity-state")
				.mediaType(MediaType.APPLICATION_JSON_TYPE)
				.data(JobInstanceRepresentation.class, representation)
				.build();
		eventSink.send(event);
		
	}
	
	@Override
	public void notifyFailure(Job job) {
		System.err.println("SSE notify FAILURE");
		List<LinkRepresentation> links = new ArrayList<>();
		String locationUri = uriInfo.getBaseUriBuilder()
				.path("failed-instances")
				.path(job.getId())
				.build().toString();
		LinkRepresentation locationLink = new LinkRepresentation("Location",locationUri);
		links.add(locationLink);

		final JobInstanceRepresentation representation =
				new JobInstanceRepresentation(job.getId(),
						null, 
						links);
		representation.setState(AnalysisActivityStateRepresentation.FAILED);
		final OutboundSseEvent event = sse.newEventBuilder()
				.name("activity-state")
				.mediaType(MediaType.APPLICATION_JSON_TYPE)
				.data(JobInstanceRepresentation.class, representation)
				.build();
		eventSink.send(event);
	
		// nothing to do after it
		eventSink.close();
		
	}
	
	@Override
	public void notifySuccess(Job job) {
		System.err.println("SSE notify SUCCEEDED");
		System.err.println(sse);
		List<LinkRepresentation> links = new ArrayList<>();
		String locationUri = uriInfo.getBaseUriBuilder()
				.path("succeeded-instances")
				.path(job.getId())
				.build().toString();
		LinkRepresentation locationLink = new LinkRepresentation("Location",locationUri);
		links.add(locationLink);

		final JobInstanceRepresentation representation =
				new JobInstanceRepresentation(job.getId(),
						null, 
						links);
		representation.setState(AnalysisActivityStateRepresentation.SUCCEEDED);
		System.err.println(sse);
		final OutboundSseEvent event = sse.newEventBuilder()
				.name("activity-state")
				.mediaType(MediaType.APPLICATION_JSON_TYPE)
				.data(JobInstanceRepresentation.class, representation)
				.build();
		System.err.println(eventSink.send(event));
	
		// nothing to do after it
		eventSink.close();
		
	}
	
}
