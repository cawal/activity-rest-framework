<?xml version="1.0"?>
<!-- A guide: https://www.vogella.com/tutorials/XSLT/article.html -->

<xsl:stylesheet
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:bpmn2="http://www.omg.org/spec/BPMN/20100524/MODEL"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:bpmndi="http://www.omg.org/spec/BPMN/20100524/DI" 
	xmlns:dc="http://www.omg.org/spec/DD/20100524/DC" 
	xmlns:di="http://www.omg.org/spec/DD/20100524/DI" 
	xmlns:java="http://www.java.com/javaTypes" 
	xmlns:tns="http://www.jboss.org/drools" 
	xmlns="http://www.jboss.org/drools" 
	xsi:schemaLocation="http://www.omg.org/spec/BPMN/20100524/MODEL BPMN20.xsd http://www.jboss.org/drools drools.xsd http://www.bpsim.org/schemas/1.0 bpsim.xsd" 
	version="1.0"
>
<!-- 	xmlns:bpmn2="http://www.omg.org/spec/BPMN/20100524/MODEL"  -->
<!-- 	xmlns:tns="http://www.jboss.org/drools" -->
	<xsl:variable
		name="allowedChars"
		select="'abcdefghijklmnopqrstuvwxyz___'" />
	<xsl:variable
		name="deniedChars"
		select="'ABCDEFGHIJKLMNOPQRSTUVWXYZ-: '" />
	<xsl:variable
		name="processPackage"
		select="'defaultPackage'"
	></xsl:variable>


	<xsl:output
		method="xml"
		indent="true" />
		
    <!-- Copy everything -->
	<xsl:template match="node()">
		<xsl:copy> <!-- copy the node -->
			<xsl:copy-of select="@*" /> <!-- Copy the attributes -->
			<xsl:apply-templates />
		</xsl:copy>
	</xsl:template>

	<xsl:template match="bpmn2:definitions">
		<bpmn2:definitions
		xmlns:xs="http://www.w3.org/2001/XMLSchema"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:bpmn2="http://www.omg.org/spec/BPMN/20100524/MODEL"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:bpmndi="http://www.omg.org/spec/BPMN/20100524/DI" 
	xmlns:dc="http://www.omg.org/spec/DD/20100524/DC" 
	xmlns:di="http://www.omg.org/spec/DD/20100524/DI" 
	xmlns:java="http://www.java.com/javaTypes" 
	xmlns:tns="http://www.jboss.org/drools" 
	xmlns="http://www.jboss.org/drools" 
	xsi:schemaLocation="http://www.omg.org/spec/BPMN/20100524/MODEL BPMN20.xsd http://www.jboss.org/drools drools.xsd http://www.bpsim.org/schemas/1.0 bpsim.xsd" 
	exporter="org.eclipse.bpmn2.modeler.core" 
	exporterVersion="1.5.1.Final-v20190425-2005-B1" 
	expressionLanguage="http://www.mvel.org/2.0" 
	targetNamespace="http://www.jboss.org/drools" 
	typeLanguage="http://www.java.com/javaTypes"
			>
			<xsl:apply-templates></xsl:apply-templates>
		</bpmn2:definitions>
	</xsl:template>
	
<!-- 			<xsl:attribute name="xmlns:bpmn2">http//www.omg.org/spec/BPMN/20100524/MODEL</xsl:attribute> -->
<!-- 			<xsl:attribute name="xmlns:bpmndi">http://www.omg.org/spec/BPMN/20100524/DI</xsl:attribute> -->
<!-- 			<xsl:attribute name="xmlns:dc">http://ww.omg.org/spec/DD/20100524/DC</xsl:attribute> -->
<!-- 			<xsl:attribute name="xmlns:di">http://ww.omg.org/spec/DD/20100524/DI</xsl:attribute> -->
<!-- 			<xsl:attribute name="xmlns:java">http:/www.java.com/javaTypes</xsl:attribute> -->
<!-- 			<xsl:attribute name="xmlns:tns">http:/www.jboss.org/drools</xsl:attribute> -->
<!-- 			<xsl:attribute name="xmlns">http://wwwjboss.org/drools</xsl:attribute> -->
<!-- 			<xsl:attribute name="xsi:schemaLocation">http://www.omg.org/spec/BPMN/20100524/MODEL BPMN20.xsd http://www.jboss.org/drools drools.xsd http://www.bpsim.org/schemas/1.0 bpsim.xsd _id</xsl:attribute> -->
<!-- 			<xsl:attribute name="expressionLanguage">http://www.mvel.org/2.0</xsl:attribute> -->
	
<!-- 	<xsl:template match="@itemSubjectRef"> -->
<!-- 	    <xsl:attribute name="{name(.)}"> -->
<!--             <xsl:value-of select="substring-after(.,'#')"/> -->
<!--         </xsl:attribute> -->
<!-- 	</xsl:template> -->
	
	<xsl:template match="bpmn2:dataObject">
<xsl:copy>

            <xsl:copy-of select="@*" /> <!-- Copy the attributes -->
        <xsl:attribute name="itemSubjectRef">
            <xsl:value-of select="concat('#',substring-after(@itemSubjectRef,'#'))"/>
        </xsl:attribute>
</xsl:copy>
    </xsl:template> 
	
	<!-- ITEM DEFINITIONS -->
	<xsl:template match="bpmn2:itemDefinition[@id='xssdouble']">
		<bpmn2:itemDefinition structureRef="java.lang.Double">
			<xsl:copy-of select="@*" />
		</bpmn2:itemDefinition>
	</xsl:template>

	<xsl:template match="bpmn2:itemDefinition[@id='xssinteger']">
		<bpmn2:itemDefinition structureRef="java.lang.Integer">
			<xsl:copy-of select="@*" />
		</bpmn2:itemDefinition>
	</xsl:template>

	<xsl:template match="bpmn2:itemDefinition[@id='xssstring']">
		<bpmn2:itemDefinition structureRef="java.lang.String">
			<xsl:copy-of select="@*" />
		</bpmn2:itemDefinition>
	</xsl:template>

	<xsl:template match="bpmn2:itemDefinition[@id='xssboolean']">
		<bpmn2:itemDefinition structureRef="java.lang.Boolean">
			<xsl:copy-of select="@*" />
		</bpmn2:itemDefinition>
	</xsl:template>

	<xsl:template match="bpmn2:itemDefinition[@id='xssbase64Binary']">
		<bpmn2:itemDefinition structureRef="java.io.File">
			<xsl:copy-of select="@*" />
		</bpmn2:itemDefinition>
	</xsl:template>

	<xsl:template match="bpmn2:itemDefinition[@id='xssanyURI']">
		<bpmn2:itemDefinition structureRef="java.util.URI">
			<xsl:copy-of select="@*" />
		</bpmn2:itemDefinition>
	</xsl:template>

	<xsl:template match="bpmn2:itemDefinition[@isCollection='true']">
		<bpmn2:itemDefinition structureRef="java.util.List">
			<xsl:copy-of select="@*" />
<!-- 			<xsl:attribute name="id">{translate(@id,)}</xsl:attribute> -->
		</bpmn2:itemDefinition>
	</xsl:template>


	<xsl:template match="bpmn2:process">
		<bpmn2:process tns:packageName="{$processPackage}">
			<xsl:copy-of select="@*" />
			<xsl:apply-templates></xsl:apply-templates>
		</bpmn2:process>
	</xsl:template>

	<xsl:template match="bpmn2:startEvent | bpmn2:endEvent">
		<xsl:copy>
			<xsl:copy-of select="@*"></xsl:copy-of>

			<bpmn2:extensionElements>
				<tns:metaData name="elementname">
					<tns:metaValue>
						<xsl:value-of select="@name" />
					</tns:metaValue>
				</tns:metaData>
			</bpmn2:extensionElements>

			<xsl:apply-templates></xsl:apply-templates>
		</xsl:copy>
	</xsl:template>

	<xsl:template match="bpmn2:task">
		<bpmn2:task
			tns:taskName="{translate(@name,$deniedChars,$allowedChars)}"
			tns:displayName="{@name}"
			tns:icon="task.png"
		>
			<xsl:copy-of select="@*" />
			<bpmn2:extensionElements>
				<tns:metaData name="elementname">
					<tns:metaValue>
						<xsl:value-of select="@name" />
					</tns:metaValue>
				</tns:metaData>
			</bpmn2:extensionElements>
			<xsl:apply-templates />
		</bpmn2:task>
	</xsl:template>

<!-- 	<xsl:template match="bpmn2:conditionExpression[@id='processing-continues-flow-condition']"> -->
<!-- 		<xsl:message> -->
<!-- 			processing-continues-flow-condition -->
<!-- 		</xsl:message> -->
<!-- 		<bpmn2:conditionExpression -->
<!-- 			bpmn2:language="http://www.java.com/java" -->
<!-- 			bpmn2:text="return processingState == &quot;RUNNING&quot;;" -->
<!-- 		> -->
<!-- 			<xsl:copy-of select="@*" /> -->
<!-- 			<xsl:apply-templates></xsl:apply-templates> -->
<!-- 		</bpmn2:conditionExpression> -->
<!-- 	</xsl:template> -->
	
<!-- 	<xsl:template match="bpmn2:conditionExpression[@id='processing-failed-flow-condition']"> -->
<!-- 		<xsl:message> -->
<!-- 			processing-failed-flow-condition -->
<!-- 		</xsl:message> -->
<!-- 		<bpmn2:conditionExpression -->
<!-- 			bpmn2:language="http://www.java.com/java" -->
<!-- 			bpmn2:text="return processingState == &quot;FAILED&quot;;" -->
<!-- 		> -->
<!-- 			<xsl:copy-of select="@*" /> -->
<!-- 			<xsl:apply-templates></xsl:apply-templates> -->
<!-- 		</bpmn2:conditionExpression> -->
<!-- 	</xsl:template> -->

	
<!-- 	<xsl:template match="bpmn2:conditionExpression[@id='processing-succeeded-flow-condition']"> -->
<!-- 		<xsl:message> -->
<!-- 			processing-succeeded-flow-condition -->
<!-- 		</xsl:message> -->
<!-- 		<bpmn2:conditionExpression -->
<!-- 			bpmn2:language="http://www.java.com/java" -->
<!-- 			bpmn2:text="return processingState == &quot;SUCCEEDED&quot;;" -->
<!-- 		> -->
<!-- 			<xsl:copy-of select="@*" /> -->
<!-- 			<xsl:apply-templates></xsl:apply-templates> -->
<!-- 		</bpmn2:conditionExpression> -->
<!-- 	</xsl:template> -->


</xsl:stylesheet>

