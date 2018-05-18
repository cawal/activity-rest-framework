package br.usp.ffclrp.dcm.lssb.activityrest.rest;

import java.net.URI;
import java.util.List;

import javax.annotation.Nonnull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import br.usp.ffclrp.dcm.lssb.activityrest.dao.AnalysisActivityDao;
import br.usp.ffclrp.dcm.lssb.activityrest.util.MediaType;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescription;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Dataset;
import io.swagger.annotations.Api;

@Api
public class OutputDatasetsResource extends AbstractDatasetResource {
	
	UriInfo uriInfo;
	URI baseApplicationURI;
	URI absolutePathURI;
	boolean allowUpdate;
	
	private AnalysisActivity aa;
	private AnalysisActivityDao analysisActivityDao;
	AnalysisActivityDescription aaDesc;
	
	public OutputDatasetsResource(
			@Nonnull AnalysisActivityDescription aaDesc,
			@Nonnull UriInfo uriInfo,
			@Nonnull AnalysisActivity aa,
			@Nonnull AnalysisActivityDao analysisActivityDao,
			boolean allowUpdate) {
		this.uriInfo = uriInfo;
		this.aa = aa;
		this.analysisActivityDao = analysisActivityDao;
		this.baseApplicationURI = uriInfo.getBaseUri();
		this.absolutePathURI = uriInfo.getAbsolutePath();
		this.aaDesc = aaDesc;
		this.allowUpdate = allowUpdate;
	}
	
	/**
	 * 
	 * @return The datasets links for the analysis.
	 */
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Response getOutputDatasets() {
		
		List<Dataset> datasetList = aa.getOutputs();
		return getResponseForGetDatasetListRequest(uriInfo.getAbsolutePath(),datasetList, allowUpdate);
	}


	
	/**
	 * 
	 * @param datasetName
	 * @return The dataset information, if it is a File collection dataset,
	 *         or the output file content, otherwise.
	 *         Relevant links are also provided.
	 */
	@GET
	@Path("/{datasetName : [A-Za-z0-9-.]+}")
	public Response getDataset(
			@PathParam("datasetName") @Nonnull String datasetName) {
		
		Dataset d = aa.outputDatasetForName(datasetName);
		return getResponseForGetDatasetRequest(d, uriInfo.getAbsolutePath());
	}
	
	
	
	@GET
	@Path("{datasetName : [A-Za-z0-9-.]+}/{fileName : [A-Za-z0-9-.]+}")
	public Response getFileFromCollectionDataset(
			@PathParam("datasetName") @Nonnull String datasetName,
			@PathParam("fileName") @Nonnull String fileName) {
		
		Dataset d = aa.outputDatasetForName(datasetName);
		URI baseUri = uriInfo.getAbsolutePath();
		return getResponseForGetDatasetFileRequest(baseUri, d, fileName);
		
	}

	
	

}
