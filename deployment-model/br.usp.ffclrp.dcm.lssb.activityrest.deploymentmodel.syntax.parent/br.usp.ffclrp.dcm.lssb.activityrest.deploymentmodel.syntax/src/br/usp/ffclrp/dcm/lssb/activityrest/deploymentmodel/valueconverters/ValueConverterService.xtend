package br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.valueconverters

import org.eclipse.xtext.common.services.DefaultTerminalConverters
import org.eclipse.xtext.conversion.ValueConverter
import org.eclipse.xtext.conversion.IValueConverter
import java.net.URL
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.conversion.ValueConverterException

class ValueConverterService extends DefaultTerminalConverters {

	@ValueConverter(rule="URL")
	def IValueConverter<URL> URL() {
		return new IValueConverter<URL> {

			override URL toValue(String string, INode node) throws ValueConverterException {
				return new URL(clean(string));
			}

			override String toString(URL value) throws ValueConverterException {
				if (value === null) {
					return null;
				}

				return value.toString;
			}

			def String clean(String string) {
				var s = if (string.startsWith("'") || string.startsWith("\""))
						string.substring(1)
					else
						string
				s = if (s.endsWith("'") || s.endsWith("\""))
					s.substring(0, s.length - 1)
				else
					s

				return s
			}
		};

	}
}
