package br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.datasets;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.List;
import java.util.UUID;

import javax.annotation.Nonnull;
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
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import org.apache.commons.io.IOUtils;

import br.usp.ffclrp.dcm.lssb.activityrest.dao.ActivityRepository;
import br.usp.ffclrp.dcm.lssb.activityrest.dao.exceptions.AnalysisActivityNotFoundException;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.Dataset;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.util.MultiplicityElementUtil;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;
import io.swagger.annotations.Api;

@Api
public class InputDatasetsResource extends AbstractDatasetResource {
	
	UriInfo uriInfo;
	URI baseApplicationURI;
	URI absolutePathURI;
	boolean allowUpdate;
	
	private AnalysisActivity aa;
	private ActivityRepository analysisActivityDao;
	Activity aaDesc;
	
	public InputDatasetsResource(
			@NotNull Activity aaDesc,
			@NotNull UriInfo uriInfo,
			@NotNull AnalysisActivity aa,
			@NotNull ActivityRepository analysisActivityDao,
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
			@PathParam("datasetName") @Nonnull String datasetName) {
		
		Dataset d = aa.inputDatasetForName(datasetName);
		return getResponseForGetDatasetRequest(d, uriInfo.getAbsolutePath());
	}
	
	@GET
	@Path("{datasetName : [A-Za-z0-9-.]+}/{fileName : [A-Za-z0-9-.]+}")
	public Response getFileFromCollectionDataset(
			@PathParam("datasetName") @Nonnull String datasetName,
			@PathParam("fileName") @Nonnull String fileName) {
		
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
		
		Dataset d = aa.inputDatasetForName(datasetName);
		
		if (d == null)
			throw new NotFoundException();
		
		String fileName = UUID.randomUUID().toString();
		
		URI locationURI = null;
		
		try {
			File f = new File(fileName);
			FileWriter fw = new FileWriter(f);
			IOUtils.copy(fileContents, fw);
			fileContents.close();
			fw.flush();
			fw.close();
			
			if (MultiplicityElementUtil.dontAcceptsList(d.getDescription())) {
				if (d.getFiles().size() > 0)
					throw new BadRequestException();
			}
			
			d.getFiles().add(f);
			analysisActivityDao.update(aa);
			
			locationURI = UriBuilder.fromUri(this.absolutePathURI)
					.path(fileName.toString())
					.build();
			
			return Response.created(locationURI).build();
		} catch (AnalysisActivityNotFoundException e) {
			throw new NotFoundException();
		} catch (IOException e) {
			throw new ServerErrorException(500);
		}
	}
	
	@PUT
	@Path("{datasetName : [A-Za-z0-9-.]+}")
	public Response putFileToSingleFileDataset(
			@PathParam("datasetName") @NotNull String datasetName,
			@HeaderParam("Content-type") String contentType,
			InputStream fileContents) {
		
		
		// Validation
		if (!allowUpdate)
			throw new BadRequestException();
		
		Dataset d = aa.inputDatasetForName(datasetName);
		if (d == null)
			throw new NotFoundException();
		
		br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Dataset 
			datasetDescription = d.getDescription();
		
		if(MultiplicityElementUtil.acceptsList(datasetDescription)) {
			throw new BadRequestException();
		}
		
		String fileName = UUID.randomUUID().toString();
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
			
			analysisActivityDao.update(aa);
			
			locationURI = UriBuilder.fromUri(this.absolutePathURI)
					.path(fileName.toString())
					.build();
			
			return Response.created(locationURI).build();
		} catch (AnalysisActivityNotFoundException e) {
			throw new NotFoundException();
		} catch (IOException e) {
			throw new ServerErrorException(500);
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
			analysisActivityDao.update(aa);
		} catch (AnalysisActivityNotFoundException e) {
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
			analysisActivityDao.update(aa);
		} catch (AnalysisActivityNotFoundException e) {
			throw new NotFoundException(e);
		}
		
		return Response.ok().build();
	}
	
}
