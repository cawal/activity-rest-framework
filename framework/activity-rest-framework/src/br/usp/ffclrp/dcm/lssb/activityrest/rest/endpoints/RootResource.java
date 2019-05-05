package br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.usp.ffclrp.dcm.lssb.activityrest.dao.ActivityRepository;
import br.usp.ffclrp.dcm.lssb.activityrest.dao.FileSystemActivityRepository;
import br.usp.ffclrp.dcm.lssb.activityrest.dao.FileSystemRepositoryProperties;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.ActivityRestConfig;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.ResourceRelations;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.failedanalyses.FailedAnalysesCollection;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.jobs.JobCollection;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.newanalyses.NewAnalysesCollection;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.succeededanalyses.SucceededAnalysesCollection;
import br.usp.ffclrp.dcm.lssb.activityrest.util.MediaType;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;
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
@RequestScoped
public class RootResource {
	@Context
	UriInfo uriInfo;
	
	@Context
	Application app;
	
	ActivityRestConfig config;
	
	Activity aaDesc;
	
	ActivityRepository nonExecutedDao;
	ActivityRepository succeededDao;
	ActivityRepository failedDao;
	ActivityRepository runningDao;
	
	public RootResource() {
		
	};
	
	protected void initialize() {
		config =
				(ActivityRestConfig) app.getProperties()
						.get("activityrest.config");
		
		aaDesc = config.getActivityModel();
		
		nonExecutedDao = config.getNewAnalysisRepository();
		succeededDao = config.getSuccededAnalysisRepository();
		failedDao = config.getFailedAnalysisRepository();
		runningDao = config.getRunningAnalysisRepository();
	}
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response get() {
		
		initialize();
		
		List<Link> links = getRootResourceHateoasControls();
		
		return Response.ok()
				.links(links.toArray(new Link[0]))
				.build();
	}

	
	
	// SUB-RESOURCES ----------------------------------------------------------
	@Path("/new-analyses")
	public NewAnalysesCollection getNewAnalysisCollection() {
		initialize();
		return new NewAnalysesCollection(aaDesc, uriInfo, nonExecutedDao);
	}
	
	@Path("/failed-analyses")
	public FailedAnalysesCollection getFailedAnalysisCollection() {
		initialize();
		return new FailedAnalysesCollection(aaDesc, uriInfo, failedDao);
	}
	
	@Path("/succeeded-analyses")
	public SucceededAnalysesCollection getSucceededAnalysesCollection() {
		initialize();
		return new SucceededAnalysesCollection(aaDesc, uriInfo, succeededDao);
	}
	
	@Path("/instances")
	public JobCollection getJobManager() {
		initialize();
		return new JobCollection(aaDesc,
				uriInfo,
				(FileSystemActivityRepository) nonExecutedDao,
				(FileSystemActivityRepository) runningDao,
				(FileSystemActivityRepository) succeededDao,
				(FileSystemActivityRepository) failedDao);
	}
	
	
	/*protected void initializeFileSystemDaos(
			FileSystemRepositoryProperties properties) {
		
		File nonExecutedAnalysisActivityDaoRoot =
				new File(properties.getNonExecutedAnalysesRootDirectory());
		
		this.nonExecutedDao =
				new FileSystemActivityRepository(
						nonExecutedAnalysisActivityDaoRoot, aaDesc);
		
		File succeededAnalysisActivityDaoRoot =
				new File(properties.getSucceededAnalysesRootDirectory());
		
		this.succeededDao =
				new FileSystemActivityRepository(
						succeededAnalysisActivityDaoRoot, aaDesc);
		
		File failedAnalysisActivityDaoRoot =
				new File(properties.getFailedAnalysesRootDirectory());
		
		this.failedDao =
				new FileSystemActivityRepository(failedAnalysisActivityDaoRoot,
						aaDesc);
		
		File runningAnalysisActivityDaoRoot =
				new File(properties.getRunningAnalysesRootDirectory());
		
		this.runningDao =
				new FileSystemActivityRepository(runningAnalysisActivityDaoRoot,
						aaDesc);
	}*/
	
	private List<Link> getRootResourceHateoasControls() {
		UriBuilder uriBuilder = uriInfo.getAbsolutePathBuilder();
		List<Link> links = new ArrayList<>();
		
		Link selfLink = Link.fromUri(uriInfo.getAbsolutePath())
				.rel(ResourceRelations.SELF)
				.build();
		links.add(selfLink);
		
		uriBuilder = uriInfo.getAbsolutePathBuilder();
		Link createAnalysislink = Link.fromUri(uriBuilder
				.path("new-analyses").build())
				.rel(ResourceRelations.ROOT_2_NEW_ANALYSES_COLLECTION)
				.build();
		links.add(createAnalysislink);
		
		/*uriBuilder = uriInfo.getAbsolutePathBuilder();
		Link swaggerJson = Link.fromUri(uriBuilder
				.path("swagger.json").build())
				.rel(ResourceRelations.SWAGGER_JSON)
				.build();
		links.add(swaggerJson);
		
		uriBuilder = uriInfo.getAbsolutePathBuilder();
		Link swaggerYaml = Link.fromUri(uriBuilder
				.path("swagger.yaml").build())
				.rel(ResourceRelations.SWAGGER_YAML)
				.build();
		links.add(swaggerYaml);*/
		return links;
	}
	
}
