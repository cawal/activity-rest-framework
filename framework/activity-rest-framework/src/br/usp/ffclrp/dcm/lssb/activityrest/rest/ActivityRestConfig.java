package br.usp.ffclrp.dcm.lssb.activityrest.rest;

import br.usp.ffclrp.dcm.lssb.activityrest.dao.ActivityRepository;
import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.Deployment;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.validation.InputDatasetValidator;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.validation.ParameterValidator;
import br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.JobManager;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;

import java.util.Map;

public class ActivityRestConfig {
	Activity activityModel;
	Deployment deploymentModel;
	ActivityRepository newAnalysisRepository;
	ActivityRepository failedAnalysisRepository;
	ActivityRepository succededAnalysisRepository;
	ActivityRepository runningAnalysisRepository;
	Map<String,ParameterValidator> parameterConstraints;
	Map<String,InputDatasetValidator> inputDatasetConstraints;
	JobManager jobManager;

	public ActivityRestConfig() {
	}

	public Activity getActivityModel() {
		return this.activityModel;
	}

	public Deployment getDeploymentModel() {
		return this.deploymentModel;
	}

	public ActivityRepository getNewAnalysisRepository() {
		return this.newAnalysisRepository;
	}

	public ActivityRepository getFailedAnalysisRepository() {
		return this.failedAnalysisRepository;
	}

	public ActivityRepository getSuccededAnalysisRepository() {
		return this.succededAnalysisRepository;
	}

	public ActivityRepository getRunningAnalysisRepository() {
		return this.runningAnalysisRepository;
	}

	public Map<String, ParameterValidator> getParameterConstraints() {
		return this.parameterConstraints;
	}

	public Map<String, InputDatasetValidator> getInputDatasetConstraints() {
		return this.inputDatasetConstraints;
	}

	public JobManager getJobManager() {
		return this.jobManager;
	}

	public void setActivityModel(Activity activityModel) {
		this.activityModel = activityModel;
	}

	public void setDeploymentModel(Deployment deploymentModel) {
		this.deploymentModel = deploymentModel;
	}

	public void setNewAnalysisRepository(ActivityRepository newAnalysisRepository) {
		this.newAnalysisRepository = newAnalysisRepository;
	}

	public void setFailedAnalysisRepository(ActivityRepository failedAnalysisRepository) {
		this.failedAnalysisRepository = failedAnalysisRepository;
	}

	public void setSuccededAnalysisRepository(ActivityRepository succededAnalysisRepository) {
		this.succededAnalysisRepository = succededAnalysisRepository;
	}

	public void setRunningAnalysisRepository(ActivityRepository runningAnalysisRepository) {
		this.runningAnalysisRepository = runningAnalysisRepository;
	}

	public void setParameterConstraints(Map<String, ParameterValidator> parameterConstraints) {
		this.parameterConstraints = parameterConstraints;
	}

	public void setInputDatasetConstraints(Map<String, InputDatasetValidator> inputDatasetConstraints) {
		this.inputDatasetConstraints = inputDatasetConstraints;
	}

	public void setJobManager(JobManager jobManager) {
		this.jobManager = jobManager;
	}

	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof ActivityRestConfig)) return false;
		final ActivityRestConfig other = (ActivityRestConfig) o;
		if (!other.canEqual((Object) this)) return false;
		final Object this$activityModel = this.getActivityModel();
		final Object other$activityModel = other.getActivityModel();
		if (this$activityModel == null ? other$activityModel != null : !this$activityModel.equals(other$activityModel))
			return false;
		final Object this$deploymentModel = this.getDeploymentModel();
		final Object other$deploymentModel = other.getDeploymentModel();
		if (this$deploymentModel == null ? other$deploymentModel != null : !this$deploymentModel.equals(other$deploymentModel))
			return false;
		final Object this$newAnalysisRepository = this.getNewAnalysisRepository();
		final Object other$newAnalysisRepository = other.getNewAnalysisRepository();
		if (this$newAnalysisRepository == null ? other$newAnalysisRepository != null : !this$newAnalysisRepository.equals(other$newAnalysisRepository))
			return false;
		final Object this$failedAnalysisRepository = this.getFailedAnalysisRepository();
		final Object other$failedAnalysisRepository = other.getFailedAnalysisRepository();
		if (this$failedAnalysisRepository == null ? other$failedAnalysisRepository != null : !this$failedAnalysisRepository.equals(other$failedAnalysisRepository))
			return false;
		final Object this$succededAnalysisRepository = this.getSuccededAnalysisRepository();
		final Object other$succededAnalysisRepository = other.getSuccededAnalysisRepository();
		if (this$succededAnalysisRepository == null ? other$succededAnalysisRepository != null : !this$succededAnalysisRepository.equals(other$succededAnalysisRepository))
			return false;
		final Object this$runningAnalysisRepository = this.getRunningAnalysisRepository();
		final Object other$runningAnalysisRepository = other.getRunningAnalysisRepository();
		if (this$runningAnalysisRepository == null ? other$runningAnalysisRepository != null : !this$runningAnalysisRepository.equals(other$runningAnalysisRepository))
			return false;
		final Object this$parameterConstraints = this.getParameterConstraints();
		final Object other$parameterConstraints = other.getParameterConstraints();
		if (this$parameterConstraints == null ? other$parameterConstraints != null : !this$parameterConstraints.equals(other$parameterConstraints))
			return false;
		final Object this$inputDatasetConstraints = this.getInputDatasetConstraints();
		final Object other$inputDatasetConstraints = other.getInputDatasetConstraints();
		if (this$inputDatasetConstraints == null ? other$inputDatasetConstraints != null : !this$inputDatasetConstraints.equals(other$inputDatasetConstraints))
			return false;
		final Object this$jobManager = this.getJobManager();
		final Object other$jobManager = other.getJobManager();
		if (this$jobManager == null ? other$jobManager != null : !this$jobManager.equals(other$jobManager))
			return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof ActivityRestConfig;
	}

	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $activityModel = this.getActivityModel();
		result = result * PRIME + ($activityModel == null ? 43 : $activityModel.hashCode());
		final Object $deploymentModel = this.getDeploymentModel();
		result = result * PRIME + ($deploymentModel == null ? 43 : $deploymentModel.hashCode());
		final Object $newAnalysisRepository = this.getNewAnalysisRepository();
		result = result * PRIME + ($newAnalysisRepository == null ? 43 : $newAnalysisRepository.hashCode());
		final Object $failedAnalysisRepository = this.getFailedAnalysisRepository();
		result = result * PRIME + ($failedAnalysisRepository == null ? 43 : $failedAnalysisRepository.hashCode());
		final Object $succededAnalysisRepository = this.getSuccededAnalysisRepository();
		result = result * PRIME + ($succededAnalysisRepository == null ? 43 : $succededAnalysisRepository.hashCode());
		final Object $runningAnalysisRepository = this.getRunningAnalysisRepository();
		result = result * PRIME + ($runningAnalysisRepository == null ? 43 : $runningAnalysisRepository.hashCode());
		final Object $parameterConstraints = this.getParameterConstraints();
		result = result * PRIME + ($parameterConstraints == null ? 43 : $parameterConstraints.hashCode());
		final Object $inputDatasetConstraints = this.getInputDatasetConstraints();
		result = result * PRIME + ($inputDatasetConstraints == null ? 43 : $inputDatasetConstraints.hashCode());
		final Object $jobManager = this.getJobManager();
		result = result * PRIME + ($jobManager == null ? 43 : $jobManager.hashCode());
		return result;
	}

	public String toString() {
		return "ActivityRestConfig(activityModel=" + this.getActivityModel() + ", deploymentModel=" + this.getDeploymentModel() + ", newAnalysisRepository=" + this.getNewAnalysisRepository() + ", failedAnalysisRepository=" + this.getFailedAnalysisRepository() + ", succededAnalysisRepository=" + this.getSuccededAnalysisRepository() + ", runningAnalysisRepository=" + this.getRunningAnalysisRepository() + ", parameterConstraints=" + this.getParameterConstraints() + ", inputDatasetConstraints=" + this.getInputDatasetConstraints() + ", jobManager=" + this.getJobManager() + ")";
	}
}
