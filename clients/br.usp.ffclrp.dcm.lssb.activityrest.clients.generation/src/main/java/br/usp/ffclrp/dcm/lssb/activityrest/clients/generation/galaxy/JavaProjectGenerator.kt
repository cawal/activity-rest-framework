package br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity
import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.Deployment
import java.io.File
import org.apache.maven.cli.MavenCli
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class JavaProjectGenerator {
    
    val archetypeGroup = "br.usp.ffclrp.dcm.lssb.activityrest"
    val archetypeId = "galaxy-client-base-archetype"
    val archetypeVersion = "1.0-SNAPSHOT"

    fun generate(activity: Activity, deployment: Deployment): File {

        val tempDir = createTempDir(prefix = "root", suffix = "");
        System.setProperty("maven.multiModuleProjectDirectory", tempDir.getAbsolutePath());

        val arguments = arrayOf(
                "archetype:generate",
                "-DarchetypeGroupId=${archetypeGroup}",
                "-DarchetypeArtifactId=${archetypeId}",
                "-DarchetypeVersion=${archetypeVersion}",
                "-DartifactId=my-app",
                "-DgroupId=com.example",
                "-Dversion=1.0-SNAPSHOT",
                "-DinteractiveMode=false"
        )

        val cli = MavenCli();
        val baosOut = ByteArrayOutputStream();
        val baosErr = ByteArrayOutputStream();

        val out = PrintStream(baosOut, true);
        val err = PrintStream(baosErr, true);

        cli.doMain(arguments, tempDir.getAbsolutePath(), out, err);
        val projectRoot = tempDir.listFiles()[0]

        val stdout = baosOut.toString("UTF-8");
        val stderr = baosErr.toString("UTF-8");

        print(stdout)


        print("=================EERRRROOSS==")
        print(stderr)

        return projectRoot
    }

}