package tests.xml;

import static org.junit.Assert.*;

import java.io.InputStream;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.xml.sax.SAXException;

public class ValidateXMLSchema {
	
	Validator validator;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	@Before
	public void setUp() throws Exception {

	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testMinimumAnalysisActivity() throws SAXException {
		validateXml(getTestResource("minimum-aa.xml"));
	}
	
	@Test
	public void testSingleParameterAnalysisActivity() throws SAXException {
		validateXml(getTestResource("1parameter-aa.xml"));
	}

	public InputStream getTestResource(String xmlResourceName) {
		return this.getClass().getResourceAsStream(xmlResourceName);
	}

	
	
	public void validateXml(InputStream xmlIS) throws SAXException {
		Source xmlFile = new StreamSource(xmlIS);
		
		SchemaFactory schemaFactory = 
				SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		
		InputStream xsdResourceStream = 
				this.getClass().getResourceAsStream("service-messages.xsd");
		Schema schema = schemaFactory
				.newSchema(new StreamSource(xsdResourceStream));
		
		Validator validator = schema.newValidator();
		
		try {
			validator.validate(xmlFile);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
}
