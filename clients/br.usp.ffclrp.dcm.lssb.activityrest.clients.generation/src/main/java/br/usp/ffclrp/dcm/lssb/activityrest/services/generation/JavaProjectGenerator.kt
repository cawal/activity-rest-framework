package br.usp.ffclrp.dcm.lssb.activityrest.services.generation

import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.Deployment
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.*
import org.apache.maven.cli.MavenCli
import java.io.File
import java.io.ByteArrayOutputStream
import java.io.PrintStream

//import br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy.sanitized


class JavaProjectGenerator {

    val archetypeGroup = "activity-rest"
    val archetypeId = "archetype"
    val archetypeVersion = "0.0.1-SNAPSHOT"

    fun generate(activity: Activity, deployment: Deployment): File {
        val projectRoot = generateBaseMavenProject(activity, deployment)
        return projectRoot
    }

    fun generateBaseMavenProject(activity: Activity, deployment: Deployment)
            : File {
        val artifactId = "${activity.name}-service"
        val artifactGroupId = activity.name
        val artifactVersion = deployment.getService().getApiVersion() ?: "1.0"

        val tempDir = createTempDir(prefix = "activityrest-service-", suffix = "")
        val arguments = listOf<String>(
                "archetype:generate",
//                "-Dmaven.repo.local=/home/cawal/.m2",
                "-e",
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
        println(tempDir.absolutePath)
        val cli = MavenCli();
        val baosOut = ByteArrayOutputStream();
        val baosErr = ByteArrayOutputStream();

        val out = PrintStream(baosOut, true);
        val err = PrintStream(baosErr, true);
        println(arguments)
        val exitCode = cli.doMain(
            arguments.toTypedArray(),
            tempDir.getAbsolutePath(),
//            System.out,
//            System.err)
            out,
            err)
        println("ExitCode: $exitCode")

        print(out.toString())
        print(err.toString())

        tempDir.listFiles().forEach {
            println("CHILD: ${it.getAbsolutePath()}")
        };
        val projectRoot = tempDir.listFiles()[0]
//        val projectRoot = tempDir
        println(projectRoot.getAbsolutePath())
        return projectRoot
    }

}
