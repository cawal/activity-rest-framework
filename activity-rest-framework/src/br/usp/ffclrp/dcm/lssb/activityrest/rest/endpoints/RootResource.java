package br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import br.usp.ffclrp.dcm.lssb.activityrest.dao.ActivityRepository;

import br.usp.ffclrp.dcm.lssb.activityrest.dao.FileSystemActivityRepository;
import br.usp.ffclrp.dcm.lssb.activityrest.dao.FileSystemRepositoryProperties;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.ResourceRelations;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.failedanalyses.FailedAnalysesCollection;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.jobs.JobCollection;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.newanalyses.NewAnalysesCollection;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.succeededanalyses.SucceededAnalysesCollection;
import br.usp.ffclrp.dcm.lssb.activityrest.util.MediaType;
import br.usp.ffclrp.dcm.lssb.activityrest.util.ModelsService;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivityModelPackage;
import io.swagger.annotations.Api;

/**
 * Root resource of the API.
 * Provides the URI path segments for its subresources.
 * 
 * @author cawal
 *
 */
@Api
@Path("/")
public class RootResource {
	@Context
	UriInfo uriInfo;
	
	Activity aaDesc;
	
	FileSystemActivityRepository nonExecutedDao;
	FileSystemActivityRepository succeededDao;
	FileSystemActivityRepository failedDao;
	FileSystemActivityRepository runningDao;
	
	final String analysisActivityResourcePath =
			"./analysis-activity-template.json";
	
	public RootResource() {};
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response get() {
		
		UriBuilder uriBuilder = uriInfo.getAbsolutePathBuilder();
		List<Link> links = new ArrayList<>();
		
		Link selfLink = Link.fromUri(uriInfo.getAbsolutePath())
				.rel(ResourceRelations.SELF)
				.type("GET").build();
		links.add(selfLink);
		
		uriBuilder = uriInfo.getAbsolutePathBuilder();
		Link createAnalysislink = Link.fromUri(uriBuilder
				.path("new-analyses").build())
				.rel(ResourceRelations.ROOT_2_NEW_ANALYSES_COLLECTION)
				.type("POST").build();
		links.add(createAnalysislink);
		
		uriBuilder = uriInfo.getAbsolutePathBuilder();
		Link swaggerJson = Link.fromUri(uriBuilder
				.path("swagger.json").build())
				.rel(ResourceRelations.SWAGGER_JSON)
				.type("GET").build();
		links.add(swaggerJson);
		
		uriBuilder = uriInfo.getAbsolutePathBuilder();
		Link swaggerYaml = Link.fromUri(uriBuilder
				.path("swagger.yaml").build())
				.rel(ResourceRelations.SWAGGER_YAML)
				.type("GET").build();
		links.add(swaggerYaml);
		
		return Response.ok()
				.links(links.toArray(new Link[0]))
				.build();
	}
	
	// SUB-RESOURCES ----------------------------------------------------------
	@Path("/new-analyses")
	public NewAnalysesCollection getNewAnalysisCollection() {
		
		return new NewAnalysesCollection(aaDesc, uriInfo, nonExecutedDao);
	}
	
	@Path("/failed-analyses")
	public FailedAnalysesCollection getFailedAnalysisCollection() {
		
		return new FailedAnalysesCollection(aaDesc, uriInfo, failedDao);
	}
	
	@Path("/succeeded-analyses")
	public SucceededAnalysesCollection getSucceededAnalysesCollection() {
		
		return new SucceededAnalysesCollection(aaDesc, uriInfo, succeededDao);
	}
	
	@Path("/instances")
	public JobCollection getJobManager() {
		
		return new JobCollection(aaDesc,
				uriInfo,
				nonExecutedDao,
				runningDao,
				succeededDao,
				failedDao);
	}
	
	protected void initializeEcoreResources(InputStream is) throws IOException {
		aaDesc = ModelsService.retrieveAADLModel(is);
	}
	
	protected void initializeFileSystemDaos(FileSystemRepositoryProperties properties) {
		
		File nonExecutedAnalysisActivityDaoRoot =
				new File(properties.getNonExecutedAnalysesRootDirectory());
		
		this.nonExecutedDao =
				new FileSystemActivityRepository(nonExecutedAnalysisActivityDaoRoot, aaDesc);
		
		File succeededAnalysisActivityDaoRoot =
				new File(properties.getSucceededAnalysesRootDirectory());
		
		this.succeededDao =
				new FileSystemActivityRepository(succeededAnalysisActivityDaoRoot, aaDesc);
		
		File failedAnalysisActivityDaoRoot =
				new File(properties.getFailedAnalysesRootDirectory());
		
		this.failedDao =
				new FileSystemActivityRepository(failedAnalysisActivityDaoRoot, aaDesc);
		
		File runningAnalysisActivityDaoRoot =
				new File(properties.getRunningAnalysesRootDirectory());
		
		this.runningDao =
				new FileSystemActivityRepository(runningAnalysisActivityDaoRoot, aaDesc);
	}
	
}
