package br.usp.ffclrp.dcm.lssb.activityrest.services.generation

import br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy.JavaProjectGenerator
import br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy.ModelsService
import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.Deployment
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.FunctionalEntity
import org.apache.commons.io.IOUtils
import java.io.File
import java.io.FileOutputStream

class JavaEEServiceGenerator {


    fun generateService(
        activity: Activity,
        functionalInterface: FunctionalEntity,
        deployment: Deployment
    )
            : File {

        val deploymentFile = createDeploymentFile(deployment);
        val activityFile = createActivityFile(activity);
        val javaProject = JavaProject(
            JavaProjectGenerator()
                .generate(activity, deployment)
        )


        javaProject.combineArtifacts(activityFile, deploymentFile)

        return javaProject.directory
    }

    fun createActivityFile(activity: Activity): File {
        val activityFile = File.createTempFile("activity", ".aadl")
        val activityActDl = ModelsService.getAadlAsString(activity)
        val outputStream = FileOutputStream(activityFile)

        IOUtils.write(activityActDl, outputStream)
        outputStream.flush()
        outputStream.close()

        return activityFile
    }

    fun createDeploymentFile(deployment: Deployment): File {
        val deploymentFile = File.createTempFile("deployment", ".deployment")
        val deploymentDl = ModelsService.getDeploymentAsString(deployment)
        val outputStream = FileOutputStream(deploymentFile)

        IOUtils.write(deploymentDl, outputStream)
        outputStream.flush()
        outputStream.close()

        return deploymentFile
    }


}

class JavaProject(val directory: File) {
    fun combineArtifacts(
        activityFile: File,
        deploymentFile: File
    ) {
        addActivityFileToProject(activityFile)
        addDeploymentFileToProject(deploymentFile)
    }

    fun addActivityFileToProject(activityFile: File) {
        activityFile.renameTo(File(directory, "galaxy/tool.xml"))
    }

    fun addDeploymentFileToProject(deploymentFile: File) {
        deploymentFile.renameTo(File(directory, "galaxy/tool.xml"))
    }


}
