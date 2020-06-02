package br.usp.ffclrp.dcm.lssb.activityrest.clients.generation

import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy.ModelsService
import java.io.File
import br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy.AadlToGalaxyToolWrapper
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXParseException;
import org.xmlunit.xpath.JAXPXPathEngine;
import java.io.FileInputStream
import org.junit.Ignore

@Ignore
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class AadlToGalaxyToolWrapperTest {

    private val transformationEngine = AadlToGalaxyToolWrapper();

    val activity by lazy {  
        var inputStream = this::class.java.getResourceAsStream("./activity.aadl")
        ModelsService.retrieveAADLModel(inputStream)
    }

    val deployment by lazy {
        var inputStream = this::class.java.getResourceAsStream("./activity.deployment")
        ModelsService.retrieveDeploymentModel(inputStream)
    }
    

    @Test
    fun `Execution creates a valid Xml file`() {

        val file = transformationEngine.generate(activity,deployment);

        assertAll("File exists",
                { assertNotNull(file, "Returned a null File instance.") },
                { assertTrue(file.exists(), "XML file does not exists") },
                { assertEquals("xml", file.extension, "Wrong extension!") },
                { assertTrue(isValidXmlFile(file)) }
        )
    }

    fun isValidXmlFile(file : File) : Boolean{
        val builder = getDocumentBuilder()
		val document = builder.parse(FileInputStream(file));
		return document != null
    }


    private fun getDocumentBuilder() : DocumentBuilder {
        
        val factory =
                DocumentBuilderFactory.newInstance();
        factory.setValidating(false);
        factory.setNamespaceAware(true);
        
        val builder = factory.newDocumentBuilder();
        builder.setErrorHandler(object : ErrorHandler {
            override fun error(exception: SAXParseException) {
                throw exception;
            }

            override fun fatalError(exception: SAXParseException) {
                throw exception;
            }

            override fun warning(exception: SAXParseException) {
                throw exception;
            }

        });
      
        return builder
    }

    private fun setXPathEngine(): JAXPXPathEngine {
        val xpathEngine = JAXPXPathEngine();
        xpathEngine.setNamespaceContext(mapOf(
                "wsdl" to "http://www.w3.org/ns/wsdl",
                "xs" to "http://www.w3.org/2001/XMLSchema",
                "whttp" to "http://www.w3.org/ns/wsdl/http",
                "wsdlx" to "http://www.w3.org/ns/wsdl-extension",
                "wrpc" to "http://www.w3.org/ns/wsdl/rpc"
        ));

        return xpathEngine
    }

}