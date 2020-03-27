package br.usp.ffclrp.dcm.lssb.activityrest.bootstrap.server

import br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy.GalaxyClientGenerator
import java.io.File

class GenerateActivityRestServiceClient(){
    fun generate(request: GenerateServiceRequest) : File {

        print(request)
        val generator = GalaxyClientGenerator();
        val activity = DtoToActivity().transform(request.activity ?: ActivityDTO())
        val deployment = DtoToDeployment().transform(request.deployment ?: DeploymentDTO())
        val projectDir = generator.generateClient(activity,deployment)

        return ZipDir.main(projectDir)
    }
}