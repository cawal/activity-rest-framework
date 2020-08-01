package br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.datasets;

import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import br.usp.ffclrp.dcm.lssb.activityrest.dao.ActivityRepository;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.Dataset;
import br.usp.ffclrp.dcm.lssb.activityrest.util.MediaType;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;

public class OutputDatasetsResource extends AbstractDatasetResource {
	
	UriInfo uriInfo;
	URI baseApplicationURI;
	URI absolutePathURI;
	boolean allowUpdate;
	
	private AnalysisActivity aa;
	private ActivityRepository analysisActivityDao;
	Activity activityDescription;
	
	public OutputDatasetsResource(
			Activity activityDescription,
			UriInfo uriInfo,
			AnalysisActivity aa,
			ActivityRepository analysisActivityDao,
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
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getOutputDatasets() {
		
		List<Dataset> datasetList = aa.getOutputs();
		return getResponseForGetDatasetListRequest(uriInfo.getAbsolutePath(),
				datasetList, allowUpdate);
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
			@PathParam("datasetName") String datasetName) {
		
		Dataset d = aa.outputDatasetForName(datasetName);
		return getResponseForGetDatasetRequest(d, uriInfo.getAbsolutePath());
	}
	
	@GET
	@Path("{datasetName : [A-Za-z0-9-.]+}/{fileName : [A-Za-z0-9-.]+}")
	public File getFileFromCollectionDataset(
			@PathParam("datasetName") String datasetName,
			@PathParam("fileName") String fileName) {
		
		Dataset d = aa.outputDatasetForName(datasetName);
		URI baseUri = uriInfo.getAbsolutePath();
		
		Optional<File> fileOp = d.getFiles().stream()
				.filter(f -> f.getName().equalsIgnoreCase(fileName))
				.findFirst();
		
		if (!fileOp.isPresent())
			throw new NotFoundException();
		
		File file = fileOp.get();
		return file;
		// return getResponseForGetDatasetFileRequest(baseUri, d, fileName);
		
	}
	
	/**
	 * Gets the Links header for underlying datasets
	 */
	protected List<Link> getLinksForDatasets(URI datasetListUri,
			List<Dataset> datasetList,
			boolean allowUpdate) {
		
		List<Link> links = new ArrayList<Link>();
		
		for (Dataset d : datasetList) {
			br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Dataset description =
					d.getDescription();
			
			if (description.getMaximumCardinality().intValue() == 1) {
				Link datasetLink =
						Link.fromUri(getLocationUriForDataset(datasetListUri,
								description.getName()))
								.rel("outputs/" + description.getName())
								.build();
				links.add(datasetLink);
				
			} else {
				for (File f : d.getFiles()) {
					String rel = "outputs/" + description.getName() + "/"
							+ f.getName();
					Link fileLink =
							Link.fromUri(
									getLocationUriForDataset(datasetListUri,
											description.getName(),
											f.getName()))
									.rel(rel)
									.build();
					links.add(fileLink);
				}
			}
			
		}
		
		return links;
	}
	
}
