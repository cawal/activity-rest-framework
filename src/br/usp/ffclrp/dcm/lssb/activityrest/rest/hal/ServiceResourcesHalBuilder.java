package br.usp.ffclrp.dcm.lssb.activityrest.rest.hal;

import java.net.URI;

import javax.ws.rs.core.UriInfo;

import br.usp.ffclrp.dcm.lssb.activityrest.rest.newanalyses.NewAnalysesCollection;
import io.openapitools.jackson.dataformat.hal.HALLink;

public class ServiceResourcesHalBuilder {
	
	UriInfo uriInfo = null;
	
	/**
	 * 
	 * @param uriInfo The UriInfo providing the requested URI data (self);
	 * @return this, for chaining;
	 */
	public ServiceResourcesHalBuilder withUriInfo(UriInfo uriInfo) {
		this.uriInfo = uriInfo;
		return this;
	}
	
	/**
	 * Creates a ServiceResourceHal with the provided information.
	 * @return
	 */
	public ServiceResourcesHal build() {
		ServiceResourcesHal srHal = new ServiceResourcesHal();
		
		srHal.self = new HALLink.Builder(
				URI.create(uriInfo.getAbsolutePath().toString()))
						.build();
		srHal.createAnalysis = new HALLink.Builder(URI.create(uriInfo
				.getBaseUriBuilder()
				.path("new-analyses").build().toString()))
						.build();
		
		return srHal;
	}
	
}
