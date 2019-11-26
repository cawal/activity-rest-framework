package br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.*
import java.io.File
import br.usp.ffclrp.dcm.lssb.activityrest.deploymentmodel.*
//import br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy.sanitized

class AadlToGalaxyToolWrapper {
    
    fun generate(activity : Activity, deployment : Deployment) : File {
        val toolWrapper = File.createTempFile("tool",".xml")
        val xmlWrapper = createXml(activity,deployment)
       
        toolWrapper.writeText(xmlWrapper,Charsets.UTF_8)

        return toolWrapper;
    }
    
    fun createXml(activity : Activity,deployment : Deployment) =
    """
|<?xml version="1.0" encoding="UTF-8"?>
|<tool
|	id="${activity.getName().sanitized()}"
|	name="${activity.getName()}"
|	version="${deployment.getService().getApiVersion()}"
|	profile="16.04"
|>
|	<description>${activity.getRemark()}</description>
|	<command
|		detect_errors="exit_code"
|	><![CDATA[
|	java -jar ${"$"}__tool_directory__/client.jar  
|       ${activity.getParameters()
            .map{it.getCallSyntax()}
    		.joinToString("\n")}
|       ${activity.getInputDatasets()
            .map{it.getCallSyntax()}
    		.joinToString("\n")}
|       ${activity.getOutputDatasets()
            .map{it.getCallSyntax()}
    		.joinToString("\n")}
|	]]></command>
|	<inputs>
|<!-- 		<section -->
|<!-- 			name="required" -->
|<!-- 			title="Required parameters" -->
|<!-- 			expanded="true" -->
|<!-- 		> -->
|       ${activity.getParameters()
            .map{it.getInputSectionDeclaration()}
    		.joinToString("\n")}
|       ${activity.getInputDatasets()
            .map{it.getInputSectionDeclaration()}
    		.joinToString("\n")}
|			<param
|				name="email"
|				type="text"
|				label="Email for authentication at DAVID">
|				<sanitizer>
|					<valid initial="string.ascii_letters,string.digits">
|						<add value="_" />
|						<add value="-" />
|						<add value="." />
|						<add value="@" />
|					</valid>
|				</sanitizer>
|			</param>
|			<param
|				name="columnName"
|				type="text"
|				label="Column with gene ids" />
|<!-- 		</section> -->
|<!-- 		<section -->
|<!-- 			name="optional" -->
|<!-- 			title="Optional parameters" -->
|<!-- 			expanded="true" -->
|<!-- 		> -->
|			<param
|				name="countCutoff"
|				type="integer"
|				value="2"
|				label="Count cutoff" />
|			<param
|				name="threshold"
|				type="float"
|				value="0.1"
|				label="Threshold" />
|			<param
|				name="categoriesInResult"
|				type="text"
|				area="true"
|				label="Comma separated categories for result" />
|			<param
|				name="geneIdentifierTypes"
|				type="text"
|				label="Gene identifiers type" />
|<!-- 		</section> -->
|	</inputs>
|	<outputs>
|           ${activity.getOutputDatasets()
    			.map {it.getOutputSectionDeclaration()}
    			.joinToString("\n")}
|	</outputs>
|
|	<tests>
|		<test>
|			<param
|				name="geneIdTable"
|				value="input.tsv"
|				/>
|			<param
|				name="email"
|				value="ricardocawal@usp.br"
|				/>
|			<param
|				name="columnName"
|				value="gene_ids"
|				/>
|			<param
|				name="countCutoff"
|				value="2"
|				/>
|			<param
|				name="threshold"
|				value="0.1"
|				/>
|			<param
|				name="categoriesInResult"
|				value="BBID,BIOCARTA,COG_ONTOLOGY,GOTERM_BP_FAT,GOTERM_CC_FAT,GOTERM_MF_FAT,INTERPRO,KEGG_PATHWAY,OMIM_DISEASE,PIR_SUPERFAMILY,SMART,SP_PIR_KEYWORDS,UP_SEQ_FEATURE"
|				/>
|			<param
|				name="geneIdentifierTypes"
|				value="AFFYMETRIX_3PRIME_IVT_ID"
|				/>
|			<output
|				name="output"
|				value="output.tsv"
|				/>
|		</test>
|	</tests>
|
|</tool>
    """.trimMargin();
    
 	fun Parameter.getCallSyntax() : String =
            """
 			""".trimMargin()
    
 	fun InputDataset.getCallSyntax() : String =
            """
 			""".trimMargin()
    
 	fun OutputDataset.getCallSyntax() : String =
            """
 			""".trimMargin()

    fun Parameter.getInputSectionDeclaration() : String =
            """
			|			<param
			|				name="${this.getName().sanitized()}"
			|				type="${this.getGalaxyType()}"
			|				value="${this.getDefaultValue().joinToString(",")}"
			|				label="${this.getRemark()}" />
    		""".trimMargin()
    
    fun InputDataset.getInputSectionDeclaration() : String =
            """
    		|			<param
			|				name="${this.getName().sanitized()}"
			|				type="data"
			|				format="${this.getGalaxyFormat()}"
			|				label="${this.getRemark()}" />
    		""".trimMargin()
    
    
    fun OutputDataset.getOutputSectionDeclaration() : String =
            """
			|		<data
			|				type="${this.getGalaxyType()}"
			|				format="${this.getGalaxyFormat()}""
			|			name="${this.getName().sanitized()}" />
    		""".trimMargin()
    
    fun Parameter.getGalaxyType() : String =
            when (this.getParameterType()) {
                ParameterType.BOOLEAN -> "boolean"
                ParameterType.INTEGER -> "integer"
                ParameterType.REAL -> "float"
                ParameterType.STRING -> "text"
                else -> "text"
            }
    
    fun Dataset.getGalaxyType() : String =
            "tabular"
    
    
    fun Dataset.getGalaxyFormat() : String =
            "tsv"
}
