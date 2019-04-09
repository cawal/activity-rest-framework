package br.usp.ffclrp.dcm.lssb.restaurant.activityrest.testing.basictests;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.net.URI;
import java.util.List;

import javax.ws.rs.core.Link;
import javax.ws.rs.core.MediaType;

import org.apache.http.HttpStatus;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.usp.ffclrp.dcm.lssb.activityrest.rest.ResourceRelations;
import br.usp.ffclrp.dcm.lssb.restaurant.activityrest.testing.TestBase;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class NewAnalysisResourceTest extends TestBase {
	
	URI locationUri;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	@Before
	public void setUp() throws Exception {
		Response r = given()
				.accept("application/json")
				.get()
				.andReturn();
		
		List<Link> headerList =  processHeadersForLinks(r.getHeaders());
		Link newAnalysisLink = headerList.stream()
				.filter(h -> h.getRel().equalsIgnoreCase(ResourceRelations.ROOT_2_NEW_ANALYSES_COLLECTION))
				.findFirst().get();
		
		Response createResponse = given()
				.accept("application/json")
				.post(newAnalysisLink.getUri())
				.andReturn();
		assertEquals(HttpStatus.SC_CREATED, createResponse.getStatusCode());
		

		this.locationUri = URI.create(createResponse.header("Location"));
	}
	
	@After
	public void tearDown() throws Exception {
		// removes created analysis
		/*given()
				.log().all()
				.accept(MediaType.APPLICATION_JSON)
				.delete(locationUri)
				.andReturn();*/
	}
	
	@Test
	public void methodsNotAllowed() {
				
		RequestSpecification request = given()
				.accept("application/json");
		Response response = request.put("new-analyses")
				.andReturn();
		assertEquals("PUT should not be allowed for /new-analyses/{analysisId} resource.", 
				HttpStatus.SC_METHOD_NOT_ALLOWED,response.statusCode());
		
	}

	
		
	@Test
	public void deleteNewAnalysisJson() {

		Response deleteResponse = given()
				.accept(MediaType.APPLICATION_JSON)
				.delete(locationUri)
				.andReturn();
		assertEquals(HttpStatus.SC_OK, deleteResponse.statusCode());
		
		Response getDeletedResponse = given()
				.get(locationUri)
				.andReturn();
		assertEquals("Deleted analysis activity shold not be found",
				HttpStatus.SC_NOT_FOUND, getDeletedResponse.statusCode());
	}
	
	
	@Test
	public void getNewAnalysisReturnLinkHeaders() {
		
		Response getRequest = given()
				.accept(MediaType.APPLICATION_JSON)
				.get(locationUri)
				.andReturn();
				
		List<Link> headerList =  processHeadersForLinks(getRequest.getHeaders());
		Link selfLink = headerList.stream()
				.filter(h -> h.getRel().equalsIgnoreCase(ResourceRelations.SELF))
				.findFirst().get();
		
		assertNotNull(selfLink);
		
		Link parametersLink = headerList.stream()
				.filter(h -> h.getRel().equalsIgnoreCase(ResourceRelations.ANALYSYS_PARAMETERS_COLLECTION))
				.findFirst().get();
		
		assertNotNull(parametersLink);
		
		Link inputDatasetsLink = headerList.stream()
				.filter(h -> h.getRel().equalsIgnoreCase(ResourceRelations.ANALYSYS_INPUT_DATASETS_COLLECTION))
				.findFirst().get();
		
		assertNotNull(inputDatasetsLink);
		
	}
	
	@Test
	public void getParameterSet() {
		Response getRequest = given()
				.accept(MediaType.APPLICATION_JSON)
				.get(locationUri)
				.andReturn();
				
		List<Link> headerList =  processHeadersForLinks(getRequest.getHeaders());
		
		Link parametersLink = headerList.stream()
				.filter(h -> h.getRel().equalsIgnoreCase(ResourceRelations.ANALYSYS_PARAMETERS_COLLECTION))
				.findFirst().get();
		
		assertNotNull(parametersLink);
		
		Response getParameterSet = given()
				.accept(MediaType.APPLICATION_JSON)
				.get(parametersLink.getUri())
				.andReturn();
				
		assertEquals("Parameter set not found", 
				HttpStatus.SC_OK, getParameterSet.statusCode());
		
	}
	
	@Test
	public void getInputDatasetsCollection() {
		Response getRequest = given()
				.accept(MediaType.APPLICATION_JSON)
				.get(locationUri)
				.andReturn();
				
		List<Link> headerList =  processHeadersForLinks(getRequest.getHeaders());
		
		Link inputDatasetsCollectionList = headerList.stream()
				.filter(h -> h.getRel().equalsIgnoreCase(ResourceRelations.ANALYSYS_INPUT_DATASETS_COLLECTION))
				.findFirst().get();
		
		assertNotNull(inputDatasetsCollectionList);
		
		Response getInputDatasetsColection = given()
				.accept(MediaType.APPLICATION_JSON)
				.log().all()
				.get(inputDatasetsCollectionList.getUri())
				.andReturn();
		
		getInputDatasetsColection.prettyPrint();
				
		assertEquals("Input datasets not found", 
				HttpStatus.SC_OK, getInputDatasetsColection.statusCode());
		
	}
	

	
}
