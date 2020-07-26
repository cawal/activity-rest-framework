package br.usp.ffclrp.dcm.lssb.activityrest.domain

import org.junit.Test
import org.junit.Assert.*
import kotlin.test.assertEquals
import br.usp.ffclrp.dcm.lssb.activityrest.domain.ActivityInstance
import br.usp.ffclrp.dcm.lssb.activityrest.domain.ActivityInstanceState
import br.usp.ffclrp.dcm.lssb.activityrest.client.ActivityRestClient
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionFactory
import org.junit.Ignore
import java.net.URI
import java.io.File
import java.math.BigInteger

class ActivityRestClientTest {

    @Test
    fun `Creates new activities`() {
        val activity = ActivityInstance();
        val baseUrl = URI.create(
//                "http://kode.ffclrp.usp.br:8081/david-chart-report-by-dataset"
                "http://localhost:8080/david-chart-report-by-dataset"
        )
        val description = AnalysisActivityDescriptionFactory.eINSTANCE.createActivity()
        val inputDataset = AnalysisActivityDescriptionFactory.eINSTANCE.createInputDataset()
        
        inputDataset.setName("gene-id-table")
        inputDataset.setMaximumCardinality(BigInteger.valueOf(1))
        description.getInputDatasets().add(inputDataset)
        
        val outputDataset = AnalysisActivityDescriptionFactory.eINSTANCE.createOutputDataset()
        outputDataset.setName("output");
        outputDataset.setMaximumCardinality(BigInteger.valueOf(1))
        description.getOutputDatasets().add(outputDataset)
        
        
        val client = ActivityRestClient(baseUrl)

        activity.parameters =
                mapOf(
                        "categories-in-result" to listOf(
                                "BBID",
                                "BIOCARTA",
                                "COG_ONTOLOGY",
                                "GOTERM_BP_FAT",
                                "GOTERM_CC_FAT",
                                "GOTERM_MF_FAT",
                                "INTERPRO",
                                "KEGG_PATHWAY",
                                "OMIM_DISEASE",
                                "PIR_SUPERFAMILY",
                                "SMART",
                                "SP_PIR_KEYWORDS",
                                "UP_SEQ_FEATURE"
                        ),
                        "column-name" to "gene_ids",
                        "count-cutoff" to 2,
                        "email" to "ricardocawal@usp.br",
                        "gene-identifier-type" to "AFFYMETRIX_3PRIME_IVT_ID",
                        "threshold" to 2
                )

        val geneIdTablePath = "./src/test/resources/input.tsv"
        val geneIdTableFile = File(geneIdTablePath)
        val geneIdTable = datasetItemFrom( geneIdTableFile)
        
        activity.inputDatasets = mapOf(
                "gene-id-table" to listOf(geneIdTable)
        )
        
        client.execute(activity);

        assertEquals(ActivityInstanceState.SUCCEEDED, activity.state)
    }

    @Test
    fun `Creates new activities SSE`() {
        val activity = ActivityInstance();
        val baseUrl = URI.create(
//                "http://kode.ffclrp.usp.br:8081/david-chart-report-by-dataset"
            "http://localhost:8080/david-chart-report-by-dataset"
        )
        val description = AnalysisActivityDescriptionFactory.eINSTANCE.createActivity()
        val inputDataset = AnalysisActivityDescriptionFactory.eINSTANCE.createInputDataset()

        inputDataset.setName("gene-id-table")
        inputDataset.setMaximumCardinality(BigInteger.valueOf(1))
        description.getInputDatasets().add(inputDataset)

        val outputDataset = AnalysisActivityDescriptionFactory.eINSTANCE.createOutputDataset()
        outputDataset.setName("output");
        outputDataset.setMaximumCardinality(BigInteger.valueOf(1))
        description.getOutputDatasets().add(outputDataset)


        val client = ActivityRestClient(baseUrl)

        activity.parameters =
            mapOf(
                "categories-in-result" to listOf(
                    "BBID",
                    "BIOCARTA",
                    "COG_ONTOLOGY",
                    "GOTERM_BP_FAT",
                    "GOTERM_CC_FAT",
                    "GOTERM_MF_FAT",
                    "INTERPRO",
                    "KEGG_PATHWAY",
                    "OMIM_DISEASE",
                    "PIR_SUPERFAMILY",
                    "SMART",
                    "SP_PIR_KEYWORDS",
                    "UP_SEQ_FEATURE"
                ),
                "column-name" to "gene_ids",
                "count-cutoff" to 2,
                "email" to "ricardocawal@usp.br",
                "gene-identifier-type" to "AFFYMETRIX_3PRIME_IVT_ID",
                "threshold" to 2
            )

        val geneIdTablePath = "./src/test/resources/input.tsv"
        val geneIdTableFile = File(geneIdTablePath)
        val geneIdTable = datasetItemFrom( geneIdTableFile)

        activity.inputDatasets = mapOf(
            "gene-id-table" to listOf(geneIdTable)
        )

        client.execute(activity,true);

        assertEquals(ActivityInstanceState.SUCCEEDED, activity.state)
    }

}
