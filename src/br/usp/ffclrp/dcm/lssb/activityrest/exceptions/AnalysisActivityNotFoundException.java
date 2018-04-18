package br.usp.ffclrp.dcm.lssb.activityrest.exceptions;

public class AnalysisActivityNotFoundException extends Exception {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  public AnalysisActivityNotFoundException(String analysisId) {
    super("Analysis " + analysisId + " was not found");
  }
}
