package br.usp.ffclrp.dcm.lssb.activityrest.rest.job.exceptions;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetKind;

public class InvalidCommandLineDefinition extends Exception {

	  /**
	   * 
	   */
	  private static final long serialVersionUID = 1L;

	  public InvalidCommandLineDefinition(String datasetName, DatasetKind datasetKind) {
	    super("Dataset " + datasetName + " is of a invalid kind  for a command line referenced dataset");
	  }
}
