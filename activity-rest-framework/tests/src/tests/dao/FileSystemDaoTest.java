package tests.dao;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.ws.rs.WebApplicationException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.usp.ffclrp.dcm.lssb.activityrest.dao.AnalysisActivityDao;
import br.usp.ffclrp.dcm.lssb.activityrest.dao.FileSystemDao;
import br.usp.ffclrp.dcm.lssb.activityrest.exceptions.AnalysisActivityCreationFailedException;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescription;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivityModelPackage;

public class FileSystemDaoTest {

	static File localStorage;
	static AnalysisActivityDao dao;
	static AnalysisActivityDescription aaDesc;
	private static final String ANALYSIS_ACTIVITY_DESCRIPTION_XMI_URI = "./AnalysisActivityDescription.xmi";
	
	
	
	private void initializeEcoreResources() {
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
        try {
			resSet.createResource(uri).load(this.getClass()
					.getResource(uri.toString())
					.openStream(), null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
        // Get the resource
        Resource resource = resSet.getResource(uri, true);
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        aaDesc = (AnalysisActivityDescription) resource.getContents().get(0);
        
        if(aaDesc == null) 
        	throw new WebApplicationException(uri.toString() + " not found!");
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	@Before
	public void setUp() throws Exception {
		initializeEcoreResources();
		localStorage = java.nio.file.Files.createTempDirectory("dao_test").toFile();
		dao = new FileSystemDao(localStorage, aaDesc);
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void test() throws Exception {
		String id = dao.create();
		System.out.println(id);
		dao.get(id);
	}
	
}
