package br.usp.ffclrp.dcm.lssb.activityrest.rest.job;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

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
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import br.usp.ffclrp.dcm.lssb.activityrest.analysisvalidation.AnalysisActivityValidation;
import br.usp.ffclrp.dcm.lssb.activityrest.dao.FileSystemDao;
import br.usp.ffclrp.dcm.lssb.activityrest.exceptions.AnalysisActivityNotFoundException;
import br.usp.ffclrp.dcm.lssb.activityrest.exceptions.InvalidCommandLineDefinition;
import br.usp.ffclrp.dcm.lssb.activityrest.exceptions.JobCantStartException;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.JobConfig;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.JobManagerImpl;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.JobState;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.exceptions.JobNotFoundException;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescription;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineEntryList;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetCommandLineEntryList;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetDescription;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetKind;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.LiteralCommandLineEntryList;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterCommandLineEntryList;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterDescription;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Dataset;
import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulator;
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
				// create the job configuration
				JobConfig jc = getJobConfigForAnalysis(analysis, runningDao);
				
				// start the analysis job or send a batch job and return the
				// link for polling
				jobManager.submit(analysisId, jc);
				
				URI jobURI = uriInfo.getAbsolutePath();
				
				return Response.created(jobURI).build();
				
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
				return responseForExecutingJob();
			case SUCCEEDED:
				return responseForSucceededJob(analysisId);
			case FAILED:
				return responseForFailedJob(analysisId);
			
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
	
	private Response responseForSucceededJob(String analysisId) {
		
		moveAnalysisActivityForSuceeededCollection(analysisId);
		
		URI succeededURI = uriInfo.getBaseUriBuilder()
				.path("succeeded-analyses")
				.path(analysisId)
				.build();
		
		return Response.seeOther(succeededURI).build();
	}
	
	private void moveAnalysisActivityForSuceeededCollection(String analysisId) {
		try {
			AnalysisActivity analysis = runningDao.get(analysisId);
			analysis = succeededDAO.moveFrom(analysis.getId(), runningDao);
		} catch (AnalysisActivityNotFoundException e) {
			// already moved? do nothing
		}
	}
	
	private Response responseForFailedJob(String analysisId) {
		
		moveAnalysisActivityForFailedCollection(analysisId);
		
		try {
			AnalysisActivity analysis = failedDAO.get(analysisId);
			File errorReportFile = analysis.getErrorReport();
			String errorReport =
					FileUtils.readFileToString(errorReportFile);
			
			URI failedURI = uriInfo.getBaseUriBuilder()
					.path("failed-analyses")
					.path(analysisId)
					.build();
			
			Link failedLink = Link.fromUri(failedURI)
					.rel("failedAnalysis")
					.type("GET")
					.build();
			
			return Response.status(Status.GONE).links(failedLink)
					.entity(errorReport).build();
		} catch (Exception e) {
			throw new ServerErrorException(500);
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
	
	private Response responseForExecutingJob() {
		return Response.ok().links().build();
	}
	
	private List<String> produceCommandLine(AnalysisActivity analysis)
			throws InvalidCommandLineDefinition {
		
		List<String> commandLine = new ArrayList<>();
		AnalysisActivityDescription description = analysis.getDescription();
		List<CommandLineEntryList> entries =
				description.getCommandLineTemplate();
		
		for (CommandLineEntryList e : entries) {
			
			EList<String> stringList = new BasicEList<>();
			
			if (e instanceof LiteralCommandLineEntryList) {
				stringList.addAll(
						((LiteralCommandLineEntryList) e).getLiterals());
				
			} else if (e instanceof DatasetCommandLineEntryList) {
				DatasetDescription dp =
						((DatasetCommandLineEntryList) e).getDataset();
				
				if (dp.getDatasetKind() == DatasetKind.STANDARD_INPUT
						|| dp.getDatasetKind() == DatasetKind.STANDARD_OUTPUT
						|| dp.getDatasetKind() == DatasetKind.STANDARD_ERROR)
					throw new InvalidCommandLineDefinition(dp.getName(),
							dp.getDatasetKind());
				
				Dataset dataset = analysis.inputDatasetForName(dp.getName());
				dataset = (dataset != null) ? dataset
						: analysis.outputDatasetForName(dp.getName());
				
				for (File f : dataset.getFiles()) {
					stringList.add(f.getAbsolutePath());
				}
				
			} else if (e instanceof ParameterCommandLineEntryList) {
				ParameterDescription pp =
						((ParameterCommandLineEntryList) e).getParameter();
				
				Object parameterValue =
						analysis.getParameters().get(pp.getName());
				
				if (parameterValue instanceof Collection) {
					List<String> values =
							((Collection<Object>) parameterValue).stream()
									.map(Object::toString)
									.collect(Collectors.toList());
					
					stringList.addAll(values);
				} else {
					stringList.add(parameterValue.toString());
				}
				
			}
			
			for (StringListManipulator m : e.getManipulators()) {
				stringList = m.transform(stringList);
			}
			commandLine.addAll(stringList);
		}
		
		System.out.println("COMMAND LINE");
		commandLine.stream().forEach(System.out::println);
		
		return commandLine;
	}
	
	private JobConfig getJobConfigForAnalysis(AnalysisActivity aa,
			FileSystemDao runningDao)
			throws InvalidCommandLineDefinition,
			AnalysisActivityNotFoundException, IOException {
		
		List<String> commandLine = produceCommandLine(aa);
		File standardInput = getStandardInputPipedFile(aa);
		File standardOutput = getStandardOutputPipedFile(aa);
		File standardError = getStandardErrorPipedFile(aa);
		File workingDirectory =
				runningDao.getAnalysisDirectoryInLocalStorage(aa.getId());
		File errorReportFile = aa.getErrorReport();
		
		JobConfig jb = JobConfig.builder()
				.commandLine(commandLine)
				.standardInputPipedFile(standardInput)
				.standardOutputPipedFile(standardOutput)
				.standardErrorPipedFile(standardError)
				.workingDirectory(workingDirectory)
				.errorReportFile(errorReportFile)
				.build();
		
		return jb;
	}
	
	
	private File getStandardInputPipedFile(AnalysisActivity aa)
			throws IOException {
		
		for (DatasetDescription pr : aa.getDescription().getInputDatasets()) {
			if (pr.getDatasetKind() != DatasetKind.STANDARD_INPUT) {
				Dataset d = aa.inputDatasetForName(pr.getName());
				if (d != null && d.getFiles().size() > 0) {
					return d.getFiles().get(0);
				}
			}
		}
		File temp = File.createTempFile("job-manager-input", aa.getId());
		return temp;
	}
	
	private File getStandardOutputPipedFile(AnalysisActivity aa)
			throws IOException {
		
		for (DatasetDescription pr : aa.getDescription().getOutputDatasets()) {
			if (pr.getDatasetKind() == DatasetKind.STANDARD_OUTPUT) {
				Dataset d = aa.outputDatasetForName(pr.getName());
				if (d != null && d.getFiles().size() > 0) {
					return d.getFiles().get(0);
				}
			}
		}
		
		File temp = File.createTempFile("job-manager-output", aa.getId());
		return temp;
	}
	
	private File getStandardErrorPipedFile(AnalysisActivity aa)
			throws IOException {
		
		for (DatasetDescription pr : aa.getDescription().getOutputDatasets()) {
			if (pr.getDatasetKind() == DatasetKind.STANDARD_ERROR) {
				Dataset d = aa.outputDatasetForName(pr.getName());
				if (d != null && d.getFiles().size() > 0) {
					return d.getFiles().get(0);
				}
			}
		}
		
		File temp = File.createTempFile("job-manager-error", aa.getId());
		return temp;
	}
	
}
