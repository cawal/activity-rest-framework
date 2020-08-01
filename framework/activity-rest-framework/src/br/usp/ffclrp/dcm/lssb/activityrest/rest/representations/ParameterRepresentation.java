package br.usp.ffclrp.dcm.lssb.activityrest.rest.representations;

import java.util.List;

public class ParameterRepresentation {
	private final String name;
	private final List<Object> value;

	public ParameterRepresentation(String name, List<Object> value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return this.name;
	}

	public List<Object> getValue() {
		return this.value;
	}

	public boolean equals(final Object o) {
		if (o == this) return true;
		if (!(o instanceof ParameterRepresentation))
			return false;
		final ParameterRepresentation other = (ParameterRepresentation) o;
		if (!other.canEqual((Object) this)) return false;
		final Object this$name = this.getName();
		final Object other$name = other.getName();
		if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
		final Object this$value = this.getValue();
		final Object other$value = other.getValue();
		if (this$value == null ? other$value != null : !this$value.equals(other$value)) return false;
		return true;
	}

	protected boolean canEqual(final Object other) {
		return other instanceof ParameterRepresentation;
	}

	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $name = this.getName();
		result = result * PRIME + ($name == null ? 43 : $name.hashCode());
		final Object $value = this.getValue();
		result = result * PRIME + ($value == null ? 43 : $value.hashCode());
		return result;
	}

	public String toString() {
		return "ParameterRepresentation(name=" + this.getName() + ", value=" + this.getValue() + ")";
	}
}

