package br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.valueconverters

import java.net.URL
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter
import org.eclipse.xtext.nodemodel.INode

/**
 * @extends AbstractNullSafeConverter Automatically verifies if
 * the received string/value is null before executing the internal* methods.
 */
class UrlValueConverter extends AbstractNullSafeConverter<URL> {

	override URL internalToValue(String string, INode node) throws ValueConverterException {
		val cleanString = new EStringValueConverter().toValue(string,node)
		return new URL(cleanString)
	}

	override String internalToString(URL value) throws ValueConverterException {
		return new EStringValueConverter().toString(value.toString);
	}

}