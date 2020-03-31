package br.usp.ffclrp.dcm.lssb.activityrest.bootstrap.server

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionFactory
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage
import javax.json.JsonObject

class DtoToActivity (){

    init {
        AnalysisActivityDescriptionPackage.eINSTANCE.eClass()
    }

    private var factory = AnalysisActivityDescriptionFactory.eINSTANCE

    fun transform(dto : JsonObject) : Activity {
        return getActivity(dto)
    }


    fun getActivity(dto : JsonObject) : Activity {
       val activity = factory.createActivity();
        activity.name = dto.getString("name")
        return activity
    }
}