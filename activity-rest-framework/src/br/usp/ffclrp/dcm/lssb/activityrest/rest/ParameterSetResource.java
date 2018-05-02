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
	 *  to send a simple value (not an array) or vice versa.
	 */
	@PUT
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response putAllParameters(Map<String,Object> map) {
		System.out.println("Received Map:");
		System.out.println(map);
		try {
			ParametersUtil.setParametersFromMap(aa, map);
			try {
				analysisActivityDao.update(aa);
			} catch (AnalysisActivityNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new ServerErrorException(500);
			}
			
			return Response.ok(map).build();
			
		} catch (IllegalParameterException e) {
			e.printStackTrace();
			System.out.println("Parameter:");
			System.out.println(e.getParameterName());
			System.out.println(e.getNewValue());
			throw new BadRequestException(e);
		}
		
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
			List<Parameter> parameterList = aa.getParameters();
			Map<String, Object> map = ParametersUtil.toMap(parameterList);
			
			if(map.containsKey(parameterName)) {
				return Response.ok(map.get(parameterName)).build();
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

			Parameter p = aa.parameterForName(parameterName);
			set(p,parameterValue);
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


	private void set(Parameter p, Object value) throws IllegalParameterException{
		//TODO: copy in the AnalysisActivity class
		if(p != null) {
			switch (p.getDescription().getParameterKind()) {
			case SINGLE_VALUE:
				if((value instanceof List)) {
					throw new IllegalParameterException(p.getName(),value);
				} else {
					p.getValues().clear();
					p.getValues().add((String)value);
				}
				
				break;
			case LIST:
				if(! (value instanceof List)) {
					throw new IllegalParameterException(p.getName(),value);
				} else {
					p.getValues().clear();
					@SuppressWarnings("unchecked")
					List<String> stringValues = ((List<String>)value);
					stringValues.forEach(v -> p.getValues().add(v.toString()));
				}
				break;
			
			default:
				break;
			}
		} 
		
	}
}
