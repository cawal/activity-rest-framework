package br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import br.usp.ffclrp.dcm.lssb.activityrest.dao.exceptions.AnalysisActivityNotFoundException;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.Dataset;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.jobs.exceptions.InvalidCommandLineDefinition;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineEntryList;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineTool;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetCommandLineEntryList;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.FunctionalEntity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.InputDataset;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.LiteralCommandLineEntryList;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.OutputDataset;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Parameter;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterCommandLineEntryList;
import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulator;

public class CommandLineJobUtil {
	
	
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
		
		
		FunctionalEntity tool = aa.getDescription().getFunctionalEntity();
		CommandLineTool clt = (CommandLineTool) tool;
		
		List<String> commandLine = produceCommandLine(aa,clt);
		File standardInput = getStandardInputPipedFile(aa,clt);
		File standardOutput = getStandardOutputPipedFile(aa,clt);
		File standardError = getStandardErrorPipedFile(aa,clt);
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
	
	private static List<String> produceCommandLine(AnalysisActivity analysis,CommandLineTool clt)
			throws InvalidCommandLineDefinition {
		
		List<String> commandLine = new ArrayList<>();
		Activity description = analysis.getDescription();
		List<CommandLineEntryList> entries =
				((CommandLineTool) description.getFunctionalEntity()).getCommandLineTemplate();
		
		commandLine.add(getExecutableString(clt));
		
		for (CommandLineEntryList e : entries) {
			
			EList<String> stringList = getRawValues(analysis, e);
			stringList = applyStringListManipulators(stringList, e);
			commandLine.addAll(stringList);
		
		}
		
		return commandLine;
	}

	private static EList<String> applyStringListManipulators(
			EList<String> rawValues, CommandLineEntryList clel) {
		for (StringListManipulator m : clel.getManipulators()) {
			rawValues = m.transform(rawValues);
		}
		return rawValues;
	}

	/**
	 * Gets a list of Strings containing the values/paths of the parameters and 
	 * input/output datasets. 
	 * @param activityInstance the analysis activity instance containing parameter
	 *  values and dataset file's paths 
	 * @param clel whole set of command line entries definition for the analysis
	 * 			activity
	 * @return a list of Strings containing the values to be further processed.
	 */
	private static EList<String> getRawValues(AnalysisActivity activityInstance,
			CommandLineEntryList clel) {
		EList<String> stringList = new BasicEList<>();
		
		if (clel instanceof LiteralCommandLineEntryList) {
			stringList.addAll(
					((LiteralCommandLineEntryList) clel).getLiterals());
			
		} else if (clel instanceof DatasetCommandLineEntryList) {
			br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Dataset dp =
					((DatasetCommandLineEntryList) clel).getDataset();
			
			Dataset dataset = activityInstance.inputDatasetForName(dp.getName());
			dataset = (dataset != null) ? dataset
					: activityInstance.outputDatasetForName(dp.getName());
			
			for (File f : dataset.getFiles()) {
				stringList.add(f.getAbsolutePath());
			}
			
		} else if (clel instanceof ParameterCommandLineEntryList) {
			Parameter pp =
					((ParameterCommandLineEntryList) clel).getParameter();
			
			Object parameterValue =
					activityInstance.getParameters().get(pp.getName());
			
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
		return stringList;
	}
	
	
	private static String getExecutableString(CommandLineTool clt) {
		return clt.getName();
	}

	private static File getStandardInputPipedFile(AnalysisActivity aa, CommandLineTool clt)
			throws IOException {
		
		InputDataset datasetDescription = clt.getStandardInputStream();
		if(datasetDescription != null) {
			Dataset d = aa.inputDatasetForName(datasetDescription.getName());
			if (d != null && d.getFiles().size() > 0) {
				return d.getFiles().get(0);
			}
		}
		
		File temp = File.createTempFile("job-manager-input", aa.getId());
		return temp;
	}
	
	private static File getStandardOutputPipedFile(AnalysisActivity aa, CommandLineTool clt)
			throws IOException {
		

		OutputDataset datasetDescription = clt.getStandardOutputStream();
		
		if(datasetDescription != null) {
			Dataset d = aa.outputDatasetForName(datasetDescription.getName());
			if (d != null && d.getFiles().size() > 0) {
				return d.getFiles().get(0);
			}
		}
		
		File temp = File.createTempFile("job-manager-output", aa.getId());
		return temp;
	}
	
	private static File getStandardErrorPipedFile(AnalysisActivity aa, CommandLineTool clt)
			throws IOException {
		

		OutputDataset datasetDescription = clt.getStandardErrorStream();
		
		if(datasetDescription != null) {
			Dataset d = aa.outputDatasetForName(datasetDescription.getName());
			if (d != null && d.getFiles().size() > 0) {
				return d.getFiles().get(0);
			}
		}
		
		File temp = File.createTempFile("job-manager-error", aa.getId());
		return temp;
	}
	
}
