package br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy

import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.*
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSLRuntimeModule
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSLStandaloneSetup
import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.StringListManipulatorsPackage
import com.google.inject.Guice
import com.google.inject.internal.asm.`$ClassWriter`
import org.eclipse.bpmn2.Bpmn2Package
import org.eclipse.bpmn2.DocumentRoot
import org.eclipse.bpmn2.util.Bpmn2ResourceFactoryImpl
import org.eclipse.bpmn2.util.Bpmn2XMIResourceFactoryImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.XMIResource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.serializer.impl.Serializer
import java.io.IOException
import java.io.InputStream
import java.io.PipedInputStream
import java.io.PipedOutputStream
import java.util.*

/**
 * A number of utility methods for dealing with the Ecore-based models.
 *
 * @author cawal
 */
object ModelsService {
    /**
     * Utility method to initialize the resources needed to
     * load AADM models using EMF's Resource API.
     */
    private fun initializeEcoreModelsResources() {
        AnalysisActivityDescriptionPackage.eINSTANCE.eClass()
        StringListManipulatorsPackage.eINSTANCE.eClass()
        DeploymentModelPackage.eINSTANCE.eClass()
        Bpmn2Package.eINSTANCE.eClass()
    }

    /**
     * Loads a AADM model represented as AADL from a InputStream.
     * More info can be obtained at
     * https://wiki.eclipse.org/Xtext/FAQ#How_do_I_load_my_model_in_a_standalone_Java_application.C2.A0.3F
     *
     * @param inputStream
     * The InputStream to read the AADL description
     * @return an representation object of the AADL/AADM model
     * @throws IOException
     * if fails to load
     */
    @Throws(IOException::class)
    fun retrieveAADLModel(inputStream: InputStream?): Activity {
        val uri = "dummy:/example.aadl"
        var activity: Activity? = null
        // Needed because Xtext only loads its generated grammar
        initializeEcoreModelsResources()

        // Register the grammar
        val injector = AnalysisActivityDSLStandaloneSetup()
            .createInjectorAndDoEMFRegistration()
        val resourceSet = injector.getInstance(XtextResourceSet::class.java)
        resourceSet.addLoadOption(
            XtextResource.OPTION_RESOLVE_ALL,
            true
        )
        val resource =
            resourceSet.createResource(URI.createURI(uri))
        resource.load(inputStream, resourceSet.loadOptions)
        activity =
            resource.contents[0] as Activity
        return activity
    }

    @Throws(IOException::class)
    fun retrieveDeploymentModel(inputStream: InputStream?): Deployment {
        val uri = "dummy:/example.deployment"
        var dep: Deployment? = null
        // Needed because Xtext only loads its generated grammar
        initializeEcoreModelsResources()

        // Register the grammar
        val injector = DSLSyntaxStandaloneSetupGenerated()
            .createInjectorAndDoEMFRegistration()
        val resourceSet = injector.getInstance(XtextResourceSet::class.java)
        resourceSet.addLoadOption(
            XtextResource.OPTION_RESOLVE_ALL,
            true
        )
        val resource =
            resourceSet.createResource(URI.createURI(uri))
        resource.load(inputStream, resourceSet.loadOptions)
        dep = resource.contents[0] as Deployment
        return dep
    }

    fun retrieveActivityFromXmi(resourceUri: URI?): Activity {
        // Initialize the model
        initializeEcoreModelsResources()

        // Register the XMI resource factory for the .xmi extension
        val reg =
            Resource.Factory.Registry.INSTANCE
        val m = reg.extensionToFactoryMap
        m["xmi"] = XMIResourceFactoryImpl()

        // Obtain a new resource set
        val resSet: ResourceSet = ResourceSetImpl()

        // Get the resource
        val resource = resSet.getResource(resourceUri, true)
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        return resource.contents[0] as Activity
    }

    fun writeAADLModelToXmi(
        aadlModel: Activity?,
        outputPath: String?
    ) {
        // TODO Auto-generated method stub i
        initializeEcoreModelsResources()
        val reg =
            Resource.Factory.Registry.INSTANCE
        val m = reg.extensionToFactoryMap
        m["xmi"] = XMIResourceFactoryImpl()

        // Obtain a new resource set
        val resSet: ResourceSet = ResourceSetImpl()

        // create a resource
        val resource = resSet.createResource(
            URI
                .createURI(outputPath)
        )
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        resource.contents.add(aadlModel)

        // now save the content.
        try {
            resource.save(Collections.EMPTY_MAP)
            println(resource.toString() + "is saved")
        } catch (e: IOException) {
            // TODO Auto-generated catch block
            e.printStackTrace()
        }
    }

    fun getAadlAsString(activity: Activity) : String {
        initializeEcoreModelsResources()
        val standaloneSetup = AnalysisActivityDSLStandaloneSetup()
        val injector = standaloneSetup.createInjectorAndDoEMFRegistration()
        val rs = injector.getInstance(ResourceSet::class.java)
        val resource = rs.createResource(URI.createURI("dummy/test.aadl"))
        resource.contents += activity
        //        val injector = Guice.createInjector(AnalysisActivityDSLRuntimeModule())
        val serializer = injector.getInstance (Serializer::class.java)
        val s = serializer.serialize(activity);
        return s
    }

    fun getDeploymentAsString(deployment : Deployment) : String {
        initializeEcoreModelsResources()
        val standaloneSetup = DSLSyntaxStandaloneSetup()
        val injector = standaloneSetup.createInjectorAndDoEMFRegistration()
        //val injector = Guice.createInjector(DSLSyntaxRuntimeModule())
        val serializer = injector.getInstance (Serializer::class.java)
        val s = serializer.serialize(deployment);
        return s
    }




//    fun writeAADLFile(
//        aadlModel: Activity?,
//        outputPath: String?
//    ) {
//        // TODO Auto-generated method stub i
//        val xtextStadaloneSetup = AnalysisActivityDSLStandaloneSetup()
//        xtextStadaloneSetup.createInjectorAndDoEMFRegistration()
//        val reg = Resource.Factory.Registry.INSTANCE
//        val m = reg.extensionToFactoryMap
//        m["aadl"] = XMIResourceFactoryImpl()
//
//        // Obtain a new resource set
//        val resSet: ResourceSet = ResourceSetImpl()
//
//        // create a resource
//        val resource = resSet.createResource(
//            URI
//                .createURI(outputPath)
//        )
//        // Get the first model element and cast it to the right type, in my
//        // example everything is hierarchical included in this first node
//        resource.contents.add(aadlModel)
//
//        // now save the content.
//        try {
//            resource.save(Collections.EMPTY_MAP)
//            println(resource.toString() + "is saved")
//        } catch (e: IOException) {
//            // TODO Auto-generated catch block
//            e.printStackTrace()
//        }
//    }



    @Throws(IOException::class)
    fun writeAADLModelToStream(aadlModel: Activity?): InputStream {
        initializeEcoreModelsResources()
        val `in` = PipedInputStream()
        val out = PipedOutputStream(`in`)
        val t = Thread(Runnable {
            val outputPath = UUID.randomUUID().toString() + ".xmi"
            val reg =
                Resource.Factory.Registry.INSTANCE
            val m = reg.extensionToFactoryMap
            m["xmi"] = XMIResourceFactoryImpl()

            // Obtain a new resource set
            val resSet: ResourceSet = ResourceSetImpl()

            // create a resource
            val resource = resSet.createResource(
                URI
                    .createURI(outputPath)
            )
            // Get the first model element and cast it to the right type, in
            // my
            // example everything is hierarchical included in this first
            // node
            resource.contents.add(aadlModel)

            // now save the content.
            try {
                resource.save(out, Collections.EMPTY_MAP)
                out.flush()
                out.close()
            } catch (e: IOException) {
                e.printStackTrace()
                System.exit(1)
            }
        })
        t.start()
        return `in`
    }

    fun retrieveBPMN(resourceUri: URI?): DocumentRoot {

        // Initialize the model
        initializeEcoreModelsResources()

        // Register the XMI resource factory for the .xmi extension
        val reg =
            Resource.Factory.Registry.INSTANCE
        val m = reg.extensionToFactoryMap
        m["bpmn2"] = Bpmn2ResourceFactoryImpl()

        // Obtain a new resource set
        val resSet: ResourceSet = ResourceSetImpl()
        resSet.packageRegistry[Bpmn2Package.eNS_URI] = Bpmn2Package.eINSTANCE
        // Get the resource
        val resource = resSet.getResource(resourceUri, true)
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        return resource.contents[0] as DocumentRoot
    }

    fun retrieveBpmnFromXmi(resourceUri: URI?): DocumentRoot {

        // Initialize the model
        initializeEcoreModelsResources()

        // Register the XMI resource factory for the .xmi extension
        val reg =
            Resource.Factory.Registry.INSTANCE
        val m = reg.extensionToFactoryMap
        m["bpmn2"] = Bpmn2XMIResourceFactoryImpl()
        m["bpmn2"] = Bpmn2XMIResourceFactoryImpl()

        // Obtain a new resource set
        val resSet: ResourceSet = ResourceSetImpl()

        // Get the resource
        val resource = resSet.getResource(resourceUri, true)
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        return resource.contents[0] as DocumentRoot
    }

    fun writeBpmn2Model(
        documentRoot: DocumentRoot?,
        outputPath: String?
    ) {
        // TODO Auto-generated method stub i
        initializeEcoreModelsResources()
        val reg =
            Resource.Factory.Registry.INSTANCE
        val m = reg.extensionToFactoryMap
        m["bpmn2"] = Bpmn2ResourceFactoryImpl()

        // Obtain a new resource set
        val resSet: ResourceSet = ResourceSetImpl()

//        resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
//            (Resource.Factory.Registry.DEFAULT_EXTENSION,
//             new DroolsResourceFactoryImpl());
//        resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
//            ("bpmn2",
//             new DroolsResourceFactoryImpl());
//        resSet.getPackageRegistry().put
//            (DroolsPackage.eNS_URI,
//            		DroolsPackage.eINSTANCE);
        resSet.resourceFactoryRegistry.extensionToFactoryMap["bpmn2"] = Bpmn2ResourceFactoryImpl()
        resSet.packageRegistry[Bpmn2Package.eNS_URI] = Bpmn2Package.eINSTANCE
        // create a resource
        val resource = resSet.createResource(
            URI
                .createURI(outputPath)
        )


//	    re.getDefaultSaveOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
//	    result.getDefaultSaveOptions().put(XMLResource.OPTION_LINE_WIDTH, 80);
//	    result.getDefaultSaveOptions().put(XMLResource.OPTION_URI_HANDLER,
//	    		new URIHandlerImpl.PlatformSchemeAware());
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        resource.contents.add(documentRoot)

        // now save the content.
        try {
            val saveOptions: MutableMap<Any?, Any?> =
                HashMap()
            //			final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
//			final Map<Object, Object> saveOptions = xmiresource.getDefaultSaveOptions();
            saveOptions[XMIResource.OPTION_SCHEMA_LOCATION] = true;//Boolean.TRUE
            //			saveOptions.put(XMLResource.OPTIOOPTION_PROXY_ATTRIBUTES, Boolean.TRUE);
            resource.save(saveOptions)
            //			resource.save(Collections.EMPTY_MAP);
            println(resource.toString() + "is saved")
        } catch (e: IOException) {
            // TODO Auto-generated catch block
            e.printStackTrace()
        }
    }
}