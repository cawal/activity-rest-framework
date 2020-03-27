package br.usp.ffclrp.dcm.lssb.activityrest.bootstrap.server


data class GenerateClientRequest(
    var activity: ActivityDTO? = null,
    var deployment: DeploymentDTO? = null
)

data class GenerateServiceRequest(
    var activity: ActivityDTO? = null,
    var deployment: DeploymentDTO? = null
)


data class ActivityDTO(
    var name: String? = null
)


data class DeploymentDTO(
    var name: String? = null
)