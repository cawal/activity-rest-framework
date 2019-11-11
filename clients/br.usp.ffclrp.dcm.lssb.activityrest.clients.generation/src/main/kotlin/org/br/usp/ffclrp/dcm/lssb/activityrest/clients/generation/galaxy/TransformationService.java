package org.br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFReferenceModel;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage;
import edu.uoc.som.openapi.OpenAPIPackage;


public class TransformationService {

	  // METAMODELS
	  static final String AADL_METAMODEL_URI = 
			  AnalysisActivityDescriptionPackage.eNS_URI;
	  static final String BPMN_METAMODEL_URI =
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
	
}
