package br.com.cawal.sddl.valueconverters;

import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter;
import org.eclipse.xtext.conversion.impl.STRINGValueConverter;
import org.eclipse.xtext.nodemodel.INode;

/**
 * @extends AbstractNullSafeConverter Automatically verifies if
 * the received string/value is null before executing the internal* methods.
 */
@SuppressWarnings("all")
public class EStringValueConverter extends AbstractNullSafeConverter<String> {
  @Override
  public String internalToValue(final String string, final INode node) {
    return new STRINGValueConverter().toValue(string, node);
  }
  
  @Override
  public String internalToString(final String value) {
    return new STRINGValueConverter().toString(value);
  }
}
