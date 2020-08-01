package br.usp.ffclrp.dcm.lssb.activityrest.domain.validation;

import java.util.Optional;

public class ValidationResult {
	private final boolean isValid;
	private final Optional<String> message;

	public ValidationResult(boolean isValid, Optional<String> message) {
		this.isValid = isValid;
		this.message = message;
	}

	public boolean isValid() {
		return this.isValid;
	}

	public Optional<String> getMessage() {
		return this.message;
	}

	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof ValidationResult)) return false;
		final ValidationResult other = (ValidationResult) o;
		if (!other.canEqual((Object) this)) return false;
		if (this.isValid() != other.isValid()) return false;
		final Object this$message = this.getMessage();
		final Object other$message = other.getMessage();
		if (this$message == null ? other$message != null : !this$message.equals(other$message)) return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof ValidationResult;
	}

	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		result = result * PRIME + (this.isValid() ? 79 : 97);
		final Object $message = this.getMessage();
		result = result * PRIME + ($message == null ? 43 : $message.hashCode());
		return result;
	}

	public String toString() {
		return "ValidationResult(isValid=" + this.isValid() + ", message=" + this.getMessage() + ")";
	}
}
