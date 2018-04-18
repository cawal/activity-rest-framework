package br.usp.ffclrp.dcm.lssb.activityrest.rest.succeededanalyses;

import javax.annotation.Nonnull;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.ServerErrorException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.usp.ffclrp.dcm.lssb.activityrest.dao.FileSystemDao;
import br.usp.ffclrp.dcm.lssb.activityrest.exceptions.AnalysisActivityNotFoundException;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescription;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity;
import io.swagger.annotations.Api;

@Api
public class SucceededAnalysesCollection {
	
	@Context
	UriInfo uriInfo;
	UriBuilder uriBuilder;
	FileSystemDao analysisActivityDao;
	AnalysisActivityDescription aaDesc;
	
	public SucceededAnalysesCollection(AnalysisActivityDescription aaDesc,
			UriInfo uriInfo,
			FileSystemDao succeededAnalysisActivityDao) {
		this.uriInfo = uriInfo;
		this.analysisActivityDao = succeededAnalysisActivityDao;
		this.aaDesc = aaDesc;
	}
	
	// Subresources
	
	@Path("/{analysisID}")
	public SucceededAnalysisResource getSucceededAnalysisResource(
			@PathParam("analysisID") @Nonnull String analysisID) {

		try {
			AnalysisActivity aa;
			aa = analysisActivityDao.get(analysisID);
			
			return new SucceededAnalysisResource(aaDesc,uriInfo, aa, analysisActivityDao);
		} catch (AnalysisActivityNotFoundException e) {
			throw new NotFoundException();
		} catch (Exception e) {
			throw new ServerErrorException(500, e);
		}
	}
	
}
