/**
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.tests;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionFactory;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivityModelFactory;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivityModelPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.ParameterMap;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.exceptions.ParameterUpdateException;
import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.ParameterMap#validateParameters(java.util.Map) <em>Validate Parameters</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.ParameterMap#validateParameter(java.lang.String, java.lang.Object) <em>Validate Parameter</em>}</li>
 *   <li>{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.ParameterMap#setDefaultValues() <em>Set Default Values</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ParameterMapTest extends TestCase {
	
	private static final AnalysisActivityDescriptionFactory AADP_INSTANCE =
			AnalysisActivityDescriptionFactory.eINSTANCE;
	
	private static final String ANALYSIS_ACTIVITY_DESCRIPTION_XMI_URI =
			"./AnalysisActivityDescription.xmi";
	
	private static Activity aaDesc;
	
	/**
	 * The fixture for this Parameter Map test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterMap fixture = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ParameterMapTest.class);
	}
	
	/**
	 * Constructs a new Parameter Map test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterMapTest(String name) {
		super(name);
	}
	
	/**
	 * Sets the fixture for this Parameter Map test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ParameterMap fixture) {
		this.fixture = fixture;
	}
	
	/**
	 * Returns the fixture for this Parameter Map test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterMap getFixture() {
		return fixture;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AnalysisActivityModelFactory.eINSTANCE.createParameterMap());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}
	
	/**
	 * Tests the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.ParameterMap#validateParameters(java.util.Map) <em>Validate Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.ParameterMap#validateParameters(java.util.Map)
	 * @generated
	 */
	public void testValidateParameters__Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.ParameterMap#validateParameter(java.lang.String, java.lang.Object) <em>Validate Parameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.ParameterMap#validateParameter(java.lang.String, java.lang.Object)
	 * @generated
	 */
	public void testValidateParameter__String_Object() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.ParameterMap#setDefaultValues() <em>Set Default Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.ParameterMap#setDefaultValues()
	 * @generated
	 */
	public void testSetDefaultValues() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	private void initializeEcoreResources() throws Exception {
		// Initialize the model
		AnalysisActivityModelPackage.eINSTANCE.eClass();
		AnalysisActivityDescriptionPackage.eINSTANCE.eClass();
		
		// Register the XMI resource factory for the extension
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		
		// Obtain a new resource set
		ResourceSetImpl resSet = new ResourceSetImpl();
		
		URI uri = URI
				.createURI(ANALYSIS_ACTIVITY_DESCRIPTION_XMI_URI);
		resSet.createResource(uri).load(this.getClass()
				.getResource(uri.toString())
				.openStream(), null);
		// Get the resource
		Resource resource = resSet.getResource(uri, true);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		aaDesc = (Activity) resource.getContents().get(0);
		
		if (aaDesc == null)
			throw new Exception(uri.toString() + " not found!");
	}
	
	public void testPutAll() throws ParameterUpdateException {
		
		Map<String, Object> updateMap = new HashMap<>();
		
		String email = "ricardo.cawal@gmail.com";
		List<String> categoriesInResult = Arrays.asList("cat1", "cat2", "cat3");
		String geneIdType = "myGeneIdType";
		
		updateMap.put("email", email);
		updateMap.put("gene-identifier-type", geneIdType);
		updateMap.put("categories-in-result", categoriesInResult);
		updateMap.put("count", 4);
		updateMap.put("threshold", 5.5);
		
		fixture.putAll(updateMap);
		
		assertTrue(email.equalsIgnoreCase(fixture.get("email").toString()));
		
		List<String> fixturesCategoriesInResult =
				(List<String>) fixture.get("categories-in-result");
		assertEquals(categoriesInResult.size(),
				fixturesCategoriesInResult.size());
		
		assertEquals(4, fixture.get("count"));
		assertEquals(5.5, (double) fixture.get("threshold"), 0.01);
		
		System.out.println(fixture instanceof Map);
		System.out.println(fixture.entrySet());
		
	}
	
} // ParameterTest
