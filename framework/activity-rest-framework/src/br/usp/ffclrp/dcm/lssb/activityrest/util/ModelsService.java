package br.usp.ffclrp.dcm.lssb.activityrest.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import br.com.cawal.sddl.*;
import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.Deployment;
import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.DeploymentModelPackage;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivityModelPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage;
import br.com.cawal.ActDLStandaloneSetup;

/**
 * A number of utility methods for dealing with the Ecore-based models.
 * @author cawal
 */
public class ModelsService {
	
	/**
	 * Utility method to initialize the resources needed to 
	 * load AADM models using EMF's Resource API.
	 */
	private static void initializeEcoreModelsResources() {
		AnalysisActivityModelPackage.eINSTANCE.eClass();
		DeploymentModelPackage.eINSTANCE.eClass();
		AnalysisActivityDescriptionPackage.eINSTANCE.eClass();
	}

	/**
	 * Loads a AADM model represented as AADL from a InputStream.
	 * More info can be obtained at https://wiki.eclipse.org/Xtext/FAQ#How_do_I_load_my_model_in_a_standalone_Java_application.C2.A0.3F
	 * @param inputStream The InputStream to read the AADL description
	 * @return an representation object of the AADL/AADM model
	 * @throws IOException if fails to load
	 */
	public static Activity retrieveAADLModel(InputStream inputStream) 
			throws IOException {
		
		String uri = "dummy:/example.aadl";
		Activity activity = null;
		// Needed because Xtext only loads its generated grammar
		initializeEcoreModelsResources();
		
		// Register the grammar
		Injector injector = new ActDLStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		
		Resource resource = resourceSet.createResource(URI.createURI(uri));
		resource.load(inputStream, resourceSet.getLoadOptions());
		activity = (Activity) resource.getContents().get(0);
		
		return activity;
		
	}
	
	
	/**
	 * Serializes a AADL Activity as XMI into a file.
	 * Overwrites the file if it exists. 
	 * @param aadlModel The model to serialize as XMI.
	 * @param outputPath The path for the new file.
	 * @throws IOException 
	 */
	public static void writeAADLModelToXmi(Activity aadlModel,
			String outputPath) throws IOException {
		
		Resource.Factory.Registry resourceFactoriesRegistry 
						= Resource.Factory.Registry.INSTANCE;
        Map<String, Object> extensionFactoryMap 
        			= resourceFactoriesRegistry.getExtensionToFactoryMap();
        
        extensionFactoryMap.put("xmi", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // create a resource
        Resource resource = resSet.createResource(
        		URI.createURI(outputPath));
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        resource.getContents().add(aadlModel);

        // now save the content.
        resource.save(Collections.EMPTY_MAP);
		
	}
	
	
	
	public static Deployment retrieveDeploymentModel(InputStream inputStream)
			throws IOException {
		
		String uri = "dummy:/example.deployment";
		Deployment dep = null;
		// Needed because Xtext only loads its generated grammar
		initializeEcoreModelsResources();
		
		// Register the grammar
		Injector injector = new SDDLStandaloneSetup()
				.createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet =
				injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL,
				Boolean.TRUE);
		
		Resource resource = resourceSet.createResource(URI.createURI(uri));
		resource.load(inputStream, resourceSet.getLoadOptions());
		dep = (Deployment) resource.getContents().get(0);
		
		return dep;
		
	}
	
}
