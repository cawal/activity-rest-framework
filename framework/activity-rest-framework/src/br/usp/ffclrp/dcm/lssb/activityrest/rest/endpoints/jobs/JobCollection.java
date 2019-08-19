package br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.jobs;

import java.io.File;
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

import br.usp.ffclrp.dcm.lssb.activityrest.dao.ActivityRepository;
import br.usp.ffclrp.dcm.lssb.activityrest.dao.FileSystemActivityRepository;
import br.usp.ffclrp.dcm.lssb.activityrest.dao.RepositoryTransferService;
import br.usp.ffclrp.dcm.lssb.activityrest.dao.exceptions.AnalysisActivityNotFoundException;
import br.usp.ffclrp.dcm.lssb.activityrest.dao.exceptions.AnalysisActivityUpdateFailure;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.validation.ValidationService;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.Job;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.JobFactory;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.JobState;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.exceptions.JobCreationFail;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.exceptions.JobNotFoundException;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.impl.JobFactoryImpl;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.impl.JobManagerImpl;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.jobs.exceptions.JobCantStartException;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.representations.AnalysisActivityRepresentation;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.representations.AnalysisActivityStateRepresentation;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;

public class JobCollection {
	
	@Context
	UriInfo uriInfo;
	Activity activityDescription;
	
	ActivityRepository nonExecutedDao;
	FileSystemActivityRepository runningDao;
	ActivityRepository succeededDAO;
	ActivityRepository failedDAO;
	br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.JobManager jobManager =
			new JobManagerImpl();
	
	public JobCollection(Activity activityDescription,
			UriInfo uriInfo,
			ActivityRepository nonExecutedAnalysisActivityDao,
			FileSystemActivityRepository runningAnalysisActivityDao,
			ActivityRepository succeededAnalysisActivityDao,
			ActivityRepository failedAnalysisActivityDao) {
		
		this.activityDescription = activityDescription;
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
			
			if (ValidationService.isReady(analysis)) {
				// if analysis is ready, move it for the directory of executing
				RepositoryTransferService.moveInstance(analysis.getId(),
						nonExecutedDao, runningDao);
				analysis = runningDao.get(analysisId);
				
				// get the new location
				analysis = runningDao.get(analysisId);
				File workingDirectory =
						runningDao
								.getAnalysisDirectoryInLocalStorage(analysisId);
				
				
				// create the job
				JobFactory jobFactory = new JobFactoryImpl();
				Job job = jobFactory.createJob(analysis,
						analysis.getDescription().getFunctionalEntity(),
						workingDirectory);
				// start the analysis job or send a batch job and return the
				// link for polling
				jobManager.submit(analysisId, job);
				
				URI jobURI = uriInfo.getAbsolutePath();
				
				AnalysisActivityRepresentation representation =
						new AnalysisActivityRepresentation(analysisId,
								AnalysisActivityStateRepresentation.RUNNING);
				
				return Response.created(jobURI).entity(representation).build();
				
			} else { // if analysis is not ready, return BAD REQUEST
				Throwable t = new JobCantStartException(analysis);
				throw new BadRequestException(t);
			}
		} catch (AnalysisActivityNotFoundException
				| br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.exceptions.JobCantStartException e) {
			throw new BadRequestException(e);
		} catch (JobCreationFail e) {
			e.printStackTrace();
			throw new ServerErrorException(Status.INTERNAL_SERVER_ERROR, e);
		} catch (AnalysisActivityUpdateFailure e) {
			e.printStackTrace();
			throw new BadRequestException(e);
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
		
		try {
			JobState jobState = jobManager.getState(analysisId);
			
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

		try {
			JobState jobState = jobManager.getState(analysisId);
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
			//nonExecutedDao.moveFrom(analysisId, runningDao);
			RepositoryTransferService.moveInstance(analysisId, runningDao,
					nonExecutedDao);
			URI analysisURI = uriInfo.getBaseUriBuilder()
					.path("non-executed-instances")
					.path(analysisId)
					.build();
			
			return Response.seeOther(analysisURI).build();
		} catch (Throwable e) {
			throw new ServerErrorException(510);
		}
	}
	
	private void moveAnalysisActivityForSuceeededCollection(String analysisId)
			throws AnalysisActivityUpdateFailure {
		try {
			AnalysisActivity analysis = runningDao.get(analysisId);
			RepositoryTransferService.moveInstance(analysis.getId(), runningDao,
					succeededDAO);
		} catch (AnalysisActivityNotFoundException e) {
			// already moved? do nothing
		}
	}
	
	private void moveAnalysisActivityForFailedCollection(String analysisId)
			throws AnalysisActivityUpdateFailure {
		try {
			AnalysisActivity analysis = runningDao.get(analysisId);
			RepositoryTransferService.moveInstance(analysis.getId(), runningDao,
					failedDAO);
			
		} catch (AnalysisActivityNotFoundException e) {
			// already moved, do nothing
		}
	}
	
	private Response responseForExecutingJob(String analysisId) {
		
		AnalysisActivityRepresentation representation =
				new AnalysisActivityRepresentation(analysisId,
						AnalysisActivityStateRepresentation.RUNNING);
		
		return Response.ok()
				.entity(representation)
				.links()
				.build();
	}
	
	private Response processFailedJob(String analysisId) {
		
		try {
			
			moveAnalysisActivityForFailedCollection(analysisId);
			
			AnalysisActivity analysis = failedDAO.get(analysisId);
			File errorReportFile = analysis.getErrorReport();
			String errorReport =
					FileUtils.readFileToString(errorReportFile);
			
			// create representation
			AnalysisActivityRepresentation representation =
					new AnalysisActivityRepresentation(
							analysisId,
							AnalysisActivityStateRepresentation.FAILED);
			representation.setErrorReport(errorReport);
			
			URI failedURI = uriInfo.getBaseUriBuilder()
					.path("failed-instances")
					.path(analysisId)
					.build();
			
			Link failedLink = Link.fromUri(failedURI)
					.rel("failedInstance")
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
		
		try {
			moveAnalysisActivityForSuceeededCollection(analysisId);
			
			URI succeededURI = uriInfo.getBaseUriBuilder()
					.path("succeeded-instances")
					.path(analysisId)
					.build();
			
			return Response.seeOther(succeededURI).build();
			
		} catch (AnalysisActivityUpdateFailure e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ServerErrorException(500);
		}
	}
	
}
