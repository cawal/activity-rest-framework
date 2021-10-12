package br.com.cawal.sddl.valueconverters;
import java.net.URL;
import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;

/**
 * This class extends/overrides the TerminalConvertes to add new IValueConverters
 * for user EDatatypes. Register this class in the DSL RuntimeModule class.
 */
public class ValueConverterService extends DefaultTerminalConverters {

	@ValueConverter(rule="URL")
	public IValueConverter<URL> URL() {
		return new UrlValueConverter();

	}

	@ValueConverter(rule="EString")
	public IValueConverter<String> EString() {
		return new EStringValueConverter();
	}
}



