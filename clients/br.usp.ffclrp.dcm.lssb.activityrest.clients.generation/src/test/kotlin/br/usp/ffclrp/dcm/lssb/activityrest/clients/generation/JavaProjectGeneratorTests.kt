package br.usp.ffclrp.dcm.lssb.activityrest.clients.generation

import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import AadlToBpmn
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionFactory
import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.DeploymentModelFactory
import br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy.ModelsService
import java.net.URI
import org.eclipse.emf.common.util.URI as EmfUri
import java.io.InputStream
import java.io.File
import br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy.BpmnToJbpm
import br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy.AadlToGalaxyToolWrapper
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xmlunit.builder.Input;
import org.xmlunit.xpath.JAXPXPathEngine;
import org.xmlunit.xpath.XPathEngine;
import java.io.FileInputStream
import br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy.JavaProjectGenerator

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class JavaProjectGeneratorTests {

    private val generator = JavaProjectGenerator();

    val activity by lazy {  
        var inputStream = this::class.java.getResourceAsStream("./david.aadl")
        ModelsService.retrieveAADLModel(inputStream)
    }
    
    val deployment by lazy {  
        var inputStream = this::class.java.getResourceAsStream("./david.deployment")
        ModelsService.retrieveDeploymentModel(inputStream)
    }
    
    val generatedProject by lazy {
        generator.generate(activity,deployment);
    }
    

    @Test
    fun `Execution creates a directory`() {

        assertAll("File exists",
                { assertNotNull(generatedProject, "Returned a null File instance.") },
                { assertTrue(generatedProject.exists(), "Root directory does not exists") },
                { assertTrue(generatedProject.isDirectory(),"generated root is not a directory.")}
        )
    }
    
    @Test
    fun `Execution creates a Maven project`() {

        println("generated project: ${generatedProject.getAbsolutePath()}")
        val pomFile = File(generatedProject, "pom.xml")
        println("pomfile: ${pomFile.getAbsolutePath()}")
        assertAll("Returned file is not a Maven project!",
                { assertTrue((pomFile.exists()),
                         "POM file does not exists")
                }
        )

    }
    
    @Test
    fun `Execution creates activity-specific files`(){
        val cliFile = File(generatedProject,"src/main/java/app-activity-specific.kt")
        assertAll("Do not generates the activity-specific files!",
                { assertTrue(cliFile.exists())}
        )
    }





}