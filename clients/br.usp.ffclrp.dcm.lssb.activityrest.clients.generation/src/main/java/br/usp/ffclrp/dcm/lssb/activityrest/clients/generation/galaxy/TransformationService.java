package br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;

import org.eclipse.bpmn2.Bpmn2Package;
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

import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.DeploymentModelPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage;


public class TransformationService {

	  // METAMODELS
	  static final String AADL_METAMODEL_URI = 
			  AnalysisActivityDescriptionPackage.eNS_URI;
	  static final String BPMN_METAMODEL_URI =
			  Bpmn2Package.eNS_URI;
	  
	  /*
	   * Transformation modules
	   */
	  private static final String TRANSFORMATION_MODULE_URI = "aadl2bpmn.asm";




	  public static void aadl2bpmn(
			  					InputStream aadlSource, 
			  					OutputStream bpmnTarget,
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
	      resourceSet.getPackageRegistry().put(DeploymentModelPackage.eNS_URI,
	          DeploymentModelPackage.eINSTANCE);
	      

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

	      IReferenceModel bpmnMetamodel = modelFactory.newReferenceModel();
	      injector.inject(bpmnMetamodel, BPMN_METAMODEL_URI );
	      IModel bpmnModel = modelFactory.newModel(bpmnMetamodel);

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
	      transformationLauncher.addInModel(aadlModel, "IN", "AADL");
	      transformationLauncher.addOutModel(bpmnModel, "OUT", "BPMN");

	      transformationLauncher.launch(ILauncher.RUN_MODE, monitor, new HashMap<String, Object>(),
	          basicModule
	      );

	      /*
	       * extract model
	       */
	      extractor.extract(bpmnModel, bpmnTarget, new HashMap<String, Object>());
	      bpmnTarget.close();
	      /*
	       * Unload all models and metamodels (EMF-specific)
	       */
	      modelFactory.unload((EMFModel) bpmnModel);
	      modelFactory.unload((EMFModel) aadlModel);
	      modelFactory.unload((EMFReferenceModel) aadlMetamodel);
	      modelFactory.unload((EMFReferenceModel) bpmnMetamodel);

	    } catch (Exception e) {
	      System.err.println(e);
	      e.printStackTrace();
	    }
	  }
	
}
