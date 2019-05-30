package br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.newanalyses;

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

import br.usp.ffclrp.dcm.lssb.activityrest.dao.ActivityRepository;
import br.usp.ffclrp.dcm.lssb.activityrest.dao.exceptions.AnalysisActivityNotFoundException;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.validation.ValidationService;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.ActivityRestConfig;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.ResourceRelations;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.datasets.InputDatasetsResource;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.parameters.ParameterSetResource;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.representations.AnalysisActivityRepresentation;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.representations.AnalysisActivityStateRepresentation;
import br.usp.ffclrp.dcm.lssb.activityrest.util.MediaType;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;
import io.swagger.annotations.Api;

@Api
public class NewAnalysisResource {
	ActivityRestConfig config;
	UriInfo uriInfo;
	URI baseApplicationURI;
	URI absolutePathURI;
	
	AnalysisActivity aa;
	ActivityRepository analysisActivityDao;
	Activity aaDesc;
	
	public NewAnalysisResource(
			@Nonnull Activity aaDesc,
			@Nonnull UriInfo uriInfo,
			@Nonnull AnalysisActivity aa,
			@Nonnull ActivityRepository analysisActivityDao,
			ActivityRestConfig config) {
		this.aaDesc = aaDesc;
		this.uriInfo = uriInfo;
		this.aa = aa;
		this.analysisActivityDao = analysisActivityDao;
		this.baseApplicationURI = uriInfo.getBaseUri();
		this.absolutePathURI = uriInfo.getAbsolutePath();
		this.config = config;
	}

	@GET
	@Produces({  MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON, MediaType.APPLICATION_HAL_JSON})
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
			
			Response.ResponseBuilder response = 
					Response.ok()
					.links(selfLink)
					.links(parameterSetLink)
					.links(inputDatasetsLink);
			
			AnalysisActivityRepresentation representation;
			if (ValidationService.isReady(aa)) {
				representation = new AnalysisActivityRepresentation(
						aa.getId(),
						AnalysisActivityStateRepresentation.READY);
				URI jobURI = getJobInstanceUri();
				Link jobLink = Link.fromUri(jobURI)
						.rel(ResourceRelations.SUBMIT_RELATION)
						.build();
				
				response.links(jobLink);
			} else {
				representation = new AnalysisActivityRepresentation(
								aa.getId(),
								AnalysisActivityStateRepresentation.CREATED);
			}
			
			response.entity(representation);
			
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
		return new ParameterSetResource(aaDesc,uriInfo, aa, analysisActivityDao,true,config);
	}
	
	@Path("/inputs/")
	public InputDatasetsResource getInputDatasetsResource() {
		return new InputDatasetsResource(aaDesc,uriInfo, aa, analysisActivityDao,true);
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
