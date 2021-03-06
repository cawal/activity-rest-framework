package tests.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.usp.ffclrp.dcm.lssb.activityrest.dao.ActivityRepository;
import br.usp.ffclrp.dcm.lssb.activityrest.dao.FileSystemActivityRepository;
import br.usp.ffclrp.dcm.lssb.activityrest.dao.RepositoryTransferService;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity;
import br.usp.ffclrp.dcm.lssb.activityrest.util.ModelsService;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;

public class FileSystemRepositoryTest {

	static File localStorage;
	static ActivityRepository dao;
	static Activity activityDescription;
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
        	activityDescription = ModelsService.retrieveAADLModel(this.getClass()
    				.getResource(uri.toString())
    				.openStream());
		} catch (IOException e) {
			System.err.println("Failed to load the AADL Description!");
			e.printStackTrace();
		};
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
		dao = new FileSystemActivityRepository(localStorage, activityDescription);
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testCreateAndRetrieve_Parameters() throws Exception {
		String id = dao.create();
		AnalysisActivity aa = dao.get(id);
		
		boolean containAllKeys = keys.stream()
				.map(k -> aa.getParameters().containsKey(k))
				.allMatch(b->b);
		
		assertTrue("There are keys that are not in  the parameters map!",containAllKeys);
	}
	
	@Test
	public void testCreateUpdateAndRetrieve_Parameters() throws Exception {
		String id = dao.create();
		AnalysisActivity aa = dao.get(id);

		String email = "test@email.net";
		aa.getParameters().put("email", email);
		aa.getParameters().put("count", "5");
		
		dao.save(aa);
		
		AnalysisActivity aa2 = dao.get(aa.getId());

		assertEquals(5, aa2.getParameters().get("count"));
		assertTrue(email.equalsIgnoreCase(aa2.getParameters().get("email").toString()));
		
	}
	
	@Test
	public void testActivityTransferBetweenRepos() throws Exception {

		File localStorage2 = new File("/tmp/dao_test_root_2");
		localStorage2.mkdirs();
		ActivityRepository dao2 = new FileSystemActivityRepository(localStorage2, activityDescription);

		String id = dao.create();
		
		// transfer
		RepositoryTransferService.moveInstance(id, dao, dao2);
		
		// The activity instance must not be found in the first DAO anymore
		try{
			dao.get(id);
			fail();
		} catch (Exception e) {
		}
		
		// the activity must be found in the second DAO
		AnalysisActivity inDao2 = dao2.get(id);
		assertNotNull(inDao2);
		
		
	}
	
	
}
