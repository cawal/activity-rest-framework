package br.usp.ffclrp.dcm.lssb.activityrest.bootstrap.server

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.*

fun Activity.getDatasetByName(name: String?): Dataset? {
    return listOf(this.inputDatasets, this.outputDatasets)
        .flatten()
        .find {
            it.name == name
        }
}

fun Activity.getInputDatasetByName(name: String?): InputDataset? {
    return this.inputDatasets
        .find {
            it.name == name
        }
}

fun Activity.getOutputDatasetByName(name: String?): OutputDataset? {
    return this.outputDatasets
        .find {
            it.name == name
        }
}


fun Activity.getParameterByName(name: String?): Parameter? {
    return this.parameters.find {
        it.name == name
    }
}
