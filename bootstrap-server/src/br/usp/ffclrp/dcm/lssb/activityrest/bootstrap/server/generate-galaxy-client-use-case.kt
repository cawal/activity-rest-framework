package br.usp.ffclrp.dcm.lssb.activityrest.bootstrap.server

import br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy.GalaxyClientGenerator
import java.io.File

class GenerateGalaxyClient(){
    fun generate(request: GenerateClientRequest) : File {

        print(request)
        val generator = GalaxyClientGenerator();
        val activity = request.activity
        val deployment = request.deployment
        val projectDir = generator.generateClient(activity,deployment)

        return ZipDir.main(projectDir)
    }
}