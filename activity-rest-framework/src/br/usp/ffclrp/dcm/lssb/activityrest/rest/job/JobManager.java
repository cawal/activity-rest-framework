package br.usp.ffclrp.dcm.lssb.activityrest.rest.job;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.BadRequestException;
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
import javax.ws.rs.core.UriBuilderException;
import javax.ws.rs.core.UriInfo;

import org.apache.commons.io.FileUtils;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import br.usp.ffclrp.dcm.lssb.activityrest.analysisvalidation.AnalysisActivityValidation;
import br.usp.ffclrp.dcm.lssb.activityrest.dao.FileSystemDao;
import br.usp.ffclrp.dcm.lssb.activityrest.exceptions.AnalysisActivityNotFoundException;
import br.usp.ffclrp.dcm.lssb.activityrest.exceptions.InvalidCommandLineDefinition;
import br.usp.ffclrp.dcm.lssb.activityrest.exceptions.JobCantStartException;
import br.usp.ffclrp.dcm.lssb.activityrest.job.Job;
import br.usp.ffclrp.dcm.lssb.activityrest.job.JobConfig;
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
public class JobManager {
	
	private static final String PROCESSING_STATE_FILE = ".pstate";
	@Context
	UriInfo uriInfo;
	AnalysisActivityDescription aaDesc;
	
	FileSystemDao nonExecutedDao;
	FileSystemDao runningDao;
	FileSystemDao succeededDAO;
	FileSystemDao failedDAO;

	
	public JobManager(AnalysisActivityDescription aaDesc, 
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
				analysis = runningDao.moveFrom(analysis.getId(), nonExecutedDao);
				
				analysis.getInputs().forEach(d -> System.out.println(d));
				
				
				// get the new location
				analysis = runningDao.get(analysisId);
				// create the job configuration
				JobConfig jc = getJobConfigForAnalysis(analysis, runningDao); 
				
				// start the analysis job or send a batch job and return the
				// link for polling
				Job job = new Job(jc);
				Thread t = new Thread(job);
				t.setName(analysisId);
				t.start();
								
				URI jobURI = uriInfo.getAbsolutePath();
				
				return Response.created(jobURI).build();
				
			} else { // if analysis is not ready, return BAD REQUEST
				Throwable t = new JobCantStartException(analysis);
				throw new BadRequestException(t);
			}
		} catch (AnalysisActivityNotFoundException e) {
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
		
		try {
			AnalysisActivity analysis = runningDao.get(analysisId);
			
			File processingStateFile = getProcessingStateFile(analysis);
			
			String state;
			state = FileUtils.readFileToString(processingStateFile);
			
			switch (state.replace("\n", "")) {
			case "SUCCEEDED":
				analysis = succeededDAO.moveFrom(analysis.getId(), runningDao);
				
				URI succeededURI = uriInfo.getBaseUriBuilder()
						.path("succeeded-analyses")
						.path(analysisId)
						.build();
				
				return Response.seeOther(succeededURI).build();
			
			case "FAILED":

				analysis = failedDAO.moveFrom(analysis.getId(), runningDao);
				
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
			default:
				return Response.ok().links().build();
			}
		} catch (IOException e) {
			e.printStackTrace();
			throw new NotFoundException();
		} catch (UriBuilderException | SecurityException e) {
			throw new ServerErrorException(e.getLocalizedMessage(), 500);
		} catch (AnalysisActivityNotFoundException e) {
			throw new NotFoundException();
		}
	}
	

	private List<String> produceCommandLine(AnalysisActivity analysis) 
			throws  InvalidCommandLineDefinition {
		
		List<String> commandLine = new ArrayList<>();
		AnalysisActivityDescription description = analysis.getDescription();
		List<CommandLineEntryList> entries = description.getCommandLineTemplate();
		
		for(CommandLineEntryList e : entries) {
			
			EList<String> stringList = new BasicEList<>();
			
			if(e instanceof LiteralCommandLineEntryList) {
				stringList.addAll(((LiteralCommandLineEntryList) e).getLiterals());
				
			} else if (e instanceof DatasetCommandLineEntryList) {
				DatasetDescription dp = ((DatasetCommandLineEntryList) e).getDataset();
				
				
				if(dp.getDatasetKind() == DatasetKind.STANDARD_INPUT
						|| dp.getDatasetKind() == DatasetKind.STANDARD_OUTPUT
						|| dp.getDatasetKind() == DatasetKind.STANDARD_ERROR)
					throw new InvalidCommandLineDefinition(dp.getName(),dp.getDatasetKind());
				
				Dataset dataset = analysis.inputDatasetForName(dp.getName());
				dataset = (dataset != null) ? 
						dataset 
						: analysis.outputDatasetForName(dp.getName());
	
				
				for(File f : dataset.getFiles()) {
					stringList.add(f.getAbsolutePath());
				}

			} else if (e instanceof ParameterCommandLineEntryList) {
				ParameterDescription pp = ((ParameterCommandLineEntryList) e).getParameter();
				
				Object parameterValue = analysis.getParameters().get(pp.getName());
				
				if(parameterValue instanceof Collection) {
					List<String> values = 
							((Collection<Object>) parameterValue).stream()
							.map(Object::toString)
							.collect(Collectors.toList());
							
					stringList.addAll(values);
				} else {
					stringList.add(parameterValue.toString());
				}
				
			}
			
			for(StringListManipulator m : e.getManipulators()) {
				stringList = m.transform(stringList);
			}
			commandLine.addAll(stringList);
		}
		
		System.out.println("COMMAND LINE");
		commandLine.stream().forEach(System.out::println);
		
		return commandLine;
	}
	
	private JobConfig getJobConfigForAnalysis(AnalysisActivity aa, FileSystemDao runningDao)
			throws InvalidCommandLineDefinition, 
					AnalysisActivityNotFoundException, IOException {
		
		List<String> commandLine = produceCommandLine(aa);
		File standardInput = getStandardInputPipedFile(aa);
		File standardOutput = getStandardOutputPipedFile(aa);
		File standardError = getStandardErrorPipedFile(aa);
		File workingDirectory = runningDao.getAnalysisDirectoryInLocalStorage(aa.getId());
		File analysisStateFile = getProcessingStateFile(aa);
		File errorReportFile = aa.getErrorReport();
		
		JobConfig jb = new JobConfig(
				commandLine, 
				standardInput, 
				standardOutput, 
				standardError, 
				workingDirectory,
				analysisStateFile,
				errorReportFile
		);
		return jb;
	}

	private File getProcessingStateFile(AnalysisActivity aa) throws AnalysisActivityNotFoundException, IOException {
		File workingDirectory = this.runningDao.getAnalysisDirectoryInLocalStorage(aa.getId());
		File processingStateFile = new File(workingDirectory,PROCESSING_STATE_FILE);
		if(!processingStateFile.exists()) {
			processingStateFile.createNewFile();
		}
		return processingStateFile;
	}


	private File getStandardInputPipedFile(AnalysisActivity aa) 
			throws IOException {
		
		for(DatasetDescription pr : aa.getDescription().getInputDatasets()) {
			if(pr.getDatasetKind() != DatasetKind.STANDARD_INPUT) {
				Dataset d = aa.inputDatasetForName(pr.getName());
				if(d != null && d.getFiles().size() > 0) {
					return d.getFiles().get(0);
				}
			}
		}
		File temp = File.createTempFile("job-manager-input", aa.getId());
		return temp;
	}
	
	
	private File getStandardOutputPipedFile(AnalysisActivity aa) 
			throws IOException {
		
		for(DatasetDescription pr : aa.getDescription().getOutputDatasets()) {
			if(pr.getDatasetKind() == DatasetKind.STANDARD_OUTPUT) { 
				Dataset d = aa.outputDatasetForName(pr.getName());
				if(d != null && d.getFiles().size() > 0) {
					return d.getFiles().get(0);
				}
			}
		}
		

		File temp = File.createTempFile("job-manager-output", aa.getId());
		return temp;
	}
	
	private File getStandardErrorPipedFile(AnalysisActivity aa) 
			throws IOException {
		
		for(DatasetDescription pr : aa.getDescription().getOutputDatasets()) {
			if(pr.getDatasetKind() == DatasetKind.STANDARD_ERROR) {
				Dataset d = aa.outputDatasetForName(pr.getName());
				if(d != null && d.getFiles().size() > 0) {
					return d.getFiles().get(0);
				}
			}
		}
		

		File temp = File.createTempFile("job-manager-error", aa.getId());
		return temp;
	}
	
	
	
}
