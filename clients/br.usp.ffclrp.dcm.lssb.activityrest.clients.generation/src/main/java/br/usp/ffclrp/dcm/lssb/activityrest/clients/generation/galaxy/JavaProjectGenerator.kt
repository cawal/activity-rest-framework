package br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy

import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.Deployment
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.*
import org.apache.maven.cli.MavenCli
import java.io.File
import java.io.ByteArrayOutputStream
import java.io.PrintStream


fun String.sanitized(): String {
    return this.replace("-", "_")
}

class JavaProjectGenerator {

    val archetypeGroup = "br.usp.ffclrp.dcm.lssb.activityrest"
    val archetypeId = "galaxy-client-base-archetype"
    val archetypeVersion = "1.0-SNAPSHOT"

    val bpmnFile = "actvity-jbpm-bpmn2"

    fun generate(activity: Activity, deployment: Deployment): File {

        val projectRoot = generateBaseMavenProject(activity, deployment)

        val cliFile = getCliFile(activity, deployment)

        cliFile.renameTo(File(projectRoot, "src/main/java/app-activity-specific.kt"))

        return projectRoot

    }

    fun generateBaseMavenProject(activity: Activity, deployment: Deployment)
            : File {
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
        val baosOut = ByteArrayOutputStream();
        val baosErr = ByteArrayOutputStream();

        val out = PrintStream(baosOut, true);
        val err = PrintStream(baosErr, true);
        cli.doMain(arguments, tempDir.getAbsolutePath(), out, err)

        print(out.toString())
        print(err.toString())

        tempDir.listFiles().forEach {
            println("CHILD: ${it.getAbsolutePath()}")
        };
        val projectRoot = tempDir.listFiles()[0]
        println(projectRoot.getAbsolutePath())
        return projectRoot
    }

    fun getCliFile(activity: Activity,
                   deployment: Deployment): File {
        val tempCliFile = File.createTempFile("app-activity-specific", ".kt")

        tempCliFile.writeText(getCliFileContents(activity, deployment))

        return tempCliFile
    }


    fun getCliFileContents(activity: Activity, deployment: Deployment) =
            """
    @file:JvmName("App")
    @file:JvmMultifileClass
    
    package br.usp.ffclrp.dcm.lssb.activityrest.jbpmclient
    
    import br.usp.ffclrp.dcm.lssb.activityrest.domain.*
    import picocli.CommandLine
    import picocli.CommandLine.Command
    import picocli.CommandLine.Option
    import picocli.CommandLine.Parameters
    import java.io.File
    import java.util.concurrent.Callable
    import org.apache.commons.io.IOUtils
    import java.io.FileWriter
    
    
    
    /**
     * Activity-specific
     */
    @Command(name = "${activity.name}", version = ["${deployment.getService().getApiVersion()}"])
    class AppCallable() : Callable<Int> {
    
        ${createParameters(activity)}
    
        ${createOptions(activity, deployment)}
 
        override fun call(): Int {
            return execute(this)
        }
    }
    
    fun writeOutputDatasets(
        config: AppCallable,
        datasets: Map<String, List<DatasetItem>>
    ): Unit {
        IOUtils.write(datasets.get("output")?.first()?.content, FileWriter(config.output))
        println(config.output?.getAbsolutePath())
    }
    
    /**
     * Activity-specific
     */
    fun getActivityInstance(config: AppCallable): ActivityInstance {
        val parameters = mapOf<String, Any>(
        	${activity.getParameters().map {
                """ "${it.getName()}" to config.${it.getName().sanitized()}"""
            }.joinToString(",\n")}
        )
    
        val inputDatasets = mapOf<String, List<DatasetItem>>(
        	${activity.getInputDatasets().map {
                """ "${it.getName()}" to listOfNotNull(config.${it.getName().sanitized()})
                	.map { datasetItemFrom(it) }
            """
            }.joinToString(",\n")}
        )
    
        val outputDatasets = mapOf<String, List<DatasetItem>>(
        	${activity.getOutputDatasets().map {
                """ "${it.getName()}" to listOfNotNull(config.${it.getName().sanitized()})
                		.map { datasetItemFrom(it) }
            """
            }.joinToString(",\n")}
        )
    
    
        val instance = ActivityInstance(
            state = ActivityInstanceState.CREATED,
            parameters = parameters,
            inputDatasets = inputDatasets,
            outputDatasets = outputDatasets
        )
    
        return instance
    } 
    
    val bpmnResources = listOf(
            BpmnProcessResource("${activity.name}", "${bpmnFile}", ResourceType.BPMN2)
    )
    
    val executedProcessId = "${activity.name}"
    """.trimIndent();


    fun createParameters(activity: Activity) =
            """
			${activity.getInputDatasets()
                    .map { it.parameterText }
                    .joinToString("\n\n")
            }

			${activity.getOutputDatasets()
                    .map { it.parameterText }
                    .joinToString("\n\n")
            }


			${activity.getParameters()
                    .filter { it.getDefaultValue().size == 0 }
                    .map { it.parameterText }
                    .joinToString("\n\n")
            } """.trimIndent()


    fun createOptions(activity: Activity, deployment: Deployment) =
            """
			@Option(
				names = ["service-url"],
				paramLabel = "SERVICE_BASE_URL",
				arity = "1..1",
				description = ["The Activity-REST service base URL"]
			)
			var service_url : String
			= "${deployment.getContainer().getBaseUrl()}"
 
			${activity.getParameters()
                    .filter { it.getDefaultValue().size > 0 }
                    .map { it.optionText }
                    .joinToString("\n\n")
            } """.trimIndent()

    val InputDataset.parameterText: String
        get() =
            """
			@Parameters(
				names = ["${getName()}"],
				paramLabel = "${getName().toUpperCase()}",
				arity = "${getMinimumCardinality()}..${getMaximumCardinality()}",
				description = ["${getRemark()}"]
			)
			var ${getName().sanitized()} : ${
            if (getMaximumCardinality().toInt() != 1) "List<File>?" else "File?"
            }""".trimIndent()

    val OutputDataset.parameterText: String
        get() =
            """
			@Parameters(
				names = ["${getName()}"],
				paramLabel = "${getName().toUpperCase()}",
				arity = "${getMinimumCardinality()}..${getMaximumCardinality()}",
				description = ["${getRemark()}"]
			)
			var ${getName().sanitized()} : ${
            if (getMaximumCardinality().toInt() != 1) "List<File>?" else "File?"
            }""".trimIndent()

    val Parameter.parameterText
        get() =
            """
	@Parameters(
		names = ["${getName()}"],
		paramLabel = "${getName().toUpperCase()}",
		arity = "${getMinimumCardinality()}..${getMaximumCardinality()}",
		description = ["${getRemark()}"]
	)
	var ${getName().sanitized()} : ${typeText}?
""".trimIndent()


    val Parameter.optionText
        get() =
            """
	@Option(
		names = ["${getName().sanitized()}"],
		paramLabel = "${getName().toUpperCase()}",
		arity = "${getMinimumCardinality()}..${getMaximumCardinality()}",
		description = ["${getRemark()}"]
	)
	var ${getName().sanitized()} : ${typeText}
		= ${formatedDefaultValue}
""".trimIndent()

    val Parameter.typeText: String
        get() {
            return when (getMaximumCardinality().toInt()) {
                1 -> "${getParameterType().javaType}"
                else -> "List<${getParameterType().javaType}>"
            }
        }

    val Parameter.formattedDefaultValue: String
        get() {
            return when (getMaximumCardinality().toInt()) {
                1 -> formatParameterValue(
                        getDefaultValue().first(),
                        getParameterType()
                )
                else -> """listOf(${getDefaultValue()
                        .map { formatParameterValue(it, getParameterType()) }
                        .joinToString(",")})""""
            }
        }

    fun formatParameterValue(value: String, type: ParameterType): String {
        return when (type) {
            ParameterType.REAL, ParameterType.INTEGER -> value.toString()
            else -> "\"${value.toString()}\""
        }

    }

    val ParameterType.javaType
        get() : String {
            return when (this) {
                ParameterType.BOOLEAN -> "Boolean"
                ParameterType.INTEGER -> "Int"
                ParameterType.REAL -> "Double"
                ParameterType.STRING -> "String"
            }
        }

    val Parameter.formatedDefaultValue
        get() : String {
            return when (this.getMaximumCardinality().toInt()) {
                1 -> this.getDefaultValue().first()
                else -> "listOf(${this.getDefaultValue()
                        .joinToString(",", "\"", "\"")})"
            }
        }
}