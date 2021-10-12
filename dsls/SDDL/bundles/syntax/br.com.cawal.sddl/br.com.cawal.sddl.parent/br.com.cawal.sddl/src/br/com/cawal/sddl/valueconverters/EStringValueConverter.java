package br.com.cawal.sddl.valueconverters;

import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter;
import org.eclipse.xtext.conversion.impl.STRINGValueConverter;
import org.eclipse.xtext.nodemodel.INode;

/**
 * @extends AbstractNullSafeConverter Automatically verifies if
 * the received string/value is null before executing the internal* methods.
 */
public class EStringValueConverter extends AbstractNullSafeConverter<String> {

	public String internalToValue(String string, INode node) {
		return new STRINGValueConverter().toValue(string, node);
	}

	public String internalToString(String value) {
		return new STRINGValueConverter().toString(value);
	}
}