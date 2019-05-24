package br.usp.ffclrp.dcm.lssb.activityrest.domain.validation;

import java.util.Optional;

import lombok.Data;

@Data
public class ValidationResult {
	private final boolean isValid;
	private final Optional<String> message;
}
