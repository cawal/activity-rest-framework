package br.usp.ffclrp.dcm.lssb.activityrest.bootstrap.server

import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.Deployment
import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.DeploymentModelFactory
import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.DeploymentModelPackage
import javax.json.JsonObject


class DtoToDeployment() {

    init {
        DeploymentModelPackage.eINSTANCE.eClass()
    }

    fun transform(dto: JsonObject): Deployment {
        return DeploymentModelFactory.eINSTANCE.createDeployment();
    }


}