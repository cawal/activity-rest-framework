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
    

    @Test
    fun `Execution creates a directory`() {

        val file = generator.generate(activity,deployment);

        print(file)
        assertAll("File exists",
                { assertNotNull(file, "Returned a null File instance.") },
                { assertTrue(file.exists(), "Root directory does not exists") },
                { assertTrue(file.isDirectory(),"generated root is not a directory.")}
        )
    }

}