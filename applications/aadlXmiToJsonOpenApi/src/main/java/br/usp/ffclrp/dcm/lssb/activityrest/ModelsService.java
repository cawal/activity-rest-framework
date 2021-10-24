package br.usp.ffclrp.dcm.lssb.activityrest;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage;
import edu.uoc.som.openapi2.API;
import edu.uoc.som.openapi2.OpenAPI2Package;
import edu.uoc.som.openapi2.Root;

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
		AnalysisActivityDescriptionPackage.eINSTANCE.eClass();
		OpenAPI2Package.eINSTANCE.eClass();
	}

	public static Activity retrieveActivityFromXmi(URI resourceUri) {
		// Initialize the model
		initializeEcoreModelsResources();

        // Register the XMI resource factory for the .xmi extension
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // Get the resource
        Resource resource = resSet.getResource(resourceUri, true);
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        Activity activityObject = (Activity) resource.getContents().get(0);
        return activityObject;
	}
	
	public static API retrieveOpenApiFromXmi(URI resourceUri) {
		// Initialize the model
		initializeEcoreModelsResources();

        // Register the XMI resource factory for the .xmi extension
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // Get the resource
        Resource resource = resSet.getResource(resourceUri, true);
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        API apiObject = (API) resource.getContents().get(0);
        return apiObject;
	}
	
	
	public static Root retrieveOpenApiRootFromXmi(URI resourceUri) {
		// Initialize the model
		initializeEcoreModelsResources();

        // Register the XMI resource factory for the .xmi extension
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // Get the resource
        Resource resource = resSet.getResource(resourceUri, true);
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        Root root = (Root) resource.getContents().get(0);
        return root;
	}
}
