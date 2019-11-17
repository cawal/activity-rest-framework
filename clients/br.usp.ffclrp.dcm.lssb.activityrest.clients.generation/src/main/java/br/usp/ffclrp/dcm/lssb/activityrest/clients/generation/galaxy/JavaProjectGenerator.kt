package br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy

import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.Deployment
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity
import org.apache.maven.cli.MavenCli
import java.io.File

class JavaProjectGenerator {
    
    val archetypeGroup = "br.usp.ffclrp.dcm.lssb.activityrest"
    val archetypeId = "galaxy-client-base-archetype"
    val archetypeVersion = "1.0-SNAPSHOT"

    fun generate(activity: Activity, deployment: Deployment): File {

        val artifactId = "${activity.name}-client"
        val artifactGroupId = activity.name
        val artifactVersion = deployment.getService().getApiVersion() ?: "1.0"

        val tempDir = createTempDir(prefix = "root", suffix = "")
        val arguments = arrayOf(
                "archetype:generate",
                "-DarchetypeGroupId=${archetypeGroup}",
                "-DarchetypeArtifactId=${archetypeId}",
                "-DarchetypeVersion=${archetypeVersion}",
                "-DartifactId=${artifactId}",
                "-DgroupId=${artifactGroupId}",
                "-Dversion=${artifactVersion}",
                "-DinteractiveMode=false"
        )

        System.setProperty(
                "maven.multiModuleProjectDirectory",
                tempDir.getAbsolutePath()
        )
        val cli = MavenCli();
        val out = System.out
        val err = System.err
        cli.doMain(arguments, tempDir.getAbsolutePath(), out, err)

        val projectRoot = tempDir.listFiles()[0]
        return projectRoot
    }
    

}