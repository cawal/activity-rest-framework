package br.com.cawal.sddl.valueconverters;

import java.net.URL;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * @extends AbstractNullSafeConverter Automatically verifies if
 * the received string/value is null before executing the internal* methods.
 */
@SuppressWarnings("all")
public class UrlValueConverter extends AbstractNullSafeConverter<URL> {
  @Override
  public URL internalToValue(final String string, final INode node) throws ValueConverterException {
    try {
      final String cleanString = new EStringValueConverter().toValue(string, node);
      return new URL(cleanString);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public String internalToString(final URL value) throws ValueConverterException {
    return new EStringValueConverter().toString(value.toString());
  }
}
