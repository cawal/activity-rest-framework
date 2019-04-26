package br.usp.ffclrp.dcm.lssb.activityrest.jobmanagement.impl;

import lombok.Data;

@Data
public class ExitCode {

	private final int exitCode;
	private final TerminationStatus status;
	private final String description;
}
