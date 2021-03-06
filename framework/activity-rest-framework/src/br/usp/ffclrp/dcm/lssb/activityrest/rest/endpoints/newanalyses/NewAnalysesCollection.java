package br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.newanalyses;

import java.net.URI;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.ServerErrorException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.usp.ffclrp.dcm.lssb.activityrest.dao.ActivityRepository;
import br.usp.ffclrp.dcm.lssb.activityrest.dao.exceptions.AnalysisActivityCreationFailedException;
import br.usp.ffclrp.dcm.lssb.activityrest.dao.exceptions.AnalysisActivityNotFoundException;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.ActivityRestConfig;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.representations.AnalysisActivityRepresentation;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.representations.AnalysisActivityStateRepresentation;
import br.usp.ffclrp.dcm.lssb.activityrest.util.MediaType;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;

public class NewAnalysesCollection {
	ActivityRestConfig config;
	UriInfo uriInfo;
	UriBuilder uriBuilder;
	ActivityRepository analysisActivityDao;
	Activity activityDescription;
	
	public NewAnalysesCollection(
			Activity activityDescription,
			UriInfo uriInfo,
			ActivityRepository analysisActivityDao,
			ActivityRestConfig config) {
		this.activityDescription = activityDescription;
		this.uriInfo = uriInfo;
		this.analysisActivityDao = analysisActivityDao;
		this.config = config;
	}
	
	
	/**
	 * Create a new analysis activity and return its location
	 * 
	 * @return
	 */
	@POST
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON, })
	public Response postNewAnalysis() {
		
		try {
			AnalysisActivity aa = createNewAnalysisActivity();
			
			uriBuilder = uriInfo.getAbsolutePathBuilder();
			URI locationURI = uriBuilder.path(aa.getId()).build();
			
			AnalysisActivityRepresentation entityRepresentation = 
					new AnalysisActivityRepresentation(
							aa.getId(),
							AnalysisActivityStateRepresentation.CREATED);
			
			Response response = Response.created(locationURI)
					.entity(entityRepresentation)
					.build();
						
			return response;
			
		} catch (AnalysisActivityCreationFailedException
				| AnalysisActivityNotFoundException e) {
			e.printStackTrace();
			throw new ServerErrorException(500,e);
		}
	}
	

	// Subresources
	
	@Path("/{analysisID}")
	public NewAnalysisResource getNewAnalysisResource(
			@PathParam("analysisID") String analysisID) {

		try {
			AnalysisActivity aa;
			aa = analysisActivityDao.get(analysisID);
			
			return new NewAnalysisResource(activityDescription,uriInfo, aa, analysisActivityDao, config);
		} catch (AnalysisActivityNotFoundException e) {
			throw new NotFoundException();
		} catch (Exception e) {
			throw new ServerErrorException(500, e);
		}
	}
	

	
	// Local auxiliary methods
	
	private AnalysisActivity createNewAnalysisActivity() 
			throws AnalysisActivityCreationFailedException, 
					AnalysisActivityNotFoundException {
			String analysisId = analysisActivityDao.create();
			AnalysisActivity aa = analysisActivityDao.get(analysisId);			
			return aa;
	}
	
}
