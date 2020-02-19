package br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.datasets;

import java.io.File;
import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import br.usp.ffclrp.dcm.lssb.activityrest.dao.ActivityRepository;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.Dataset;
import br.usp.ffclrp.dcm.lssb.activityrest.util.MediaType;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;
import lombok.NonNull;

public class OutputDatasetsResource extends AbstractDatasetResource {
	
	UriInfo uriInfo;
	URI baseApplicationURI;
	URI absolutePathURI;
	boolean allowUpdate;
	
	private AnalysisActivity aa;
	private ActivityRepository analysisActivityDao;
	Activity activityDescription;
	
	public OutputDatasetsResource(
			@NonNull Activity activityDescription,
			@NonNull UriInfo uriInfo,
			@NonNull AnalysisActivity aa,
			@NonNull ActivityRepository analysisActivityDao,
			boolean allowUpdate) {
		this.uriInfo = uriInfo;
		this.aa = aa;
		this.analysisActivityDao = analysisActivityDao;
		this.baseApplicationURI = uriInfo.getBaseUri();
		this.absolutePathURI = uriInfo.getAbsolutePath();
		this.activityDescription = activityDescription;
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
			@PathParam("datasetName") @NonNull String datasetName) {
		
		Dataset d = aa.outputDatasetForName(datasetName);
		return getResponseForGetDatasetRequest(d, uriInfo.getAbsolutePath());
	}
	
	
	
	@GET
	@Path("{datasetName : [A-Za-z0-9-.]+}/{fileName : [A-Za-z0-9-.]+}")
	public File getFileFromCollectionDataset(
			@PathParam("datasetName") @NonNull String datasetName,
			@PathParam("fileName") @NonNull String fileName) {
		
		Dataset d = aa.outputDatasetForName(datasetName);
		URI baseUri = uriInfo.getAbsolutePath();
		
		Optional<File> fileOp = d.getFiles().stream()
				.filter(f -> f.getName().equalsIgnoreCase(fileName))
				.findFirst();
		
		if (!fileOp.isPresent())
			throw new NotFoundException();
		
		File file = fileOp.get();
		return file;
		//return getResponseForGetDatasetFileRequest(baseUri, d, fileName);
		
	}

	
	

}
