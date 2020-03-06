package br.usp.ffclrp.dcm.lssb.activityrest.jbpmclient

import org.kie.api.io.ResourceType

data class BpmnProcessResource(
	val processId: String,
	val path: String,
	val type: ResourceType
)