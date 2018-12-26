package br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.jobs.exceptions;

import javax.validation.constraints.NotNull;

import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity;

public class JobCantStartException extends Throwable {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  final String analysisActivityId;
  
  public JobCantStartException(@NotNull AnalysisActivity aa) {
    this.analysisActivityId = aa.getId();
  }
  
}
