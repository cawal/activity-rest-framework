/*
 * generated by Xtext 2.25.0
 */
package br.com.cawal.sddl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SDDLAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("br/com/cawal/sddl/parser/antlr/internal/InternalSDDL.tokens");
	}
}
