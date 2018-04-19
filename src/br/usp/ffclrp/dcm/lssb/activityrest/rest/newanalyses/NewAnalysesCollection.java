package br.usp.ffclrp.dcm.lssb.activityrest.rest.newanalyses;

import java.net.URI;

import javax.annotation.Nonnull;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.ServerErrorException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.usp.ffclrp.dcm.lssb.activityrest.dao.FileSystemDao;
import br.usp.ffclrp.dcm.lssb.activityrest.exceptions.AnalysisActivityCreationFailedException;
import br.usp.ffclrp.dcm.lssb.activityrest.exceptions.AnalysisActivityNotFoundException;
import br.usp.ffclrp.dcm.lssb.activityrest.util.MediaType;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescription;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity;
import io.swagger.annotations.Api;

@Api
public class NewAnalysesCollection {
	
	UriInfo uriInfo;
	UriBuilder uriBuilder;
	FileSystemDao analysisActivityDao;
	AnalysisActivityDescription aaDesc;
	
	public NewAnalysesCollection(
			@Nonnull AnalysisActivityDescription aaDesc,
			@Nonnull UriInfo uriInfo,
			@Nonnull FileSystemDao analysisActivityDao) {
		this.aaDesc = aaDesc;
		this.uriInfo = uriInfo;
		this.analysisActivityDao = analysisActivityDao;
	}
	
	
	/**
	 * Create a new analysis activity and return its location
	 * 
	 * @return
	 */
	@POST
	@Produces({ MediaType.APPLICATION_JSON })
	public Response postNewAnalysis() {
		
		try {
			AnalysisActivity aa = createNewAnalysisActivity();
			System.out.println(aa.getId());
			uriBuilder = uriInfo.getAbsolutePathBuilder();
			URI locationURI = uriBuilder.path(aa.getId()).build();
			Response response = Response.created(locationURI)
					//.entity(aa)
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
			@PathParam("analysisID") @Nonnull String analysisID) {

		try {
			AnalysisActivity aa;
			aa = analysisActivityDao.get(analysisID);
			
			return new NewAnalysisResource(aaDesc,uriInfo, aa, analysisActivityDao);
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
