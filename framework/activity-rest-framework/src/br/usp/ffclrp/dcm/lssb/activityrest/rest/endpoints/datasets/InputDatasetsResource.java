package br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.datasets;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import lombok.NonNull;

import javax.el.MethodNotFoundException;
import javax.validation.constraints.NotNull;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.ServerErrorException;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import org.apache.commons.io.IOUtils;

import br.usp.ffclrp.dcm.lssb.activityrest.dao.ActivityRepository;
import br.usp.ffclrp.dcm.lssb.activityrest.dao.exceptions.AnalysisActivityUpdateFailure;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.Dataset;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.util.MultiplicityElementUtil;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.validation.InputDatasetValidatorNotFoundException;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.validation.ValidationService;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.ActivityRestConfig;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.InputDataset;

public class InputDatasetsResource extends AbstractDatasetResource {
	
	ActivityRestConfig config;
	UriInfo uriInfo;
	URI baseApplicationURI;
	URI absolutePathURI;
	boolean allowUpdate;
	
	private AnalysisActivity aa;
	private ActivityRepository analysisActivityDao;
	Activity activityDescription;
	
	public InputDatasetsResource(
			@NotNull Activity activityDescription,
			@NotNull UriInfo uriInfo,
			@NotNull AnalysisActivity aa,
			@NotNull ActivityRepository analysisActivityDao,
			ActivityRestConfig config,
			boolean allowUpdate) {
		this.uriInfo = uriInfo;
		this.aa = aa;
		this.analysisActivityDao = analysisActivityDao;
		this.baseApplicationURI = uriInfo.getBaseUri();
		this.absolutePathURI = uriInfo.getAbsolutePath();
		this.activityDescription = activityDescription;
		this.config = config;
		this.allowUpdate = allowUpdate;
	}
	
	/**
	 * 
	 * @return The datasets links for the analysis.
	 */
	@GET
	public Response getFiles() {
		
		List<Dataset> datasetList = aa.getInputs();
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
	@Path("{datasetName : [A-Za-z0-9-.]+}")
	public Response getDataset(
			@PathParam("datasetName") @NonNull String datasetName) {
		
		Dataset d = aa.inputDatasetForName(datasetName);
		return getResponseForGetDatasetRequest(d, uriInfo.getAbsolutePath());
	}
	
	@GET
	@Path("{datasetName : [A-Za-z0-9-.]+}/{fileName : [A-Za-z0-9-.]+}")
	public Response getFileFromCollectionDataset(
			@PathParam("datasetName") @NonNull String datasetName,
			@PathParam("fileName") @NonNull String fileName) {
		
		Dataset d = aa.inputDatasetForName(datasetName);
		URI baseUri = uriInfo.getAbsolutePath();
		return getResponseForGetDatasetFileRequest(baseUri, d, fileName);
		
	}
	
	/**
	 * Uploads a file. If the dataset is a file collection, includes it in the
	 * collection. Else, if the dataset is a single file and no file was
	 * provided,
	 * set the file for the dataset. If a file was previously provided and the
	 * dataset is a single file dataset, throw bad request.
	 * 
	 * @param datasetName
	 * @param contentType
	 * @param fileContents
	 * @return
	 */
	@POST
	@Path("{datasetName : [A-Za-z0-9-.]+}")
	public Response postFileToDataset(
			@PathParam("datasetName") @NotNull String datasetName,
			@HeaderParam("Content-type") String contentType,
			InputStream fileContents) {
		
		if (!allowUpdate)
			throw new BadRequestException();
		String fileName = UUID.randomUUID().toString();
		
		Dataset d = aa.inputDatasetForName(datasetName);
		
		if (d == null) {
			throw new NotFoundException();
		}
		
		InputDataset datasetDescription = (InputDataset) d.getDescription();
		
		if (MultiplicityElementUtil.acceptsList(datasetDescription)) {
			return addFileToCollection(fileName, fileContents, d);
		} else {
			return putFileToSingleDataset(fileName, fileContents, d);
		}
		
	}
	
	@PUT
	@Path("{datasetName : [A-Za-z0-9-.]+}")
	public Response putFileToDataset(
			@PathParam("datasetName") @NotNull String datasetName,
			@HeaderParam("Content-type") String contentType,
			InputStream fileContents) {
		
		if (!allowUpdate)
			throw new BadRequestException();
		String fileName = UUID.randomUUID().toString();
		
		Dataset d = aa.inputDatasetForName(datasetName);
		
		if (d == null) {
			throw new NotFoundException();
		}
		
		InputDataset datasetDescription = (InputDataset) d.getDescription();
		
		if (MultiplicityElementUtil.acceptsList(datasetDescription)) {
			throw new MethodNotFoundException();
		} else {
			return putFileToSingleDataset(fileName, fileContents, d);
		}
		
	}
	
	private Response addFileToCollection(
			String fileName,
			InputStream fileContents,
			Dataset d) {
		
		URI locationURI = null;
		
		try {
			File f = new File(fileName);
			FileWriter fw = new FileWriter(f);
			IOUtils.copy(fileContents, fw);
			fileContents.close();
			fw.flush();
			fw.close();
			
			d.getFiles().add(f);
			
			ValidationService.validateInputDataset(d, aa,
					aa.getDescription().getInputDatasets(),
					config.getInputDatasetConstraints());
			
			analysisActivityDao.save(aa);
			
			locationURI = UriBuilder.fromUri(this.absolutePathURI)
					.path(fileName.toString())
					.build();
			
			return Response.created(locationURI).build();
		} catch (AnalysisActivityUpdateFailure e) {
			throw new NotFoundException();
		} catch (IOException | InputDatasetValidatorNotFoundException e) {
			throw new ServerErrorException(500, e);
		}
	}
	
	private Response putFileToSingleDataset(
			String fileName,
			InputStream fileContents,
			Dataset d) {
		
		URI locationURI = null;
		
		try {
			File f = new File(fileName);
			FileWriter fw = new FileWriter(f);
			IOUtils.copy(fileContents, fw);
			fileContents.close();
			fw.close();
			
			// remove old dataset file, if exists
			File old = d.getFiles().get(0);
			d.getFiles().clear();
			old.delete();
			d.getFiles().add(f);
			
			ValidationService.validateInputDataset(d, aa,
					aa.getDescription().getInputDatasets(),
					config.getInputDatasetConstraints());
			
			analysisActivityDao.save(aa);
			
			locationURI = UriBuilder.fromUri(this.absolutePathURI)
					.path(fileName.toString())
					.build();
			
			return Response.created(locationURI).build();
		} catch (AnalysisActivityUpdateFailure e) {
			throw new NotFoundException();
		} catch (IOException | InputDatasetValidatorNotFoundException e) {
			throw new ServerErrorException(500, e);
		}
	}
	
	@DELETE
	@Path("{datasetName : [A-Za-z0-9-.]+}")
	public Response deleteFilesInDataset(
			@PathParam("datasetName") @NotNull String datasetName) {
		
		if (!allowUpdate)
			throw new BadRequestException();
		
		Dataset d = aa.inputDatasetForName(datasetName);
		
		if (d == null)
			throw new NotFoundException();
		
		for (File f : d.getFiles()) {
			f.delete();
		}
		
		d.getFiles().clear();
		try {
			analysisActivityDao.save(aa);
		} catch (AnalysisActivityUpdateFailure e) {
			throw new NotFoundException(e);
		}
		
		return Response.ok().build();
	}
	
	@DELETE
	@Path("{datasetName : [A-Za-z0-9-.]+}/{fileName : [A-Za-z0-9-.]+}")
	public Response deleteFileInCollectionDataset(
			@PathParam("datasetName") @NotNull String datasetName,
			@PathParam("fileName") @NotNull String fileName) {
		
		if (!allowUpdate)
			throw new BadRequestException();
		
		Dataset d = aa.inputDatasetForName(datasetName);
		
		if (d == null)
			throw new NotFoundException();
		
		d.getFiles().stream()
				.filter(f -> f.getName().equalsIgnoreCase(fileName))
				.forEach(f -> {
					d.getFiles().remove(f);
					f.delete();
				});
		
		try {
			analysisActivityDao.save(aa);
		} catch (AnalysisActivityUpdateFailure e) {
			throw new NotFoundException(e);
		}
		
		return Response.ok().build();
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
			
			
				Link datasetLink =
						Link.fromUri(getLocationUriForDataset(datasetListUri,
								description.getName()))
								.rel("inputs/" + description.getName())
								.build();
				links.add(datasetLink);
				
			if (description.getMaximumCardinality().intValue() != 1) {
				for (File f : d.getFiles()) {
					String rel = "inputs/" + description.getName() + "/"
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
