package br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy;

import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;

import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.DocumentRoot;
import org.eclipse.bpmn2.util.Bpmn2ResourceFactoryImpl;
import org.eclipse.bpmn2.util.Bpmn2XMIResourceFactoryImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.DSLSyntaxStandaloneSetupGenerated;
import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.Deployment;
import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.DeploymentModelPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSLStandaloneSetup;

/**
 * A number of utility methods for dealing with the Ecore-based models.
 * 
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
		DeploymentModelPackage.eINSTANCE.eClass();
		Bpmn2Package.eINSTANCE.eClass();
	}
	
	/**
	 * Loads a AADM model represented as AADL from a InputStream.
	 * More info can be obtained at
	 * https://wiki.eclipse.org/Xtext/FAQ#How_do_I_load_my_model_in_a_standalone_Java_application.C2.A0.3F
	 * 
	 * @param inputStream
	 *            The InputStream to read the AADL description
	 * @return an representation object of the AADL/AADM model
	 * @throws IOException
	 *             if fails to load
	 */
	public static Activity retrieveAADLModel(InputStream inputStream)
			throws IOException {
		
		String uri = "dummy:/example.aadl";
		Activity activity = null;
		// Needed because Xtext only loads its generated grammar
		initializeEcoreModelsResources();
		
		// Register the grammar
		Injector injector = new AnalysisActivityDSLStandaloneSetup()
				.createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet =
				injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL,
				Boolean.TRUE);
		
		Resource resource = resourceSet.createResource(URI.createURI(uri));
		resource.load(inputStream, resourceSet.getLoadOptions());
		activity = (Activity) resource.getContents().get(0);
		
		return activity;
		
	}
	
	public static Deployment retrieveDeploymentModel(InputStream inputStream)
			throws IOException {
		
		String uri = "dummy:/example.deployment";
		Deployment dep = null;
		// Needed because Xtext only loads its generated grammar
		initializeEcoreModelsResources();
		
		// Register the grammar
		Injector injector = new DSLSyntaxStandaloneSetupGenerated()
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
	
	public static void writeAADLModelToXmi(Activity aadlModel,
			String outputPath) {
		// TODO Auto-generated method stub i
		initializeEcoreModelsResources();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		
		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
		
		// create a resource
		Resource resource = resSet.createResource(URI
				.createURI(outputPath));
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		resource.getContents().add(aadlModel);
		
		// now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
			System.out.println(resource + "is saved");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static InputStream writeAADLModelToStream(final Activity aadlModel)
			throws IOException {
		
		initializeEcoreModelsResources();
		
		PipedInputStream in = new PipedInputStream();
		final PipedOutputStream out = new PipedOutputStream(in);
		
		Thread t = new Thread(new Runnable() {
			
			public void run() {
				String outputPath = UUID.randomUUID().toString() + ".xmi";
				Resource.Factory.Registry reg =
						Resource.Factory.Registry.INSTANCE;
				Map<String, Object> m = reg.getExtensionToFactoryMap();
				m.put("xmi", new XMIResourceFactoryImpl());
				
				// Obtain a new resource set
				ResourceSet resSet = new ResourceSetImpl();
				
				// create a resource
				Resource resource = resSet.createResource(URI
						.createURI(outputPath));
				// Get the first model element and cast it to the right type, in
				// my
				// example everything is hierarchical included in this first
				// node
				resource.getContents().add(aadlModel);
				
				// now save the content.
				try {
					resource.save(out, Collections.EMPTY_MAP);
					out.flush();
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.exit(1);
				}
				
			}
		});
		t.start();
		
		return in;
		
	}
	
	public static DocumentRoot retrieveBPMN(URI resourceUri) {
		
		// Initialize the model
		initializeEcoreModelsResources();
		
		// Register the XMI resource factory for the .xmi extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("bpmn2", 
             new Bpmn2ResourceFactoryImpl());
		
		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
		
        resSet.getPackageRegistry().put(Bpmn2Package.eNS_URI,Bpmn2Package.eINSTANCE);
		// Get the resource
		Resource resource = resSet.getResource(resourceUri, true);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		DocumentRoot bpmn2Object = (DocumentRoot) resource.getContents().get(0);
		return bpmn2Object;
	}
	
	public static DocumentRoot retrieveBpmnFromXmi(URI resourceUri) {
		
		// Initialize the model
		initializeEcoreModelsResources();
		
		// Register the XMI resource factory for the .xmi extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("bpmn2", new Bpmn2XMIResourceFactoryImpl());
		m.put("bpmn2", new Bpmn2XMIResourceFactoryImpl());
		
		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
		
		// Get the resource
		Resource resource = resSet.getResource(resourceUri, true);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		DocumentRoot bomn2Object = (DocumentRoot) resource.getContents().get(0);
		return bomn2Object;
	}
	
	public static void writeBpmn2Model(DocumentRoot documentRoot,
			String outputPath) {
		// TODO Auto-generated method stub i
		initializeEcoreModelsResources();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("bpmn2", new Bpmn2ResourceFactoryImpl());
		
		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
		 
//        resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
//            (Resource.Factory.Registry.DEFAULT_EXTENSION, 
//             new DroolsResourceFactoryImpl());
//        resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
//            ("bpmn2", 
//             new DroolsResourceFactoryImpl());
//        resSet.getPackageRegistry().put
//            (DroolsPackage.eNS_URI, 
//            		DroolsPackage.eINSTANCE);
        resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
            ("bpmn2", 
             new Bpmn2ResourceFactoryImpl());
        resSet.getPackageRegistry().put(Bpmn2Package.eNS_URI,Bpmn2Package.eINSTANCE);
		// create a resource
		Resource resource = resSet.createResource(URI
				.createURI(outputPath));
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		resource.getContents().add(documentRoot);
		
		// now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
			System.out.println(resource + "is saved");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
