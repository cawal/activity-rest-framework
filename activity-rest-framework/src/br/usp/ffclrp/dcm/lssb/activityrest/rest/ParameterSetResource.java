package br.usp.ffclrp.dcm.lssb.activityrest.rest;

import java.net.URI;
import java.util.List;
import java.util.Map;

import javax.annotation.Nonnull;
import javax.validation.constraints.NotNull;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.ServerErrorException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import br.usp.ffclrp.dcm.lssb.activityrest.dao.AnalysisActivityDao;
import br.usp.ffclrp.dcm.lssb.activityrest.exceptions.AnalysisActivityNotFoundException;
import br.usp.ffclrp.dcm.lssb.activityrest.exceptions.IllegalParameterException;
import br.usp.ffclrp.dcm.lssb.activityrest.util.ParametersUtil;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescription;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Parameter;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.ParameterMap;
import io.swagger.annotations.Api;

@Api()
public class ParameterSetResource {
	
	UriInfo uriInfo;
	URI baseApplicationURI;
	URI absolutePathURI;
	
	private AnalysisActivity aa;
	private AnalysisActivityDao analysisActivityDao;
	AnalysisActivityDescription aaDesc;
	boolean allowUpdates;
	
	public ParameterSetResource(
			@Nonnull AnalysisActivityDescription aaDesc,
			@Nonnull UriInfo uriInfo,
			@Nonnull AnalysisActivity aa,
			@Nonnull AnalysisActivityDao analysisActivityDao,
			boolean allowUpdates) {
		this.aaDesc = aaDesc;
		this.aa = aa;
		this.analysisActivityDao = analysisActivityDao;
		
		this.baseApplicationURI = uriInfo.getBaseUri();
		this.absolutePathURI = uriInfo.getAbsolutePath();
		this.allowUpdates = allowUpdates;
	}
	
	/**
	 * Returns all parameters for a activity.
	 * 
	 * @param analysisID
	 * @param parameters
	 * @return
	 */
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getAllParameters() {
		Map<String, Object> map = aa.getParameters();
		;
		return Response.ok(map).build();
	}
	
	/**
	 * Modifies all parameters at once.
	 * 
	 * @return
	 * @exception BadRequestException
	 *                if
	 *                - the object contains a property not found as a parameter
	 *                - a parameter should be a list but the user is trying
	 *                to send a simple value (not an array) or vice versa.
	 */
	@PUT
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response putAllParameters(Map<String, Object> map) {
		System.out.println("Received Map:");
		System.out.println(map);
		aa.getParameters().putAll(map);
		try {
			analysisActivityDao.update(aa);
		} catch (AnalysisActivityNotFoundException e) {
			e.printStackTrace();
			throw new ServerErrorException(500);
		}
		
		return Response.ok(map).build();
		
	}
	
	/**
	 * Returns one parameters for a activity.
	 * 
	 * @param analysisID
	 * @param parameters
	 * @return
	 */
	@GET
	@Path("/{parameterName : [A-Za-z0-9-.]+}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getParameterByName(
			@NotNull @PathParam("parameterName") String parameterName) {
		ParameterMap parameters = aa.getParameters();
		
		if (parameters.containsKey(parameterName)) {
			return Response.ok(parameters.get(parameterName)).build();
		} else {
			throw new NotFoundException();
		}
		
	}
	
	/**
	 * Receives a object containing only the parameter name and the value
	 * 
	 * @param analysisID
	 * @param parameterName
	 * @param parameterValue
	 * @return
	 */
	@PUT
	@Path("/{parameterName  : [A-Za-z0-9-.]+}")
	@Consumes({ MediaType.APPLICATION_JSON })
	public Response putParameterByName(
			@NotNull @PathParam("parameterName") String parameterName,
			Object parameterValue) {
		try {
			
			aa.getParameters().put(parameterName, parameterValue);
			
			if(aa.getParameters().get(parameterName) != parameterValue) {
				throw new IllegalParameterException(parameterName,parameterValue);
			}
			
			analysisActivityDao.update(aa);
			return Response.ok().build();
			
		} catch (IllegalParameterException e) {
			e.printStackTrace();
			System.out.println("Parameter:");
			System.out.println(e.getParameterName());
			System.out.println(e.getNewValue());
			throw new BadRequestException();
		} catch (AnalysisActivityNotFoundException e) {
			throw new NotFoundException();
		}
		
	}
}
