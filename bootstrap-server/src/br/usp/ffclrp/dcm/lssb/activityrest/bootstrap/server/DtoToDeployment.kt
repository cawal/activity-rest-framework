package br.usp.ffclrp.dcm.lssb.activityrest.bootstrap.server

import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.Deployment
import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.DeploymentModelFactory
import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.DeploymentModelPackage


class DtoToDeployment() {

    init {
        DeploymentModelPackage.eINSTANCE.eClass()
    }

    fun transform(dto: DeploymentDTO): Deployment {
        return DeploymentModelFactory.eINSTANCE.createDeployment();
    }


}