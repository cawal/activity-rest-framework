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
@Command(name = "DAVID Chart Report", version = ["1.0"])
class AppCallable() : Callable<Int> {

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

    @Option(
        names = ["--count-cutoff"],
        paramLabel = "CUTOFF",
        arity = "1..1",
        description = [""]
    )
    var countCutoff: Int = 1

    @Option(
        names = ["--threshold"],
        paramLabel = "THRESHOLD",
        arity = "1..1",
        description = [""]
    )
    var threshold: Double = 2.0

    @Option(
        names = ["--categories-in-result"],
        paramLabel = "CATEGORIES",
        arity = "1..*",
        description = [""]
    )
    var categoriesInResult: List<String> = listOf(
        "BBID", "BIOCARTA", "COG_ONTOLOGY",
        "GOTERM_BP_FAT", "GOTERM_CC_FAT", "GOTERM_MF_FAT", "INTERPRO",
        "KEGG_PATHWAY", "OMIM_DISEASE", "PIR_SUPERFAMILY", "SMART",
        "SP_PIR_KEYWORDS", "UP_SEQ_FEATURE"
    )

    @Option(
        names = ["--gene-identifiers-type"],
        paramLabel = "GENE_IDENTIFIERS_TYPE",
        arity = "1..1",
        description = [""]
    )
    var geneIdentifiersType: String = "AFFYMETRIX_3PRIME_IVT_ID"

    @Option(
        names = ["--column-name"],
        paramLabel = "COLUMN",
        arity = "1..1",
        description = [""]
    )
    var columnName: String = "1"


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
