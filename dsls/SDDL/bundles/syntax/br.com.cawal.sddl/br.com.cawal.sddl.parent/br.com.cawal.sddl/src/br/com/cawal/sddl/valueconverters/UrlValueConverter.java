package br.com.cawal.sddl.valueconverters;

import java.net.MalformedURLException;
import java.net.URL;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter;
import org.eclipse.xtext.nodemodel.INode;

/**
 * @extends AbstractNullSafeConverter Automatically verifies if
 *          the received string/value is null before executing the internal*
 *          methods.
 */
public class UrlValueConverter extends AbstractNullSafeConverter<URL> {
	
	public URL internalToValue(String string, INode node)
			throws ValueConverterException {
		String cleanString = new EStringValueConverter().toValue(string, node);
		try {
			return new URL(cleanString);
		} catch (MalformedURLException e) {
			throw new ValueConverterException(cleanString, node, e);
		}
	}
	
	public String internalToString(URL value) throws ValueConverterException {
		return new EStringValueConverter().toString(value.toString());
	}
	
}