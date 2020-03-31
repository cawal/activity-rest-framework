package br.usp.ffclrp.dcm.lssb.activityrest.bootstrap.server

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionFactory
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.FunctionalEntity
import javax.json.JsonObject

class DtoToFunctionalEntity (){

    init {
        AnalysisActivityDescriptionPackage.eINSTANCE.eClass()
    }

    private var factory = AnalysisActivityDescriptionFactory.eINSTANCE

    fun transform(dto : JsonObject) : FunctionalEntity {
        return getFunctionalEntity(dto)
    }


    fun getFunctionalEntity(dto : JsonObject) : FunctionalEntity {
       val functionalEntity = factory.createCommandLineTool();
        functionalEntity.name = dto.getString("name")
        return functionalEntity
    }
}