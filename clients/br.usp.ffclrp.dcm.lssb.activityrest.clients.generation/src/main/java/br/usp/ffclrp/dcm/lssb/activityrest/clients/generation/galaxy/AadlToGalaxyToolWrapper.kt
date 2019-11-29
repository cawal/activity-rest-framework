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
|       ${activity.getParameters()
            .map{it.getInputSectionDeclaration()}
    		.joinToString("\n")}
|
|       ${activity.getInputDatasets()
            .map{it.getInputSectionDeclaration()}
    		.joinToString("\n")}
|	</inputs>
|
|	<outputs>
|           ${activity.getOutputDatasets()
    			.map {it.getOutputSectionDeclaration()}
    			.joinToString("\n")}
|	</outputs>
|
|	<tests>
|       <!-- Include your tests here -->
|	</tests>
|
|</tool>
    """.trimMargin();
    
//       --count-cutoff ${countCutoff}
//       --categories-in-result
//        #for $cat in $categoriesInResult.split(','):
//            '${cat}'
//        #end for
//       --threshold ${threshold}
//       --column-name ${columnName}
//       '${geneIdTable}'
//       '${output}'
//       '${email}'
 
 	fun Parameter.getCallSyntax() : String =
            if (this.getMaximumCardinality().toInt() == 1)
				""" --${this.getName()} ${'$'}{${this.getName().sanitized()}}
				""".trimMargin()
            else 
				""" --${this.getName()}
					 #for ${'$'}i, ${'$'}value in enumerate(${'$'}${this.getName().sanitized()}V)
						'${'$'}value'
					#end for
				""".trimMargin()
    
 	fun InputDataset.getCallSyntax() : String =
            if (this.getMaximumCardinality().toInt() == 1)
				""" --${this.getName()} ${'$'}{${this.getName().sanitized()}}
				""".trimMargin()
            else 
				""" --${this.getName()}
					 #for ${'$'}i, ${'$'}value in enumerate(${'$'}${this.getName().sanitized()}V)
						'${'$'}value'
					#end for
				""".trimMargin()
    
 	fun OutputDataset.getCallSyntax() : String =
            if (this.getMaximumCardinality().toInt() == 1)
				""" --${this.getName()} ${'$'}{${this.getName().sanitized()}}
				""".trimMargin()
            else 
				""" --${this.getName()}
					 #for ${'$'}i, ${'$'}value in enumerate(${'$'}${this.getName().sanitized()}V)
						'${'$'}value'
					#end for
				""".trimMargin()

    fun Parameter.getInputSectionDeclaration() : String =
            if(this.getMaximumCardinality().toInt() == 1)
            """
			|			<param
			|				name="${this.getName().sanitized()}"
			|				type="${this.getGalaxyType()}"
			|				value="${this.getDefaultValue().joinToString(",")}"
			|				label="${this.getRemark()}">
    		|               ${if (this.getParameterType() == ParameterType.STRING)
                				includeSanitizerConfig()
                			 else ""}
			|            </param>
    		""".trimMargin()
			else
            """
			|        <repeat name="${this.getName().sanitized()}" title="${this.getName()}">
			|			<param
			|				name="value"
			|				type="${this.getGalaxyType()}"
			|				value="${this.getDefaultValue().joinToString(",")}"
			|				label="${this.getRemark()}">

    		|               ${if (this.getParameterType() == ParameterType.STRING)
                				includeSanitizerConfig()
                			 else ""}
			|            </param>
			|        </repeat>
			""".trimMargin()
    
    fun includeSanitizerConfig() : String =
            """
			|				<sanitizer>
			|					<valid initial="string.ascii_letters,string.digits">
			|						<add value="_" />
			|						<add value="-" />
			|						<add value="." />
			|						<add value="@" />
			|					</valid>
			|				</sanitizer>
			""".trimMargin()
 
    fun InputDataset.getInputSectionDeclaration() : String =
            if(this.getMaximumCardinality().toInt() == 1)
            """
			|			<param
			|				name="${this.getName().sanitized()}"
			|				type="data"
			|				format="${this.getGalaxyFormat()}">
			|            </param>
    		""".trimMargin()
			else
            """
			|        <repeat name="${this.getName().sanitized()}" title="${this.getName()}">
			|			<param
			|				name="value"
			|				type="data"
			|				format="${this.getGalaxyFormat()}">
			|            </param>
			|        </repeat>
			""".trimMargin()
    
    
    fun OutputDataset.getOutputSectionDeclaration() : String =
            """
			|		<data
			|				type="${this.getGalaxyType()}"
			|				format="${this.getGalaxyFormat()}"
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
