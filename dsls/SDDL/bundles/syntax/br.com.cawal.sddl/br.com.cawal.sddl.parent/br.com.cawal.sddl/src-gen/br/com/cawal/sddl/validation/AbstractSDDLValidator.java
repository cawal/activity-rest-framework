/*
 * generated by Xtext 2.25.0
 */
package br.com.cawal.sddl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractSDDLValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://dcm.ffclrp.usp.br/lssb/metamodels/deployment-model.ecore"));
		return result;
	}
}