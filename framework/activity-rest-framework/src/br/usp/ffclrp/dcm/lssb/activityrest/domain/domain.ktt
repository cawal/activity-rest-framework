package br.usp.ffclrp.dcm.lssb.activityrest.domain

import java.io.File

// TEST IN : https://play.kotlinlang.org

enum class ParameterType { INTEGER, REAL, STRING, BOOLEAN }
enum class InstanceState {
	CREATED,
	READY,
	RUNNING,
	SUCCEEDED,
	FAILED,
	REMOVED
}

/**
 * ActivityInstance is a entity and maintains its identity
 * at all times through its id value.
 */
class ActivityInstance(
	val id: String,
	var state: InstanceState,
	var parameters: Map<String, List<Any>> = mapOf(),
	var inputDatasets: Map<String, List<DatasetFile>> = mapOf(),
	var outputDatasets: Map<String, List<DatasetFile>> = mapOf()
){
}


class DatasetFile (
	val name : String,
	val contentType : String,
	val contents : ByteArray
)
