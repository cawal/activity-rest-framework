package br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.jobs;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import br.usp.ffclrp.dcm.lssb.activityrest.dao.exceptions.AnalysisActivityNotFoundException;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.JobConfig;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.jobs.exceptions.InvalidCommandLineDefinition;
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

public class JobUtil {
	
	
	/**
	 * Glue code to create a JobConfig instance from a AnalysisActivity instance
	 * and a desired working directory. 
	 * @param aa
	 * @param workingDirectory
	 * @return
	 * @throws InvalidCommandLineDefinition
	 * @throws AnalysisActivityNotFoundException
	 * @throws IOException
	 */
	public static JobConfig createJobConfig(AnalysisActivity aa,
			File workingDirectory)
			throws InvalidCommandLineDefinition, IOException {
		
		List<String> commandLine = produceCommandLine(aa);
		File standardInput = getStandardInputPipedFile(aa);
		File standardOutput = getStandardOutputPipedFile(aa);
		File standardError = getStandardErrorPipedFile(aa);
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
	
	private static List<String> produceCommandLine(AnalysisActivity analysis)
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
	
	
	private static File getStandardInputPipedFile(AnalysisActivity aa)
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
	
	private static File getStandardOutputPipedFile(AnalysisActivity aa)
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
	
	private static File getStandardErrorPipedFile(AnalysisActivity aa)
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
