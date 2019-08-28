package br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints;

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
import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.Deployment;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.ActivityRestConfig;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.ResourceRelations;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.failedanalyses.FailedAnalysesCollection;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.jobs.JobCollection;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.newanalyses.NewAnalysesCollection;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.succeededanalyses.SucceededAnalysesCollection;
import br.usp.ffclrp.dcm.lssb.activityrest.util.MediaType;
import br.usp.ffclrp.dcm.lssb.activityrest.wsdl.ActivityToWsdlTransformationService;
import br.usp.ffclrp.dcm.lssb.activityrest.wsdl.ActivityToXsdTransformationService;
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
	Application app;
	
	@Context
	UriInfo uriInfo;
	
	ActivityRestConfig config;
	Deployment deploymentModel;
	
	Activity activityDescription;
	
	ActivityRepository nonExecutedDao;
	ActivityRepository succeededDao;
	ActivityRepository failedDao;
	ActivityRepository runningDao;
	
	
	public RootResource() {	};
	
	protected void initialize() {
		config =
				(ActivityRestConfig) app.getProperties()
						.get("activityrest.config");
		
		activityDescription = config.getActivityModel();
		deploymentModel = config.getDeploymentModel();
		
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
	@Path("/non-executed-instances")
	public NewAnalysesCollection getNewAnalysisCollection() {
		initialize();
		return new NewAnalysesCollection(activityDescription, uriInfo, nonExecutedDao, config);
	}
	
	@Path("/failed-instances")
	public FailedAnalysesCollection getFailedAnalysisCollection() {
		initialize();
		return new FailedAnalysesCollection(activityDescription, uriInfo, failedDao,config);
	}
	
	@Path("/succeeded-instances")
	public SucceededAnalysesCollection getSucceededAnalysesCollection() {
		initialize();
		return new SucceededAnalysesCollection(activityDescription, uriInfo, succeededDao,config);
	}
	
	@Path("/executions")
	public JobCollection getJobManager() {
		initialize();
		return new JobCollection(activityDescription,
				uriInfo,
				nonExecutedDao,
				(FileSystemActivityRepository) runningDao,
				succeededDao,
				failedDao);
	}
	
	@GET @Path("xsd")
	public Response getServiceXsd() {
		initialize();
		if(deploymentModel != null) {
			String xsd = ActivityToXsdTransformationService.toXsd(activityDescription, deploymentModel);
			return Response.ok(xsd).build();
		} else {
			return Response.serverError().build();
		}
		
	}
	

	@GET @Path("xsd")
	public Response getServiceWsdl() {
		initialize();
		if(deploymentModel != null) {
			String wsdl = ActivityToWsdlTransformationService.toWsdl(activityDescription, deploymentModel);
			return Response.ok(wsdl).build();
		} else {
			return Response.serverError().build();
		}
		
	}

	
	private List<Link> getRootResourceHateoasControls() {
		UriBuilder uriBuilder = uriInfo.getAbsolutePathBuilder();
		List<Link> links = new ArrayList<>();
		
		Link selfLink = Link.fromUri(uriInfo.getAbsolutePath())
				.rel(ResourceRelations.SELF)
				.build();
		links.add(selfLink);
		
		uriBuilder = uriInfo.getAbsolutePathBuilder();
		Link createAnalysislink = Link.fromUri(uriBuilder
				.path("non-executed-instances").build())
				.rel(ResourceRelations.ROOT_2_NEW_ANALYSES_COLLECTION)
				.build();
		links.add(createAnalysislink);

		return links;
	}
	
}
