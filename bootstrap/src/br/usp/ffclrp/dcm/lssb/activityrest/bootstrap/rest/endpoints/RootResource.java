package br.usp.ffclrp.dcm.lssb.activityrest.bootstrap.rest.endpoints;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 * Root resource of the API.
 * Provides the URI path segments for its subresources.
 * 
 * @author cawal
 *
 */
@Path("/") 
public class RootResource {
	
	@Context
	Application app;
	
	@Context
	UriInfo uriInfo;
	
	
	
	public RootResource() {	};
	
	@GET
	@Produces("*/*")
	@Consumes("*/*")
	public Response ping() {
		return Response.ok("pong").build();
	}
	
}
