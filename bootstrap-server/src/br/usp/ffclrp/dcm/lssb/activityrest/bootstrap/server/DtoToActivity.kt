package br.usp.ffclrp.dcm.lssb.activityrest.bootstrap.server

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionFactory
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionPackage

class DtoToActivity (){

    init {
        AnalysisActivityDescriptionPackage.eINSTANCE.eClass()
    }

    private var factory = AnalysisActivityDescriptionFactory.eINSTANCE

    fun transform(dto : ActivityDTO) : Activity {
        return getActivity(dto)
    }


    fun getActivity(dto : ActivityDTO) : Activity {
       val activity = factory.createActivity();
        activity.name = dto.name
        return activity
    }
}