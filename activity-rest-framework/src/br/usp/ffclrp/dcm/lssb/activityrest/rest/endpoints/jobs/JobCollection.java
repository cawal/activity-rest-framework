package br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.jobs;

import java.io.File;
import java.io.IOException;
import java.net.URI;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.ServerErrorException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import org.apache.commons.io.FileUtils;

import br.usp.ffclrp.dcm.lssb.activityrest.dao.FileSystemDao;
import br.usp.ffclrp.dcm.lssb.activityrest.dao.exceptions.AnalysisActivityNotFoundException;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.JobConfig;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.JobManagerImpl;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.JobState;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.exceptions.JobNotFoundException;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.analysisvalidation.AnalysisActivityValidation;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.jobs.exceptions.InvalidCommandLineDefinition;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.jobs.exceptions.JobCantStartException;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.representations.AnalysisActivityRepresentation;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.representations.AnalysisActivityStateRepresentation;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescription;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity;
import io.swagger.annotations.Api;

@Api
public class JobCollection {
	
	@Context
	UriInfo uriInfo;
	AnalysisActivityDescription aaDesc;
	
	FileSystemDao nonExecutedDao;
	FileSystemDao runningDao;
	FileSystemDao succeededDAO;
	FileSystemDao failedDAO;
	br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.JobManager jobManager =
			new JobManagerImpl();
	
	public JobCollection(AnalysisActivityDescription aaDesc,
			UriInfo uriInfo,
			FileSystemDao nonExecutedAnalysisActivityDao,
			FileSystemDao runningAnalysisActivityDao,
			FileSystemDao succeededAnalysisActivityDao,
			FileSystemDao failedAnalysisActivityDao) {
		
		this.aaDesc = aaDesc;
		this.uriInfo = uriInfo;
		this.nonExecutedDao = nonExecutedAnalysisActivityDao;
		this.runningDao = runningAnalysisActivityDao;
		this.succeededDAO = succeededAnalysisActivityDao;
		this.failedDAO = failedAnalysisActivityDao;
	}
	
	@POST
	@Path("{analysisID}")
	public Response
			startProcessing(@PathParam("analysisID") String analysisId) {
		try {
			AnalysisActivity analysis =
					nonExecutedDao.get(analysisId);
			
			if (AnalysisActivityValidation.isReady(analysis)) {
				// if analysis is ready, move it for the directory of executing
				analysis =
						runningDao.moveFrom(analysis.getId(), nonExecutedDao);
				
				// get the new location
				analysis = runningDao.get(analysisId);
				File workingDirectory = 
						runningDao.getAnalysisDirectoryInLocalStorage(analysisId);
				
				// create the job configuration
				JobConfig jc = JobUtil.createJobConfig(analysis, workingDirectory);
				
				// start the analysis job or send a batch job and return the
				// link for polling
				jobManager.submit(analysisId, jc);
				
				URI jobURI = uriInfo.getAbsolutePath();
				
				AnalysisActivityRepresentation representation = 
						new AnalysisActivityRepresentation();
				
				representation.setId(analysisId);
				representation.setState(AnalysisActivityStateRepresentation.RUNNING);
				
				
				return Response.created(jobURI).entity(representation).build();
				
			} else { // if analysis is not ready, return BAD REQUEST
				Throwable t = new JobCantStartException(analysis);
				throw new BadRequestException(t);
			}
		} catch (AnalysisActivityNotFoundException
				| br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.exceptions.JobCantStartException e) {
			throw new BadRequestException(e);
		} catch (IOException | InvalidCommandLineDefinition e) {
			e.printStackTrace();
			throw new ServerErrorException(Status.INTERNAL_SERVER_ERROR);
		}
	}
	
	/**
	 * Pooling of the job
	 * 
	 * @param analysisId
	 * @return
	 */
	@GET
	@Path("{analysisID}")
	public Response
			poolProcessing(@PathParam("analysisID") String analysisId) {
		
		JobState jobState;
		try {
			jobState = jobManager.getState(analysisId);
			
			switch (jobState) {
			case RUNNING:
				return responseForExecutingJob(analysisId);
			case SUCCEEDED:
				return processSucceededJob(analysisId);
			case FAILED:
				return processFailedJob(analysisId);
			
			default:
				throw new NotFoundException();
			}
			
		} catch (JobNotFoundException e) {
			throw new NotFoundException();
		}
	}
	
	@DELETE
	@Path("{analysisID}")
	public Response
			cancelProcessing(@PathParam("analysisID") String analysisId) {
		JobState jobState;
		try {
			jobState = jobManager.getState(analysisId);
			switch (jobState) {
			case RUNNING:
				return tryToCancelAndReturnResponse(analysisId);
			default:
				throw new NotFoundException();
			}
		} catch (JobNotFoundException e) {
			e.printStackTrace();
			throw new NotFoundException();
		}
	}
	
	private Response tryToCancelAndReturnResponse(String analysisId) {
		
		try {
			jobManager.cancel(analysisId);
			nonExecutedDao.moveFrom(analysisId, runningDao);
			URI analysisURI = uriInfo.getBaseUriBuilder()
					.path("new-analyses")
					.path(analysisId)
					.build();
			
			return Response.seeOther(analysisURI).build();
		} catch (Throwable e) {
			throw new ServerErrorException(500);
		}
	}
	

	
	private void moveAnalysisActivityForSuceeededCollection(String analysisId) {
		try {
			AnalysisActivity analysis = runningDao.get(analysisId);
			analysis = succeededDAO.moveFrom(analysis.getId(), runningDao);
		} catch (AnalysisActivityNotFoundException e) {
			// already moved? do nothing
		}
	}
	

	
	private void moveAnalysisActivityForFailedCollection(String analysisId) {
		try {
			AnalysisActivity analysis = runningDao.get(analysisId);
			analysis = failedDAO.moveFrom(analysis.getId(), runningDao);
			
		} catch (AnalysisActivityNotFoundException e) {
			// already moved, do nothing
		}
	}
	
	private Response responseForExecutingJob(String analysisId) {
		
		AnalysisActivityRepresentation representation = 
				new AnalysisActivityRepresentation();
		representation.setId(analysisId);
		representation.setState(AnalysisActivityStateRepresentation.RUNNING);
		
		return Response.ok()
				.entity(representation)
				.links()
				.build();
	}
	
	private Response processFailedJob(String analysisId) {
		
		moveAnalysisActivityForFailedCollection(analysisId);
		
		try {
			AnalysisActivity analysis = failedDAO.get(analysisId);
			File errorReportFile = analysis.getErrorReport();
			String errorReport =
					FileUtils.readFileToString(errorReportFile);
			
			// create representation
			AnalysisActivityRepresentation representation =
					new AnalysisActivityRepresentation();
			representation.setId(analysisId);
			representation.setState(AnalysisActivityStateRepresentation.FAILED);
			representation.setErrorReport(errorReport);
			
			URI failedURI = uriInfo.getBaseUriBuilder()
					.path("failed-analyses")
					.path(analysisId)
					.build();
			
			Link failedLink = Link.fromUri(failedURI)
					.rel("failedAnalysis")
					.type("GET")
					.build();
			
			return Response.status(Status.GONE)
					.links(failedLink)
					.entity(representation)
					.build();
			
		} catch (Exception e) {
			throw new ServerErrorException(500);
		}
		
	}
	
	private Response processSucceededJob(String analysisId) {
		
		moveAnalysisActivityForSuceeededCollection(analysisId);
		
		URI succeededURI = uriInfo.getBaseUriBuilder()
				.path("succeeded-analyses")
				.path(analysisId)
				.build();
		
		return Response.seeOther(succeededURI).build();
	}
	
}
