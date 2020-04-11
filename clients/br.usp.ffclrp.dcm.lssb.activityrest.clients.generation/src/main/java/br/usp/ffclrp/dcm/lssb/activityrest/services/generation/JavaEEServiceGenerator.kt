package br.usp.ffclrp.dcm.lssb.activityrest.services.generation

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
        val placeholderFile = directory.walkBottomUp()
            .findLast { it.name == "activity.aadl" }

        if (placeholderFile != null ) {
            placeholderFile.delete()
            activityFile.renameTo(placeholderFile)
        } else {
            throw Exception("Cannot find the placeholder file for activity")
        }
    }

    fun addDeploymentFileToProject(deploymentFile: File) {
        val placeholderFile = directory.walkBottomUp()
            .findLast { it.name == "activity.deployment" }

        if (placeholderFile != null ) {
            placeholderFile.delete()
            deploymentFile.renameTo(placeholderFile)
        } else {
            throw Exception("Cannot find the placeholder file for deployment")
        }
    }


}
