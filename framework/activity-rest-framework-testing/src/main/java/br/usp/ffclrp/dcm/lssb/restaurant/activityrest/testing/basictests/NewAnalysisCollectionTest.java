package br.usp.ffclrp.dcm.lssb.restaurant.activityrest.testing.basictests;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.net.URI;
import java.util.List;

import javax.ws.rs.core.Link;

import org.apache.http.HttpStatus;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import br.usp.ffclrp.dcm.lssb.activityrest.rest.ResourceRelations;
import br.usp.ffclrp.dcm.lssb.restaurant.activityrest.testing.TestBase;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class NewAnalysisCollectionTest extends TestBase {
	
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
	public void methodsNotAllowed() {
				
		RequestSpecification request = given()
				.accept("application/json");
		Response response = request.put(NEW_ANALYSES_URI_FRAGMENT)
				.andReturn();
		assertEquals("PUT should not be allowed for new-analyses resource.", 
				HttpStatus.SC_METHOD_NOT_ALLOWED,response.statusCode());
		
		request = given()
				.accept("application/json");
		response = request.delete(NEW_ANALYSES_URI_FRAGMENT)
				.andReturn();
		assertEquals("DELETE should not be allowed for new-analyses resource.", 
				HttpStatus.SC_METHOD_NOT_ALLOWED,response.statusCode());
	}

	
	@Test
	public void createNewAnalysis() 
			throws JsonParseException, JsonMappingException, IOException {
		
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

		assertEquals("Create new analysis request failed",
				HttpStatus.SC_CREATED, createResponse.getStatusCode());
		
		assertNotNull("Location header for new analysis instance is null",
				createResponse.header("Location"));
		
		
		URI locationUri = URI.create(createResponse.header("Location"));
		
		Response getNewAnalysisResponse = given()
				.log().all()
				.get(locationUri)
				.andReturn();
		
		assertEquals("New analysis not found",
				HttpStatus.SC_OK, getNewAnalysisResponse.getStatusCode());	
			
	}
	
	

	
}
