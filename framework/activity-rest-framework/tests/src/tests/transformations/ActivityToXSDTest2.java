package tests.transformations;

import static org.junit.jupiter.api.Assertions.*;

import java.net.InetAddress;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.xtext.util.StringInputStream;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import br.usp.ffclrp.dcm.lssb.activityrest.util.ModelsService;
import br.usp.ffclrp.dcm.lssb.activityrest.wsdl.ActivityToXsdTransformationService;
import br.usp.ffclrp.dcm.lssb.activityrest.wsdl.DeploymentModel;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;

class ActivityToXSDTest2 {
	
	static DeploymentModel deploymentModel;
	static Activity activityModel;
	static String xmlString;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		deploymentModel = new DeploymentModel("http",
				InetAddress.getByName("localhost"),
				8080,
				"test");
		activityModel =
				ModelsService.retrieveAADLModel(
						ActivityToXSDTest2.class
								.getResourceAsStream("./activity.aadl"));
		xmlString = ActivityToXsdTransformationService
				.toXsd(activityModel, deploymentModel);
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
	
	@BeforeEach
	void setUp() throws Exception {
	}
	
	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void validXML() throws Exception {
		
		DocumentBuilderFactory factory =
				DocumentBuilderFactory.newInstance();
		factory.setValidating(false);
		factory.setNamespaceAware(true);
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		builder.setErrorHandler(new EmptyErrorHandler());
		// the "parse" method also validates XML, will throw an exception if
		// misformatted
		Document document = builder.parse(new StringInputStream(xmlString));
		assertNotNull(document, "XSL document is null!");
	}
	
	class EmptyErrorHandler implements org.xml.sax.ErrorHandler {
		
		@Override
		public void error(SAXParseException exception) throws SAXException {
			throw exception;
		}
		
		@Override
		public void fatalError(SAXParseException exception)
				throws SAXException {
			throw exception;
		}
		
		@Override
		public void warning(SAXParseException exception) throws SAXException {
			throw exception;
		}
		
	}
}

