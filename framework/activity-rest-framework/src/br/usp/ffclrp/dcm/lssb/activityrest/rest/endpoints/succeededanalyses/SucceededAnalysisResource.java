package br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.succeededanalyses;

import java.net.URI;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.ServerErrorException;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.usp.ffclrp.dcm.lssb.activityrest.dao.ActivityRepository;
import br.usp.ffclrp.dcm.lssb.activityrest.dao.exceptions.AnalysisActivityNotFoundException;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.ActivityRestConfig;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.ResourceRelations;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.datasets.AbstractDatasetResource;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.datasets.InputDatasetsResource;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.datasets.OutputDatasetsResource;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.parameters.ParameterSetResource;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.representations.AnalysisActivityRepresentation;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.representations.AnalysisActivityStateRepresentation;
import br.usp.ffclrp.dcm.lssb.activityrest.util.MediaType;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;

public class SucceededAnalysisResource {
	
	ActivityRestConfig config;
	UriInfo uriInfo;
	URI baseApplicationURI;
	URI absolutePathURI;
	
	AnalysisActivity aa;
	ActivityRepository analysisActivityDao;
	Activity activityDescription;
	
	public SucceededAnalysisResource(
			Activity activityDescription,
			UriInfo uriInfo,
			AnalysisActivity aa,
			ActivityRepository analysisActivityDao,
			ActivityRestConfig config) {
		this.activityDescription = activityDescription;
		this.uriInfo = uriInfo;
		this.aa = aa;
		this.analysisActivityDao = analysisActivityDao;
		this.baseApplicationURI = uriInfo.getBaseUri();
		this.absolutePathURI = uriInfo.getAbsolutePath();
		this.config = config;
	}
	
	@GET
	@Produces({ MediaType.APPLICATION_XML,
			MediaType.APPLICATION_JSON, 
			MediaType.APPLICATION_HAL_JSON
			})
	public Response get() {
		

		
		try {
			
			Link selfLink =
					Link.fromUri(getUriForSelf())
							.rel(ResourceRelations.SELF)
							.build();
			Link parameterSetLink =
					Link.fromUri(getUriForParameterSet())
							.rel(ResourceRelations.ANALYSYS_PARAMETERS_COLLECTION)
							.build();
			Link inputDatasetsLink =
					Link.fromUri(getUriForInputDatasets())
							.rel(ResourceRelations.ANALYSYS_INPUT_DATASETS_COLLECTION)
							.build();
			
			Link outputDatasetsLink =
					Link.fromUri(getUriForOutputDatasets())
							.rel(ResourceRelations.ANALYSYS_OUTPUT_DATASETS_COLLECTION)
							.build();
			AnalysisActivityRepresentation representation =
					new AnalysisActivityRepresentation(aa.getId(),
							AnalysisActivityStateRepresentation.SUCCEEDED);
			
			Response.ResponseBuilder response =
					Response.ok(representation)
							.links(selfLink)
							.links(parameterSetLink)
							.links(inputDatasetsLink)
							.links(outputDatasetsLink);
			
			return response.build();
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServerErrorException(500, e);
		}
	}
	
	/**
	 * Deletes an analysis.
	 */
	@DELETE
	public Response delete() {
		try {
			analysisActivityDao.delete(aa.getId());
		} catch (AnalysisActivityNotFoundException e) {
			throw new NotFoundException();
		}
		return Response.ok().build();
	}
	
	// sub-resources
	// ------------------------------------------------------------
	
	@Path("/parameters/")
	public ParameterSetResource getParameterSetResource() {
		return new ParameterSetResource(activityDescription, uriInfo, aa,
				analysisActivityDao, false,null);
	}
	
	@Path("/inputs/")
	public InputDatasetsResource getInputDatasetsResource() {
		return new InputDatasetsResource(activityDescription, uriInfo, aa,
				analysisActivityDao, config, false);
	}
	
	@Path("/outputs/")
	public AbstractDatasetResource getOutputDatasetsResource() {
		return new OutputDatasetsResource(activityDescription, uriInfo, aa,
				analysisActivityDao, false);
	}
	
	// local auxiliary methods -------------------------------------------------
	private URI getUriForSelf() {
		return absolutePathURI;
	}
	
	private URI getUriForParameterSet() {
		return UriBuilder.fromUri(getUriForSelf()).path("/parameters/").build();
	}
	
	private URI getUriForInputDatasets() {
		return UriBuilder.fromUri(getUriForSelf()).path("/inputs/").build();
	}
	
	private URI getUriForOutputDatasets() {
		return UriBuilder.fromUri(getUriForSelf()).path("/outputs/").build();
	}
	
}
