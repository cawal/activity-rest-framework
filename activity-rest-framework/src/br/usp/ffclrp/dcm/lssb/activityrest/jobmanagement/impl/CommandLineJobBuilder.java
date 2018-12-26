package br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.impl;

import java.io.File;

import com.google.common.io.Files;

import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.exceptions.JobCreationFail;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.exceptions.NonSupportedFunctionalEntity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineTool;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.FunctionalEntity;

public class CommandLineJobBuilder implements JobBuilder{
	
	@Override
	public CommandLineToolJob create(AnalysisActivity activityInstance, 
			FunctionalEntity functionalEntity,
			File workingDirectory) 
			throws JobCreationFail {

		if(functionalEntity instanceof CommandLineTool ) {
						
			JobConfig jobConfig;
			try {
				jobConfig = CommandLineJobUtil.createJobConfig(activityInstance,workingDirectory);
			} catch (Exception e) {
				throw new JobCreationFail("",e);
			}
			System.out.println("instance id: ");
			System.out.println(activityInstance.getId());
			CommandLineToolJob job = new CommandLineToolJob();
			job.setId(activityInstance.getId());
			job.setJobConfig(jobConfig);
			/*CommandLineToolJob.builder()
					.id(activityInstance.getId())
					.jobConfig(jobConfig)
					.build();*/
			
			return job;
			
		} else {
			String message = "CommandLineJobBuilder does not support the"
					+ " desired functional entity";
			Throwable cause = 
					new NonSupportedFunctionalEntity(functionalEntity.getClass());
			throw new JobCreationFail(message, cause); 
		}
		
		

	}
	
}
