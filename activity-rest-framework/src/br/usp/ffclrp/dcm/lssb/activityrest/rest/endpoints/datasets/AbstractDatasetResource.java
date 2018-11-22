package br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.datasets;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.apache.commons.io.FileUtils;

import br.usp.ffclrp.dcm.lssb.activityrest.domain.Dataset;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.util.MultiplicityElementUtil;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.ResourceRelations;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.representations.FileRepresentation;

/**
 * Some request/response manipulations are equally executed for input and
 * output datasets. This class provide such operations.
 * 
 * @author cawal
 *
 */
public class AbstractDatasetResource {
	
	/**
	 * Returns an object representing a HTTP response listing the dataset.
	 * The listing is made using the Link relation of the HTTP header.
	 * 
	 * @param basePath
	 *            The URI path requested.
	 * @param datasetList
	 *            A list of input/output datasets
	 *            the analysis activity holds.
	 * @param allowUpdate
	 *            A boolean indicating if the datasets may be updated
	 *            by the client.
	 * @return a response object with link headers applied.
	 */
	protected Response getResponseForGetDatasetListRequest(
			URI basePath,
			List<Dataset> datasetList,
			boolean allowUpdate) {
		List<Link> links = new ArrayList<Link>();
		
		Link self = Link.fromUri(basePath)
				.rel(ResourceRelations.SELF)
				.type("GET")
				.build();
		links.add(self);
		
		links.addAll(getLinksForDatasets(basePath, datasetList, allowUpdate));
		
		return Response.ok(datasetList)
				.links(links.toArray(new Link[links.size()]))
				.build();
	}
	
	protected Response getResponseForGetDatasetRequest(Dataset d,
			URI requestAbsolutePathUri) {
		
		if (null == d) // sentinel
			throw new NotFoundException();
		
		List<Link> links = new ArrayList<>();
		Link self = Link.fromUri(requestAbsolutePathUri)
				.rel(ResourceRelations.SELF)
				.type("GET")
				.build();
		links.add(self);
		
		if (MultiplicityElementUtil.acceptsList(d.getDescription())) {
			for (File f : d.getFiles()) {
				URI uri = UriBuilder.fromUri(requestAbsolutePathUri)
						.path(f.getName())
						.build();
				Link fileLink = Link.fromUri(uri)
						.rel(ResourceRelations.DATASET_TO_ITEMS_GET_RELATION)
						.type("GET")
						.build();
				links.add(fileLink);
			}
			
			return Response.ok(d)
					.links(links.toArray(new Link[links.size()]))
					.build();
		} else { // single file, stdout or stderr shold have only one file
			try {
				File file = d.getFiles().get(0);
				
				if (file == null)
					throw new FileNotFoundException();
				
				FileRepresentation representation = new FileRepresentation();
				representation.setName(file.getName());
				representation.setContent(FileUtils.readFileToString(file));
				representation.setContentType(d.getDescription().getMimetype());
				
				return Response.ok(representation)
						// .header("Content-type",
						// d.getDescription().getMimetype())
						.links(links.toArray(new Link[links.size()]))
						.build();
				
			} catch (IOException e) {
				e.printStackTrace();
				throw new NotFoundException();
			}
			
		}
	}
	
	protected Response getResponseForGetDatasetFileRequest(URI baseUri,
			Dataset d,
			String fileName) {
		if (null == d)
			throw new NotFoundException();
		
		List<Link> links = new ArrayList<>();
		Link self = Link.fromUri(baseUri)
				.rel(ResourceRelations.SELF)
				.type("GET")
				.build();
		links.add(self);
		
		if (MultiplicityElementUtil.acceptsList(d.getDescription())) {
			try {
				Optional<File> fileOp = d.getFiles().stream()
						.filter(f -> f.getName().equalsIgnoreCase(fileName))
						.findFirst();
				
				if (!fileOp.isPresent())
					throw new FileNotFoundException();
				
				File file = fileOp.get();
				
				FileRepresentation representation = new FileRepresentation();
				representation.setName(file.getName());
				representation.setContent(FileUtils.readFileToString(file));
				representation.setContentType(d.getDescription().getMimetype());
				links.add(self);
				
				return Response.ok(fileOp.get())
						.links(links.toArray(new Link[links.size()]))
						// .header("Content-type",
						// d.getDescription().getMimetype())
						.build();
				
			} catch (IOException e) {
				e.printStackTrace();
				throw new NotFoundException();
			}
			
		} else {
			throw new BadRequestException();
		}
	}
	
	protected URI getLocationUriForDataset(URI datasetListUri,
			String datasetName) {
		return UriBuilder.fromUri(datasetListUri)
				.path(datasetName)
				.build();
	}
	
	protected List<Link> getLinksForDatasets(URI datasetListUri,
			List<Dataset> datasetList,
			boolean allowUpdate) {
		
		List<Link> links = new ArrayList<Link>();
		
		for (Dataset d : datasetList) {
			br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Dataset description =
					d.getDescription();
			Link getDatasetLink =
					Link.fromUri(getLocationUriForDataset(datasetListUri,
							description.getName()))
							.rel(description.getName())
							.type("GET")
							.build();
			links.add(getDatasetLink);
			
			if (allowUpdate) {
				if (MultiplicityElementUtil.acceptsList(description)) {
					Link postDatasetLink =
							Link.fromUri(getLocationUriForDataset(
									datasetListUri, description.getName()))
									.rel(description.getName())
									.type("POST")
									.build();
					links.add(postDatasetLink);
					
				} else {
					Link putDatasetLink =
							Link.fromUri(getLocationUriForDataset(
									datasetListUri, description.getName()))
									.rel(description.getName())
									.type("PUT")
									.build();
					links.add(putDatasetLink);
					
				}
			}
		}
		
		return links;
	}
	
}
