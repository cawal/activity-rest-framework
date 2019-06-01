package br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.failedanalyses;

import javax.annotation.Nonnull;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.ServerErrorException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.usp.ffclrp.dcm.lssb.activityrest.dao.ActivityRepository;
import br.usp.ffclrp.dcm.lssb.activityrest.dao.exceptions.AnalysisActivityNotFoundException;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.ActivityRestConfig;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;
import io.swagger.annotations.Api;

@Api
public class FailedAnalysesCollection {
	ActivityRestConfig config;
	@Context
	UriInfo uriInfo;
	UriBuilder uriBuilder;
	ActivityRepository analysisActivityDao;
	Activity aaDesc;
	
	public FailedAnalysesCollection(Activity aaDesc,
			UriInfo uriInfo,
			ActivityRepository succeededAnalysisActivityDao,
			ActivityRestConfig config) {
		this.uriInfo = uriInfo;
		this.analysisActivityDao = succeededAnalysisActivityDao;
		this.aaDesc = aaDesc;
		this.config = config;
	}
	
	// Subresources
	
	@Path("/{analysisID}")
	public FailedAnalysisResource getSucceededAnalysisResource(
			@PathParam("analysisID") @Nonnull String analysisID) {

		try {
			AnalysisActivity aa;
			aa = analysisActivityDao.get(analysisID);
			
			return new FailedAnalysisResource(aaDesc,uriInfo, aa, analysisActivityDao,config);
		} catch (AnalysisActivityNotFoundException e) {
			throw new NotFoundException();
		} catch (Exception e) {
			throw new ServerErrorException(500, e);
		}
	}
	
}
