@file:JvmName("JavaProjectGeneratorCLI")

package br.usp.ffclrp.dcm.lssb.activityrest.generation.cli

import br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy.JavaProjectGenerator
import br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy.ModelsService
import picocli.CommandLine
import picocli.CommandLine.Parameters
import java.io.File
import java.io.IOException
import java.nio.file.*
import java.nio.file.Files.createDirectories
import java.nio.file.attribute.BasicFileAttributes
import java.util.concurrent.Callable


class AppCallable() : Callable<Int> {

        @Parameters(
            index = "0",
        	paramLabel = "ACTIVITY_FILE",
        	arity = "1..1",
        	description = ["The ActDL File of the service"]
        )
        var activityFile : File? = null;

    @Parameters(
        index = "1",
        paramLabel = "DEPLOYMENT_FILE",
        arity = "1..1",
        description = ["The Deployment description file of the service"]
    )
    var deploymentFile : File? = null;


    @Parameters(
        index = "2",
        paramLabel = "OUTPUT_ZIP",
        arity = "1..1",
        description = ["The output Zip File"]
    )
    var outputFile : File? = null;

    override fun call(): Int {
        return execute(this)
    }
}

fun main(args: Array<String>) {
    System.exit(CommandLine(AppCallable()).execute(*args))
}

fun execute(config: AppCallable): Int {
    val generator = JavaProjectGenerator();
    val activity = ModelsService.retrieveAADLModel(config.activityFile?.inputStream())
    val deployment = ModelsService.retrieveDeploymentModel(config.deploymentFile?.inputStream())
    val outputTemp = generator.generate(activity,deployment)

    val outputDir = config.outputFile ?: File(activity.name);

    if(outputDir.exists()){
        outputDir.delete()
    }

    println(outputDir);


    copyFolder(outputTemp.toPath(),outputDir.toPath(),StandardCopyOption.REPLACE_EXISTING);

    return 0
}

@Throws(IOException::class)
fun copyFolder(source: Path, target: Path, vararg options: CopyOption) {
    Files.walkFileTree(source, object : SimpleFileVisitor<Path>() {
        @Throws(IOException::class)
        override fun preVisitDirectory(dir: Path, attrs: BasicFileAttributes): FileVisitResult {
            createDirectories(target.resolve(source.relativize(dir)))
            return FileVisitResult.CONTINUE
        }

        @Throws(IOException::class)
        override fun visitFile(file: Path, attrs: BasicFileAttributes): FileVisitResult {
            Files.copy(file, target.resolve(source.relativize(file)), *options)
            return FileVisitResult.CONTINUE
        }
    })
}
