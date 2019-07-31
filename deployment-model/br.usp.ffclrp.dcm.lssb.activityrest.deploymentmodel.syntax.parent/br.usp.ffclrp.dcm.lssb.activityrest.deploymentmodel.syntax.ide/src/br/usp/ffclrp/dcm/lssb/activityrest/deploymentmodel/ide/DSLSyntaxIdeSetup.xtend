/*
 * generated by Xtext 2.18.0
 */
package br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.ide

import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.DSLSyntaxRuntimeModule
import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.DSLSyntaxStandaloneSetup
import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class DSLSyntaxIdeSetup extends DSLSyntaxStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new DSLSyntaxRuntimeModule, new DSLSyntaxIdeModule))
	}
	
}
