package br.usp.ffclrp.dcm.lssb.activityrest.rest.hal;

import br.usp.ffclrp.dcm.lssb.activityrest.rest.ResourceRelations;
import io.openapitools.jackson.dataformat.hal.HALLink;
import io.openapitools.jackson.dataformat.hal.annotation.Link;
import io.openapitools.jackson.dataformat.hal.annotation.Resource;

@Resource
public class ServiceResourcesHal {

	@Link("self")
	public HALLink self;
	
	@Link(ResourceRelations.ROOT_2_NEW_ANALYSES_COLLECTION)
	public HALLink createAnalysis;
	
}