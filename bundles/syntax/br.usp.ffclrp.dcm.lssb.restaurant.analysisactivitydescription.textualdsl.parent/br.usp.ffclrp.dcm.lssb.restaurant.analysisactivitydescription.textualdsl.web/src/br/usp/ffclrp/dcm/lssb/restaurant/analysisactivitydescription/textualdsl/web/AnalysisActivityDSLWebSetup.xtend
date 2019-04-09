/*
 * generated by Xtext 2.14.0
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.web

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSLRuntimeModule
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSLStandaloneSetup
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.ide.AnalysisActivityDSLIdeModule
import com.google.inject.Guice
import com.google.inject.Injector
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages in web applications.
 */
class AnalysisActivityDSLWebSetup extends AnalysisActivityDSLStandaloneSetup {
	
	override Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new AnalysisActivityDSLRuntimeModule, new AnalysisActivityDSLIdeModule, new AnalysisActivityDSLWebModule))
	}
	
}
