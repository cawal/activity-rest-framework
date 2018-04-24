package br.usp.ffclrp.dcm.lssb.activityrest.rest;

import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetDescription;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.DatasetKind;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Dataset;

/** 
 * Some request/response manipulations are equally executed for input and 
 * output datasets. This class provide such operations.
 * @author cawal
 *
 */
public class AbstractDatasetResource {
	
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
		
		links.addAll(getLinksForDatasets(basePath,datasetList,allowUpdate));
		
		return Response.ok(datasetList)
				.links(links.toArray(new Link[links.size()]))
				.build();
	}

	protected Response getResponseForGetDatasetRequest(Dataset d, URI requestAbsolutePathUri) {
		
		if (null == d) // sentinel
			throw new NotFoundException();
		
		List<Link> links = new ArrayList<>();
		Link self = Link.fromUri(requestAbsolutePathUri)
				.rel(ResourceRelations.SELF)
				.type("GET")
				.build();
		links.add(self);
		
		if (d.getDescription()
				.getDatasetKind() == DatasetKind.FILE_COLLECTION) {
			
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
			
			File file = d.getFiles().get(0);
			if (file == null)
				throw new NotFoundException();			
			return Response.ok(file)
					.header("Content-type", d.getDescription().getMimetype())
					.links(links.toArray(new Link[links.size()]))
					.build();
		}
	}
	
	
	
	protected Response getResponseForGetDatasetFileRequest(URI baseUri, Dataset d,
			String fileName) {
		if (null == d)
			throw new NotFoundException();
		
		List<Link> links = new ArrayList<>();
		Link self = Link.fromUri(baseUri)
				.rel(ResourceRelations.SELF)
				.type("GET")
				.build();
		links.add(self);
		
		DatasetDescription datasetDescription = d.getDescription();
		DatasetKind datasetKind = datasetDescription.getDatasetKind();
		
		if (datasetKind == DatasetKind.SINGLE_FILE) {
			throw new BadRequestException();
			
		} else if (datasetKind == DatasetKind.FILE_COLLECTION) {
			
			Optional<File> fileOp = d.getFiles().stream()
					.filter(f -> f.getName().equalsIgnoreCase(fileName))
					.findFirst();
			
			if (!fileOp.isPresent())
				throw new NotFoundException();
			
			links.add(self);
			
			return Response.ok(fileOp.get())
					.links(links.toArray(new Link[links.size()]))
					.header("Content-type", d.getDescription().getMimetype())
					.build();
		} else {
			throw new BadRequestException();
		}
	}
	
	protected URI getLocationUriForDataset(URI datasetListUri, String datasetName) {
		return UriBuilder.fromUri(datasetListUri)
				.path(datasetName)
				.build();
	}
	
	protected List<Link> getLinksForDatasets(URI datasetListUri,
			List<Dataset> datasetList,
			boolean allowUpdate) {
		
		List<Link> links = new ArrayList<Link>();
		
		for (Dataset d : datasetList) {
			DatasetDescription description = d.getDescription();
			Link getDatasetLink =
					Link.fromUri(getLocationUriForDataset(datasetListUri,description.getName()))
							.rel(description.getName())
							.type("GET")
							.build();
			links.add(getDatasetLink);
			
			if (allowUpdate) {
				if (description.getDatasetKind() == DatasetKind.FILE_COLLECTION) {
					Link postDatasetLink =
							Link.fromUri(getLocationUriForDataset(datasetListUri,description.getName()))
									.rel(description.getName())
									.type("POST")
									.build();
					links.add(postDatasetLink);
					
				} else {
					Link putDatasetLink =
							Link.fromUri(getLocationUriForDataset(datasetListUri,description.getName()))
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
