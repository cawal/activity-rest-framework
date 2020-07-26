package br.usp.ffclrp.dcm.lssb.activityrest.bootstrap.server

import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.Deployment
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.FunctionalEntity


data class GenerateClientRequest(
    var activity: Activity,
    var deployment: Deployment
)

data class GenerateServiceRequest(
    var activity: Activity,
    var functionalEntity: FunctionalEntity,
    var deployment: Deployment
)

/*
data class ActivityDTO(
    var name: String? = null
)


data class DeploymentDTO(
    var name: String? = null
)
*/