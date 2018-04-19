package br.usp.ffclrp.dcm.lssb.activityrest.rest;

import java.net.URI;
import java.util.List;
import java.util.Map;

import javax.annotation.Nonnull;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.ServerErrorException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import br.usp.ffclrp.dcm.lssb.activityrest.dao.AnalysisActivityDao;
import br.usp.ffclrp.dcm.lssb.activityrest.exceptions.AnalysisActivityNotFoundException;
import br.usp.ffclrp.dcm.lssb.activityrest.util.ParametersUtil;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescription;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.AnalysisActivity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitymodel.Parameter;
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
		List<Parameter> parameterList = aa.getParameters();
		Map<String, Object> map = ParametersUtil.toMap(parameterList);
		return Response.ok(map).build();
	}



	
	
	/**
	 * Modifies all parameters at once. 
	 * 
	 * @return
	 * @exception BadRequestException if 
	 * 	- the object contains a property not found as a parameter
	 *  - a parameter should be a list but the user is trying 
	 *  to send a sinple value (not an array) or vice versa.
	 */
	@PUT
	@Consumes({ MediaType.APPLICATION_JSON })
	public Response putAllParameters(Map<String,Object> map) {
		
		if(ParametersUtil.setParametersFromMap(aa, map)) {
			try {
				analysisActivityDao.update(aa);
			} catch (AnalysisActivityNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new ServerErrorException(500);
			}
			
			return Response.ok(map).build();
			
		} else {
			throw new BadRequestException();
		}
		
	}



	
	
	
	
	/**
	 * Returns one parameters for a activity.
	 * 
	 * @param analysisID
	 * @param parameters
	 * @return
	 */
	/*@GET
	@Path("/{parameterName}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getParameterByName(
			@PathParam("parameterName") String parameterName) {
		
		try {
			Object parameter = aa.getParameters().getParameter(parameterName);
						
			return Response.ok(parameter).build();
		} catch (IllegalParameterException e) {
			throw new NotFoundException();
		} 
	}*/
	

	
	/**
	 * Receives a object containing only the parameter name and the value
	 * 
	 * @param analysisID
	 * @param parameterName
	 * @param parameter
	 * @return
	 */
/*	@PUT
	@Path("/{parameterName}")
	@Consumes({ MediaType.APPLICATION_JSON })
	public Response putParameterByName(
			@PathParam("analysisID") String analysisID,
			@NotNull @PathParam("parameterName") String parameterName,
			Object parameter) {		
		try {

			ParameterSet parameters = aa.getParameters();
			parameters.setParameter(parameterName, parameter);
			
			analysisActivityDao.update(aa);
			
			return Response.ok().build();
		} catch (IllegalParameterException e) {
			e.printStackTrace();
			throw new BadRequestException();
		} catch (AnalysisActivityNotFoundException e) {
			throw new NotFoundException();
		}
		
	}*/
}
