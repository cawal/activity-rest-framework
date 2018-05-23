package br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.succeededanalyses;

import java.net.URI;

import javax.annotation.Nonnull;
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

import br.usp.ffclrp.dcm.lssb.activityrest.dao.AnalysisActivityDao;
import br.usp.ffclrp.dcm.lssb.activityrest.dao.exceptions.AnalysisActivityNotFoundException;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.ResourceRelations;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.analysisvalidation.AnalysisActivityValidation;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.datasets.AbstractDatasetResource;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.datasets.InputDatasetsResource;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.datasets.OutputDatasetsResource;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.parameters.ParameterSetResource;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.representations.AnalysisActivityRepresentation;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.representations.AnalysisActivityState;
import br.usp.ffclrp.dcm.lssb.activityrest.util.MediaType;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescription;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity;
import io.swagger.annotations.Api;

@Api
@Path("/new-analyses/{analysisID}")
public class SucceededAnalysisResource {
	
	UriInfo uriInfo;
	URI baseApplicationURI;
	URI absolutePathURI;
	
	AnalysisActivity aa;
	AnalysisActivityDao analysisActivityDao;
	AnalysisActivityDescription aaDesc;
	
	public SucceededAnalysisResource(
			@Nonnull AnalysisActivityDescription aaDesc,
			@Nonnull UriInfo uriInfo,
			@Nonnull AnalysisActivity aa,
			@Nonnull AnalysisActivityDao analysisActivityDao) {
		this.aaDesc = aaDesc;
		this.uriInfo = uriInfo;
		this.aa = aa;
		this.analysisActivityDao = analysisActivityDao;
		this.baseApplicationURI = uriInfo.getBaseUri();
		this.absolutePathURI = uriInfo.getAbsolutePath();
	}

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_HAL_JSON, MediaType.APPLICATION_XML  })
	public Response get() {
		
		AnalysisActivityRepresentation representation =
				new AnalysisActivityRepresentation();
		
		try {
			
			Link selfLink =
					Link.fromUri(getUriForSelf())
					.rel(ResourceRelations.SELF)
					.type("GET")
					.build();
			Link deleteLink =
					Link.fromUri(getUriForSelf())
					.rel(ResourceRelations.SELF)
					.type("DELETE")
					.build();
			Link parameterSetLink =
					Link.fromUri(getUriForParameterSet())
					.rel(ResourceRelations.ANALYSYS_PARAMETERS_COLLECTION)
					.type("GET")
					.build();
			Link inputDatasetsLink =
					Link.fromUri(getUriForInputDatasets())
					.rel(ResourceRelations.ANALYSYS_INPUT_DATASETS_COLLECTION)
					.type("GET")
					.build();

			Link outputDatasetsLink =
					Link.fromUri(getUriForOutputDatasets())
					.rel(ResourceRelations.ANALYSYS_OUTPUT_DATASETS_COLLECTION)
					.type("GET")
					.build();

			representation.setId(aa.getId());
			representation.setState(AnalysisActivityState.SUCCEEDED);
			
			Response.ResponseBuilder response = 
					Response.ok(representation)
					.links(selfLink)
					.links(deleteLink)
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

	
	// sub-resources ------------------------------------------------------------
	
	@Path("/parameters/")
	public ParameterSetResource getParameterSetResource() {
		return new ParameterSetResource(aaDesc,uriInfo, aa, analysisActivityDao,false);
	}
	
	@Path("/inputs/")
	public InputDatasetsResource getInputDatasetsResource() {
		return new InputDatasetsResource(aaDesc,uriInfo, aa, analysisActivityDao,false);
	}
	
	@Path("/outputs/")
	public AbstractDatasetResource getOutputDatasetsResource() {
		return new OutputDatasetsResource(aaDesc,uriInfo, aa, analysisActivityDao,false);
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
	
	
	private URI getJobManagerUri() {
		return UriBuilder.fromUri(this.baseApplicationURI).path("/instances/").build();
	}
	
	private URI getJobInstanceUri() {
		return UriBuilder.fromUri(getJobManagerUri())
				.path("/{analysisId}")
				.resolveTemplate("analysisId", aa.getId())
				.build();
	}
	
}
