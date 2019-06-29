package br.usp.ffclrp.dcm.lssb.activityrest;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFReferenceModel;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage;
import edu.uoc.som.openapi.API;
import edu.uoc.som.openapi.OpenAPIPackage;
import edu.uoc.som.openapi.Root;
import edu.uoc.som.openapi.io.ExporterBuilder;
import edu.uoc.som.openapi.io.OpenAPIExporter;

import com.google.gson.Gson;
import com.google.gson.JsonObject;


public class TransformationService {

	  // METAMODELS
	  static final String AADL_METAMODEL_URI = 
			  AnalysisActivityDescriptionPackage.eNS_URI;
	  static final String OPENAPI_METAMODEL_URI =
			  OpenAPIPackage.eNS_URI;
	  
	  /*
	   * Transformation modules
	   */
	  private static final String TRANSFORMATION_MODULE_URI = "aadl2openAPI.asm";




	  public static void aadl2OpenAPI(
			  					InputStream aadlSource, 
			  					OutputStream openapiTarget,
			  					IProgressMonitor monitor) throws IOException {

	    
		if (monitor != null) {
	      monitor.subTask("AADL to OpenAPI transformation");
	    }

	    try {
	      // create transformation machinery
	      EMFModelFactory modelFactory = new EMFModelFactory();
	      EMFVMLauncher transformationLauncher = new EMFVMLauncher();
	      EMFInjector injector = new EMFInjector();
	      EMFExtractor extractor = new EMFExtractor();

	      /*
	       * Register packages and metamodels
	       */
	      ResourceSet resourceSet = modelFactory.getResourceSet();
	      resourceSet.getPackageRegistry().put(AnalysisActivityDescriptionPackage.eNS_URI,
	          AnalysisActivityDescriptionPackage.eINSTANCE);
	      resourceSet.getPackageRegistry().put(OpenAPIPackage.eNS_URI,
	          OpenAPIPackage.eINSTANCE);
	      

	      /*
	       * Load the transformation definition
	       */
	      InputStream transformationInputStream =
	          TransformationService.class.getResourceAsStream(
	        		  TRANSFORMATION_MODULE_URI);
	      System.out.println(transformationInputStream);
	      Object basicModule = transformationLauncher.loadModule(transformationInputStream);




	      /*
	       * Load metamodels
	       */
	      IReferenceModel aadlMetamodel = modelFactory.newReferenceModel();
	      injector.inject(aadlMetamodel, AADL_METAMODEL_URI);

	      IReferenceModel openapiMetamodel = modelFactory.newReferenceModel();
	      injector.inject(openapiMetamodel, OPENAPI_METAMODEL_URI);
	      IModel openapiModel = modelFactory.newModel(openapiMetamodel);

	      /*
	       * Load models
	       */
	      IModel aadlModel = modelFactory.newModel(aadlMetamodel);
	      injector.inject(aadlModel, aadlSource,new HashMap<String, Object>());

//	      System.out.println("Injecting profiles");
//	      EMFModel oboProfile = (EMFModel) modelFactory.newModel((EMFReferenceModel) umlMetamodel);
//	      injector.inject(oboProfile, oboProfileSource, new HashMap<String, Object>());
//	      oboProfile.getResource().setURI(
//	          URI.createPlatformPluginURI(OBODATAMODEL_PROFILE_PLATFORM_URI, true));
//
//	      EMFModel bfoProfile = (EMFModel) modelFactory.newModel((EMFReferenceModel)umlMetamodel);
//	      injector.inject(bfoProfile, bfoProfileSource, new HashMap<String, Object>());
//	      bfoProfile.getResource().setURI(
//	          URI.createPlatformPluginURI(BFO_PROFILE_PLATFORM_URI, true));
//
//	      
//	      EMFModel rocoreProfile = (EMFModel) modelFactory.newModel((EMFReferenceModel)umlMetamodel);
//	      injector.inject(rocoreProfile, rocoreProfileSource, new HashMap<String, Object>());
//
//	      rocoreProfile.getResource().setURI(
//	          URI.createPlatformPluginURI(RO_CORE_PROFILE_PLATFORM_URI, true));

	      
	      
//	      /*
//	       * Register profiles
//	       */
//	      Profile p = (Profile)
//	          oboProfile.getResource().getContents().get(0);
//	      registerProfiles(resourceSet,p); 
//	      p = (Profile)
//	          bfoProfile.getResource().getContents().get(0);
//	      registerProfiles(resourceSet,p); 
//	      p = (Profile)
//	          rocoreProfile.getResource().getContents().get(0);
//	      registerProfiles(resourceSet,p); 

	      /*
	       * Run transformation
	       */
	      System.out.println("Transforming...");

	      transformationLauncher.initialize(new HashMap<String, Object>());
	      transformationLauncher.addInModel(aadlModel, "IN", "aadl");
	      transformationLauncher.addOutModel(openapiModel, "OUT", "openapi");



	      transformationLauncher.launch(ILauncher.RUN_MODE, monitor, new HashMap<String, Object>(),
	          basicModule
	      );

	      /*
	       * extract model
	       */
	      extractor.extract(openapiModel, openapiTarget, new HashMap<String, Object>());
	      openapiTarget.close();
	      /*
	       * Unload all models and metamodels (EMF-specific)
	       */
	      modelFactory.unload((EMFModel) openapiModel);
	      modelFactory.unload((EMFModel) aadlModel);
	      modelFactory.unload((EMFReferenceModel) aadlMetamodel);
	      modelFactory.unload((EMFReferenceModel) openapiMetamodel);

	    } catch (Exception e) {
	      System.err.println(e);
	      e.printStackTrace();
	    }
	  }
	  
//	  public static Profile getProfileFromResource(String filePath, ResourceSet resSet) throws IOException {
//
//	    // Register the XMI resource factory for the .xmi extension
//	    Resource.Factory.Registry reg = resSet.getResourceFactoryRegistry();
//	    Map<String, Object> m = reg.getExtensionToFactoryMap();
//	    m.put("uml", new UMLResourceFactoryImpl());
//
//	    // Obtain a new resource set
//	    resSet.getLoadOptions().put(XMIResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
//	    resSet.getLoadOptions().put(XMIResource.OPTION_ENCODING, "UTF-8");
//	    // Get the resource
//	    Resource resource = resSet.getResource(URI.createURI(filePath), true);
//	      resource.load(resSet.getLoadOptions());
//	    
//	    // Get the first model element and cast it to the right type, in my
//	    // example everything is hierarchical included in this first node
//	    return (Profile) resource.getContents().get(0);
//	  }
//	  
//	  
//	  
//	  
//	  /**
//	   * Register profile in all points of the ResourceSet, 
//	   * allowing then to be used within the resourceSet 
//	   * @param resourceSet
//	   * @param profile
//	   * @throws IOException
//	   */
//	  public static void registerProfiles(ResourceSet resourceSet, Profile profile) throws IOException {
//	    
//	    // registering package
//	    EPackage profilePackage = profile.getDefinition(); 
//	    resourceSet.getPackageRegistry().put(profilePackage.getNsURI(),profilePackage);
//	    
//	    // registering URI conversions
//	    resourceSet.getURIConverter().getURIMap().put(
//	        URI.createURI(profile.getURI()),
//	        URI.createURI("pathmap://UML_PROFILES/"+profilePackage.getNsPrefix()+".profile.uml")
//	        );
//	    
//	    // Registering profile maps
//	    Map<String,URI> epackageNSURI2profileLocationMap = UMLPlugin.getEPackageNsURIToProfileLocationMap();
//	    epackageNSURI2profileLocationMap.put(
//	        profilePackage.getNsURI(), 
//	        URI.createURI("pathmap://UML_PROFILES//"+profilePackage.getNsPrefix()+".profile.uml#_0")
//	        );
//	    
//	  
//	  }
	
}
