package br.usp.ffclrp.dcm.lssb.activityrest.rest.representations

import java.net.URI

data class AnalysisActivityRepresentation(
	val id: String,
	var state: AnalysisActivityStateRepresentation,
	val errorReport: String?
)

enum class AnalysisActivityStateRepresentation {
	CREATED,
	READY,
	RUNNING,
	SUCCEEDED,
	FAILED,
	REMOVED
}

data class JobInstanceRepresentation(
	val id: String,
	var state: AnalysisActivityStateRepresentation,
	var errorReport: String
)

data class ParameterRepresentation(
	val name: String,
	var value: List<Any>
)


data class FileRepresentation(
	val name: String,
	val content: String,
	val contentType: String?
)

data class HypermediaLink(
	val rel: String,
	val uri: URI,
	val type: String?
) 