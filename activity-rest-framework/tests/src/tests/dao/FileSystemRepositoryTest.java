package tests.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.WebApplicationException;

import org.eclipse.emf.common.util.URI;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.usp.ffclrp.dcm.lssb.activityrest.dao.ActivityRepository;
import br.usp.ffclrp.dcm.lssb.activityrest.dao.FileSystemActivityRepository;
import br.usp.ffclrp.dcm.lssb.activityrest.util.ModelsService;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity;

public class FileSystemRepositoryTest {

	static File localStorage;
	static ActivityRepository dao;
	static Activity aaDesc;
	private static final String ANALYSIS_ACTIVITY_DESCRIPTION_XMI_URI = 
			"./AnalysisActivityDescription.aadl";
	
	static List<String> keys = Arrays.asList(
			"email",
			"count",
			"threshold", 
			"gene-ids",
			"categories-in-result",
			"gene-identifier-type"
		);
	
	private void initializeEcoreResources() throws IOException {        
        URI uri = URI
                .createURI(ANALYSIS_ACTIVITY_DESCRIPTION_XMI_URI);
        try {
        	aaDesc = ModelsService.retrieveAADLModel(this.getClass()
    				.getResource(uri.toString())
    				.openStream());
		} catch (IOException e) {
			e.printStackTrace();
		};
        
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
		

		
		localStorage = new File("/tmp/dao_test_root");
		localStorage.mkdirs();
		///java.nio.file.Files.createTempDirectory("dao_test").toFile();
		dao = new FileSystemActivityRepository(localStorage, aaDesc);
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testCreateAndRetrieve_Parameters() throws Exception {
		String id = dao.create();
		System.out.println(id);
		AnalysisActivity aa = dao.get(id);
		
		boolean containAllKeys = keys.stream()
				.map(k -> aa.getParameters().containsKey(k))
				.allMatch(b->b);
		
		assertTrue("There are keys that are not in  the parameters map!",containAllKeys);
	}
	
	@Test
	public void testCreateUpdateAndRetrieve_Parameters() throws Exception {
		String id = dao.create();
		System.out.println(id);
		AnalysisActivity aa = dao.get(id);

		String email = "test@email.net";
		aa.getParameters().put("email", email);
		aa.getParameters().put("count", "5");
		
		dao.update(aa);
		
		AnalysisActivity aa2 = dao.get(aa.getId());

		assertEquals(5, aa2.getParameters().get("count"));
		assertTrue(email.equalsIgnoreCase(aa2.getParameters().get("email").toString()));
		
	}
	
	
}
