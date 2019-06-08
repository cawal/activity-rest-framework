package br.usp.ffclrp.dcm.lssb.activityrest;

import java.io.IOException;
import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivityModelPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSLStandaloneSetup;
import edu.uoc.som.openapi.OpenAPIPackage;

/**
 * A number of utility methods for dealing with the Ecore-based models.
 * @author cawal
 *
 */
public class ModelsService {
	
	/**
	 * Utility method to initialize the resources needed to 
	 * load AADM models using EMF's Resource API.
	 */
	private static void initializeEcoreModelsResources() {
		AnalysisActivityModelPackage.eINSTANCE.eClass();
		AnalysisActivityDescriptionPackage.eINSTANCE.eClass();
		OpenAPIPackage.eINSTANCE.eClass();
	}

	/**
	 * Loads a AADM model represented as AADL from a InputStream.
	 * More info can be obtained at https://wiki.eclipse.org/Xtext/FAQ#How_do_I_load_my_model_in_a_standalone_Java_application.C2.A0.3F
	 * @param inputStream The InputStream to read the AADL description
	 * @return an representation object of the AADL/AADM model
	 * @throws IOException if fails to load
	 */
	public static Activity retrieveAADLModel(InputStream inputStream) throws IOException {
		String uri = "dummy:/example.aadl";
		Activity activity = null;
		// Needed because Xtext only loads its generated grammar
		initializeEcoreModelsResources();
		
		// Register the grammar
		Injector injector = new AnalysisActivityDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		
		Resource resource = resourceSet.createResource(URI.createURI(uri));
		resource.load(inputStream, resourceSet.getLoadOptions());
		activity = (Activity) resource.getContents().get(0);
		
		return activity;
		
	}
	
}
