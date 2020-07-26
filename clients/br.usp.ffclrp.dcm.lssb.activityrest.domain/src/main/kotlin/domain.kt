package br.usp.ffclrp.dcm.lssb.activityrest.domain

import java.io.File
import org.apache.commons.io.IOUtils
import java.io.FileInputStream

//typealias DatasetItem = java.io.File

class ActivityInstance() {
    var state: ActivityInstanceState = ActivityInstanceState.CREATED
    var parameters: Map<String, Any> = emptyMap()
    var inputDatasets: Map<String, List<DatasetItem>> = emptyMap()
    var outputDatasets: Map<String, List<DatasetItem>> = emptyMap()
    var id: String = ""
    var errorReport: String? = ""

    constructor (
        state: ActivityInstanceState = ActivityInstanceState.CREATED,
        parameters: Map<String, Any> = emptyMap(),
        inputDatasets: Map<String, List<DatasetItem>> = emptyMap(),
        outputDatasets: Map<String, List<DatasetItem>> = emptyMap()
    ) : this() {
        this.state = state
        this.parameters = parameters
        this.inputDatasets = inputDatasets
        this.outputDatasets = outputDatasets
    }

}

class DatasetItem() {
    var name: String = ""
    var contentType: String = ""
    var content: DatasetContent = DatasetContent(null)

    constructor (
        name: String,
        contentType: String,
        content: DatasetContent
        ) : this() {
        this.name = name
        this.contentType = contentType
        this.content = content
    }
}

inline class DatasetContent(val content : String?);

fun datasetItemFrom(file: File): DatasetItem {
    if (file.exists()) {
        return DatasetItem(
            file.getName(),
            "",
            DatasetContent(IOUtils.toString(FileInputStream(file)))
        )
    } else {
        return DatasetItem(
            file.getName(),
            "*/*",
            DatasetContent(null)
        )
    }
}

enum class ActivityInstanceState {
    CREATED,
    READY,
    RUNNING,
    SUCCEEDED,
    FAILED,
    REMOVED
}