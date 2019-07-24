package tests.transformations;

import static org.junit.jupiter.api.Assertions.*;

import java.net.InetAddress;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;

import org.eclipse.xtext.util.StringInputStream;
import org.junit.jupiter.api.*;
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

import br.usp.ffclrp.dcm.lssb.activityrest.util.ModelsService;
import br.usp.ffclrp.dcm.lssb.activityrest.wsdl.ActivityToWsdlTransformationService;
import br.usp.ffclrp.dcm.lssb.activityrest.wsdl.ActivityToXsdTransformationService;
import br.usp.ffclrp.dcm.lssb.activityrest.wsdl.DeploymentModel;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Parameter;

import static br.usp.ffclrp.dcm.lssb.activityrest.wsdl.ActivityToXsdTransformationService.xsdElementName;

@DisplayName("A WSDL document can be obtained from an AADL model")
class ActivityToWsdlTest {
	
	static DeploymentModel deploymentModel;
	static Activity activityModel;
	static String xmlString;
	static DocumentBuilder builder;
	static String serviceLocation;
	
	static Source source;
	static Map<String, String> prefix2UriNsContext;
	static XPathEngine xpathEngine;
	
	static String xsdLocation;
	static String wsdlLocation;
	
	static final String wsdlInterfaceName = "interface";
	static final String wsdlBindingName = "binding";
	static final String wsdlServiceName = "service";
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		deploymentModel = new DeploymentModel("http",
				InetAddress.getByName("localhost"),
				8080,
				"test");
		serviceLocation = deploymentModel.serviceRootPath();
		activityModel =
				ModelsService.retrieveAADLModel(
						ActivityToWsdlTest.class
								.getResourceAsStream("./activity.aadl"));
		xmlString = ActivityToWsdlTransformationService
				.toWsdl(activityModel, deploymentModel);
		
		setXmlDocumentBuilder();
		
		source = Input.fromString(xmlString).build();
		
		xsdLocation = deploymentModel.serviceRootPath() + "/xsd";
		wsdlLocation = deploymentModel.serviceRootPath() + "/wsdl";
		setXPathEngine();
	}
	
	private static void setXmlDocumentBuilder()
			throws ParserConfigurationException {
		DocumentBuilderFactory factory =
				DocumentBuilderFactory.newInstance();
		factory.setValidating(false);
		factory.setNamespaceAware(true);
		builder = factory.newDocumentBuilder();
		builder.setErrorHandler(new ErrorHandler() {
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
			public void warning(SAXParseException exception)
					throws SAXException {
				throw exception;
			}
			
		});
	}
	
	private static void setXPathEngine() {
		xpathEngine = new JAXPXPathEngine();
		prefix2UriNsContext = new HashMap<>();
		
		prefix2UriNsContext.put("wsdl", "http://www.w3.org/ns/wsdl");
		prefix2UriNsContext.put("xs", "http://www.w3.org/2001/XMLSchema");
		prefix2UriNsContext.put("whttp", "http://www.w3.org/ns/wsdl/http");
		prefix2UriNsContext.put("wsdlx", "http://www.w3.org/ns/wsdl-extension");
		prefix2UriNsContext.put("wrpc", "http://www.w3.org/ns/wsdl/rpc");
		prefix2UriNsContext.put("aa", xsdLocation);
		
		xpathEngine.setNamespaceContext(prefix2UriNsContext);
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
	@DisplayName("that is a valid XML")
	void validXML() throws Exception {
		// the "parse" method also validates XML, will throw an exception if
		// misformatted
		Document document = builder.parse(new StringInputStream(xmlString));
		assertNotNull(document, "XSL document is null!");
	}
	
	@Nested
	@DisplayName("and also")
	class ValidationConstraints {
		
		@Test
		@DisplayName("its target namespace is the location of the WSDL in the service")
		void targetNamespaceIsTheServiceLocationInDeploymentModel() {
			
			String targetNamespace = xpathEngine
					.evaluate("/wsdl:description/@targetNamespace", source);
			String tnsNamespaceValue = xpathEngine
					.evaluate("/*/namespace::*[name()='tns']", source);
			
			assertEquals(deploymentModel.serviceRootPath() + "/wsdl",
					tnsNamespaceValue);
			assertEquals(targetNamespace, tnsNamespaceValue,
					"Target namespace and xmlns:tns are different");
		}
		
		@Test
		@DisplayName("all the needed namespaces are declared")
		void allNamespacesAreDeclared() {
			
			Iterable<Node> allMatches =
					xpathEngine.selectNodes("/wsdl:description/namespace::*",
							source);
			
			boolean allMatchedNodesAreAttributes =
					StreamSupport.stream(allMatches.spliterator(), false)
							.allMatch(n -> {
								return (n.getNodeType() == Node.ATTRIBUTE_NODE);
							});
			assertTrue(allMatchedNodesAreAttributes);
			
			Map<String, String> declaredNamespaces = StreamSupport
					.stream(allMatches.spliterator(), false)
					.map(n -> (Attr) n)
					.collect(Collectors.toMap(Attr::getName, Attr::getValue));
			
			assertTrue(prefix2UriNsContext.entrySet().stream()
					.allMatch(ns -> {
						String xmlns = "xmlns:" + ns.getKey();
						return declaredNamespaces.containsKey(xmlns)
								&& declaredNamespaces
										.get(xmlns)
										.equals(ns.getValue());
						
					}), "Some namespace is not declared!");
		}
		
		@Test
		@DisplayName("it imports the XSD types")
		void importXsdTypes() {
			String xpathQuery = "/wsdl:description/wsdl:types/xs:import";
			Iterable<Node> matched =
					xpathEngine.selectNodes(xpathQuery, source);
			
			List<Node> nodes =
					StreamSupport.stream(matched.spliterator(), false)
							.collect(Collectors.toList());
			
			assertTrue(nodes.size() > 0, "No XML schemas declared.");
			assertTrue(nodes.size() == 1,
					"n>1 XML schemas declared. Change THIS TEST.");
			
			Element xsElement = (Element) nodes.get(0);
			
			String namespace = xsElement.getAttribute("namespace");
			assertEquals(xsdLocation, namespace,
					"XS:IMPORT element namespace is wrong");
			
			String schemaLocation = xsElement.getAttribute("schemaLocation");
			assertEquals("./xsd", schemaLocation,
					"XS:IMPORT schemaLocation is wrong");
			
		}
		
		@Test
		@DisplayName("it provides a wsdl:interface element")
		void providesInterfaceElement() {
			String xpathQuery = "/wsdl:description/wsdl:interface";
			Iterable<Node> matched =
					xpathEngine.selectNodes(xpathQuery, source);
			
			List<Node> nodes =
					StreamSupport.stream(matched.spliterator(), false)
							.collect(Collectors.toList());
			
			assertTrue(nodes.size() > 0, "No wsdl:interface declared.");
			assertTrue(nodes.size() == 1,
					"n>1 wsdl:interface declared. Change THIS TEST.");
			
			Element wsdlEndpoint = (Element) nodes.get(0);
			
			String name = wsdlEndpoint.getAttribute("name");
			assertEquals(wsdlInterfaceName, name,
					"wsdl:interface@name is wrong");
		}
		
		@Test
		@DisplayName("it provides a wsdl:binding element")
		void providesBindingsElement() {
			String xpathQuery = "/wsdl:description/wsdl:binding";
			Iterable<Node> matched =
					xpathEngine.selectNodes(xpathQuery, source);
			
			List<Node> nodes =
					StreamSupport.stream(matched.spliterator(), false)
							.collect(Collectors.toList());
			
			assertTrue(nodes.size() > 0, "No wsdl:binding declared.");
			assertTrue(nodes.size() == 1,
					"n>1 wsdl:binding declared. Change THIS TEST.");
			
			Element wsdlEndpoint = (Element) nodes.get(0);
			
			String name = wsdlEndpoint.getAttribute("name");
			assertEquals(wsdlBindingName, name, "wsdl:bindings@name is wrong");
			
			String interfaceReference = wsdlEndpoint.getAttribute("interface");
			assertEquals("tns:" + wsdlInterfaceName, interfaceReference,
					"wsdl:bindings@interface is wrong");
			
			String type = wsdlEndpoint.getAttribute("type");
			assertEquals("http://www.w3.org/ns/wsdl/http", type,
					"wsdl:bindings@type is wrong");
			
			String methodDefault =
					wsdlEndpoint.getAttribute("whttp:methodDefault");
			assertEquals("GET", methodDefault,
					"wsdl:bindings@whttp:methodDefault is wrong");
			
			String safe = wsdlEndpoint.getAttribute("wsdlx:safe");
			assertEquals("true", safe, "wsdl:bindings@wsdlx:safe is wrong");
		}
		
		@Test
		@DisplayName("it provides a wsdl:service element")
		void presentsServiceConfig() {
			String xpathQuery = "/wsdl:description/wsdl:service";
			Iterable<Node> matched =
					xpathEngine.selectNodes(xpathQuery, source);
			
			List<Node> nodes =
					StreamSupport.stream(matched.spliterator(), false)
							.collect(Collectors.toList());
			
			assertTrue(nodes.size() > 0, "No wsdl:service declared.");
			assertTrue(nodes.size() == 1,
					"n>1 wsdl:service declared. Change THIS TEST.");
			
			Element wsdlEndpoint = (Element) nodes.get(0);
			
			String name = wsdlEndpoint.getAttribute("name");
			assertEquals(wsdlServiceName, name, "wsdl:service@name is wrong");
			
			String interfaceReference = wsdlEndpoint.getAttribute("interface");
			assertEquals("tns:" + wsdlInterfaceName, interfaceReference,
					"wsdl:service@interface is wrong");
		}
		
		@Test
		@DisplayName("it provides the correct wsdl:endpoint element")
		void presentsServiceEndpointConfig() {
			String xpathQuery = "/wsdl:description/wsdl:service/wsdl:endpoint";
			Iterable<Node> matched =
					xpathEngine.selectNodes(xpathQuery, source);
			
			List<Node> nodes =
					StreamSupport.stream(matched.spliterator(), false)
							.collect(Collectors.toList());
			
			assertTrue(nodes.size() > 0, "No wsdl:endpoints declared.");
			assertTrue(nodes.size() == 1,
					"n>1 wsdl:endpoints declared. Change THIS TEST.");
			
			Element wsdlEndpoint = (Element) nodes.get(0);
			
			String name = wsdlEndpoint.getAttribute("name");
			assertNotNull(name, "wsdl:endpoint@name is null");
			
			String binding = wsdlEndpoint.getAttribute("binding");
			assertEquals("tns:" + wsdlBindingName, binding);
			
			String address = wsdlEndpoint.getAttribute("address");
			assertEquals(deploymentModel.serviceRootPath(), address,
					"wsdl:endpoint@address is wrong");
			
		}
		
		@Test
		@DisplayName("for each parameter it provides the operations at the interface")
		void presentsInterfaceOperationsForParameters() {
			activityModel.getParameters().stream()
					.forEach(p -> {
						providesRetrievalInterface(p);
						providesUpdateInterface(p);
					});
		}
		
		void providesRetrievalInterface(Parameter p) {
			String[] prefixes = new String[] {
					"get-failed-activity-",
					"get-new-activity-",
					"get-succeded-activity-" };
			
			for (String prefix : prefixes) {
				String operationIdentifier = prefix + xsdElementName(p);
				providesRetrievalInterface(p, operationIdentifier);
			}
			
		}
		
		void providesRetrievalInterface(Parameter p,
				String operationIdentifier) {
			System.out.println(p);
			
			String xpathQuery = "/wsdl:description/wsdl:interface"
					+ "/wsdl:operation[contains(@name,"
					+ "\"" + operationIdentifier + "\")]";
			System.out.println(xpathQuery);
			Iterable<Node> matched =
					xpathEngine.selectNodes(xpathQuery, source);
			
			List<Node> nodes =
					StreamSupport.stream(matched.spliterator(), false)
							.collect(Collectors.toList());
			
			assertEquals(1, nodes.size(),
					"(n != 1) wsdl:operations for operation "
							+ operationIdentifier);
			
			System.out.println(nodes);
			
			Element wsdlOperation = (Element) nodes.get(0);
			
			String pattern = wsdlOperation.getAttribute("pattern");
			assertEquals("http://www.w3.org/ns/wsdl/in-out", pattern);
			
			String safe = wsdlOperation.getAttribute("wsdlx:safe");
			assertEquals("true", safe);
			
			String inputIdentifier = "aa:ActivityIdBasedRequest";
			
			String inputReference = wsdlOperation
					.getElementsByTagName("wsdl:input").item(0)
					.getAttributes().getNamedItem("element").getNodeValue();

			assertEquals(inputIdentifier, inputReference);

			String outputIdentifier = "aa:" + xsdElementName(p);
			String outputReference = wsdlOperation
					.getElementsByTagName("wsdl:output").item(0)
					.getAttributes().getNamedItem("element").getNodeValue();

			assertEquals(outputIdentifier, outputReference);

		}
		
		void providesUpdateInterface(Parameter p) {
			System.out.println(p);
			String operationIdentifier = "put-new-activity-"
					+ xsdElementName(p);
			
			String xpathQuery = "/wsdl:description/wsdl:interface"
					+ "/wsdl:operation[contains(@name,"
					+ "\"" + operationIdentifier + "\")]";
			System.out.println(xpathQuery);
			Iterable<Node> matched =
					xpathEngine.selectNodes(xpathQuery, source);
			
			List<Node> nodes =
					StreamSupport.stream(matched.spliterator(), false)
							.collect(Collectors.toList());
			
			assertTrue(nodes.size() > 0,
					"No wsdl:operation for updating parameter.");
			assertTrue(nodes.size() == 1,
					"n>1 wsdl:operation for updating parameter. Change THIS TEST.");
			System.out.println(nodes);
			
			Element wsdlOperation = (Element) nodes.get(0);
			
			String pattern = wsdlOperation.getAttribute("pattern");
			assertEquals("http://www.w3.org/ns/wsdl/in-out", pattern);
			
			String safe = wsdlOperation.getAttribute("wsdlx:safe");
			assertEquals("true", safe);
			
			String inputIdentifier = "aa:" + xsdElementName(p);
			
			String inputReference = wsdlOperation
					.getElementsByTagName("wsdl:input").item(0)
					.getAttributes().getNamedItem("element").getNodeValue();
			
			assertEquals(inputIdentifier, inputReference);
			
		}
	}
	
}
