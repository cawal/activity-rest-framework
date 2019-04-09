package br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.exceptions;

import javax.validation.constraints.NotNull;

public class JobCancellationException extends Throwable {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  final String jobId;
  
  public JobCancellationException(@NotNull String jobId) {
    this.jobId = jobId;
  }
  
}
