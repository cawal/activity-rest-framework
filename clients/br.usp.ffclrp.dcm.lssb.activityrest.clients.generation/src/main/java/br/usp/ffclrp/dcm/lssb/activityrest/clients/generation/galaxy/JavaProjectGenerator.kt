package br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy

import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.Deployment
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity
import org.apache.maven.cli.MavenCli
import java.io.File
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Parameter
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ParameterType

class JavaProjectGenerator {

    val archetypeGroup = "br.usp.ffclrp.dcm.lssb.activityrest"
    val archetypeId = "galaxy-client-base-archetype"
    val archetypeVersion = "1.0-SNAPSHOT"
    
    val bpmnFile = "actvity-jbpm-bpmn2"

    fun generate(activity: Activity, deployment: Deployment): File {
       
        val projectRoot = generateBaseMavenProject(activity,deployment)
        
        val cliFile = getCliFile(activity,deployment)
       
        cliFile.renameTo(File(projectRoot,"src/main/java/app-activity-specific.kt"))
        
       return projectRoot
        
    }

    fun generateBaseMavenProject(activity : Activity, deployment : Deployment)
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
    
    fun getCliFile(activity : Activity,
                                 deployment : Deployment) : File {
        val tempCliFile = File.createTempFile("app-activity-specific",".kt")
        
        tempCliFile.writeText(getCliFileContents(activity,deployment))
        
        return  tempCliFile
    }

    
    fun getCliFileContents(activity : Activity, deployment : Deployment) =
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
    
        ${createParameters(activity,deployment)}
    
        ${createOptions(activity,deployment)}
 
    
    
    
        override fun call(): Int {
    
            return execute(this)
    
        }
    
    
    }
    
    /**
     * Activity-specific
     */
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
            "email" to (config.email ?: ""),
            "countCutoff" to config.countCutoff,
            "threshold" to config.threshold,
            "categoriesInResult" to config.categoriesInResult,
            "geneIdentifierType" to config.geneIdentifiersType,
            "columnName" to config.columnName
        )
    
        val inputDatasets = mapOf<String, List<DatasetItem>>(
            "geneIdTable" to listOfNotNull(config.geneIdTable)
                .map { datasetItemFrom(it) }
        )
    
        val outputDatasets = mapOf<String, List<DatasetItem>>(
            "output" to listOfNotNull(config.output)
                .map { datasetItemFrom(it) }
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
    """.trimIndent()()();
    
    fun createParameters(activity : Activity, deployment : Deployment) =
    """
        @Parameters(
            parameterLabel = "INPUT",
            index = "0",
            arity = "1..1",
            description = [""]
        )
        var geneIdTable: File? = null // 'text/tsv' [1,1];
    
        @Parameters(
            parameterLabel = "OUTPUT",
            index = "1",
            arity = "1..1",
            description = [""]
        )
        var output: File? = null // 'text/tsv' [1,1];
    
        @Parameters(
            parameterLabel = "EMAIL",
            index = "2",
            arity = "1..1",
            description = [""]
        )
        var email: String? = null
    """.trimIndent()()()
    
    val Parameter.optionText get() =
    """
    	@Option(
    		names = ["${getName()}"],
    		paramLabel = "${getName().toUpperCase()}",
    		arity = "${getMinimumCardinality()}..${getMaximumCardinality()}",
    		description = ["${getRemark()}"]
    	)
    	var ${getName()} : ${getParameterType().javaType} = ${formatedDefaultValue}
    """
    
    val ParameterType.javaType get() : String {
        return when (this) {
            ParameterType.BOOLEAN -> "Boolean"
            ParameterType.INTEGER -> "Int"
            ParameterType.REAL -> "Double"
            ParameterType.STRING -> "String"
        }
    }
    
    val Parameter.formatedDefaultValue get() : String {
        return when (this.getMaximumCardinality().toInt()) {
        	1 -> this.getDefaultValue().first()
            else -> "listOf(${this.getDefaultValue()
            		.joinToString(",","\"","\"")})"
        }
    }
    
    fun createOptions(activity : Activity, deployment : Deployment) =
    """
    ${activity.getParameters()
            .filter { it.getDefaultValue().size > 0 }
    		.map {it.optionText}
    } """.trimIndent()

//    |    @Option(
//    |        names = ["--count-cutoff"],
//    |        paramLabel = "CUTOFF",
//    |        arity = "1..1",
//    |        description = [""]
//    |    )
//    |    var countCutoff: Int = 1
//    
//    |    @Option(
//    |        names = ["--threshold"],
//    |        paramLabel = "THRESHOLD",
//    |        arity = "1..1",
//    |        description = [""]
//    |    )
//    |    var threshold: Double = 2.0
//    
//    |    @Option(
//    |        names = ["--categories-in-result"],
//    |        paramLabel = "CATEGORIES",
//    |        arity = "1..*",
//    |        description = [""]
//    |    )
//    |    var categoriesInResult: List<String> = listOf(
//    |        "BBID", "BIOCARTA", "COG_ONTOLOGY",
//    |        "GOTERM_BP_FAT", "GOTERM_CC_FAT", "GOTERM_MF_FAT", "INTERPRO",
//    |        "KEGG_PATHWAY", "OMIM_DISEASE", "PIR_SUPERFAMILY", "SMART",
//    |        "SP_PIR_KEYWORDS", "UP_SEQ_FEATURE"
//    |    )
//    
//    |    @Option(
//    |        names = ["--gene-identifiers-type"],
//    |        paramLabel = "GENE_IDENTIFIERS_TYPE",
//    |        arity = "1..1",
//    |        description = [""]
//    |    )
//    |    var geneIdentifiersType: String = "AFFYMETRIX_3PRIME_IVT_ID"
//    
//    |    @Option(
//    |        names = ["--column-name"],
//    |        paramLabel = "COLUMN",
//    |        arity = "1..1",
//    |        description = [""]
//    |    )
//    |    var columnName: String = "1"
}