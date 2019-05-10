package br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.parameters;

import java.net.URI;
import java.util.Arrays;
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

import br.usp.ffclrp.dcm.lssb.activityrest.dao.ActivityRepository;
import br.usp.ffclrp.dcm.lssb.activityrest.dao.exceptions.AnalysisActivityNotFoundException;
import br.usp.ffclrp.dcm.lssb.activityrest.dao.exceptions.AnalysisActivityUpdateFailure;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.AnalysisActivity;
import br.usp.ffclrp.dcm.lssb.activityrest.domain.ParameterMap;
import br.usp.ffclrp.dcm.lssb.activityrest.rest.representations.ParameterRepresentation;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;
import io.swagger.annotations.Api;

@Api()
public class ParameterSetResource {
	
	UriInfo uriInfo;
	URI baseApplicationURI;
	URI absolutePathURI;
	
	private AnalysisActivity aa;
	private ActivityRepository analysisActivityDao;
	Activity aaDesc;
	boolean allowUpdates;
	
	public ParameterSetResource(
			@Nonnull Activity aaDesc,
			@Nonnull UriInfo uriInfo,
			@Nonnull AnalysisActivity aa,
			@Nonnull ActivityRepository analysisActivityDao,
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
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, })
	public Response getAllParameters() {
		Map<String, Object> map = aa.getParameters();
		
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
		aa.getParameters().putAll(map);
		try {
			analysisActivityDao.save(aa);
		} catch (AnalysisActivityUpdateFailure e) {
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
		
		if(!existsParameterForName(parameterName))
			throw new NotFoundException();
		
		return tryUpdateParameter(parameterName, parameterValue);
		
	}
	
	@PUT
	@Path("/{parameterName  : [A-Za-z0-9-.]+}")
	@Consumes({ MediaType.APPLICATION_XML })
	public Response putParameterByNameXML(
			@NotNull @PathParam("parameterName") String parameterName,
			ParameterRepresentation parameter) {
		
		if(!existsParameterForName(parameterName))
			throw new NotFoundException();
		
		List<Object> parameterValue = parameter.getValue();
		return tryUpdateParameter(parameterName, parameterValue);
		
	}

	private boolean existsParameterForName(String parameterName) {
		boolean parameterExist = 
				aaDesc.getParameters().stream()
					.anyMatch(p -> p.getName().equalsIgnoreCase(parameterName));
		return parameterExist;
	}
	
	private Response tryUpdateParameter(String parameterName,
			Object parameterValue) {
		try {
			// sanitize and update parameter value
			List<Object> values = null;
			if (parameterValue instanceof List) {
				values = (List<Object>) parameterValue;
			} else {
				values = Arrays.asList(parameterValue);
			}
			
			aa.getParameters().put(parameterName, values);
			
			// verify if update was successfull
			Object updatedParametersObject =
					aa.getParameters().get(parameterName);
			
			List<Object> list = null;
			if (!(updatedParametersObject instanceof List)) {
				list = Arrays.asList(updatedParametersObject);
			} else {
				list = (List<Object>) updatedParametersObject;
			}
			
			boolean ok = list.size() == values.size();
			for (int i = 0; ok && i < list.size(); i++) {
				ok = ok && list.get(i).toString().equals(values.get(i).toString());
			}
			
			if (!ok) {
				throw new IllegalParameterException(parameterName,
						parameterValue);
			}
			
			analysisActivityDao.save(aa);
			return Response.ok().build();
			
		} catch (IllegalParameterException e) {
			e.printStackTrace();
			throw new BadRequestException();
		} catch (AnalysisActivityUpdateFailure e) {
			throw new NotFoundException();
		}
	}
}
