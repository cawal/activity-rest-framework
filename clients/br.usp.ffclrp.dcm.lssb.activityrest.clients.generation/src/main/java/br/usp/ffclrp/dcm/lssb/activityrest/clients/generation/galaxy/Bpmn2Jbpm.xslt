<?xml version="1.0"?>
<!-- A guide: https://www.vogella.com/tutorials/XSLT/article.html -->
<!-- <xsl:stylesheet
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:bpmn2="http://www.omg.org/spec/BPMN/20100524/MODEL"
    xmlns:bpmndi="http://www.omg.org/spec/BPMN/20100524/DI"
    xmlns:dc="http://www.omg.org/spec/DD/20100524/DC"
    xmlns:di="http://www.omg.org/spec/DD/20100524/DI" 
    xmlns:java="http://www.java.com/javaTypes" 
    xmlns:tns="http://www.jboss.org/drools" 
    xmlns="http://www.jboss.org/drools" 
	version="1.0"
>
 -->
<!--     xsi:schemaLocation="http://www.omg.org/spec/BPMN/20100524/MODEL BPMN20.xsd http://www.jboss.org/drools drools.xsd http://www.bpsim.org/schemas/1.0 bpsim.xsd"  -->
<!--     id="Definition"  -->
<!--     exporter="org.eclipse.bpmn2.modeler.core"  -->
<!--     exporterVersion="1.5.1.Final-v20190425-2005-B1"  -->
<!--     expressionLanguage="http://www.mvel.org/2.0"  -->
<!--     targetNamespace="http://www.jboss.org/drools"  -->
<!--     typeLanguage="http://www.java.com/javaTypes" -->
<xsl:stylesheet
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:bpmn2="http://www.omg.org/spec/BPMN/20100524/MODEL"
	xmlns:tns="http://www.jboss.org/drools"
	version="2.0"
>
<xsl:variable name="allowedChars" select="'abcdefghijklmnopqrstuvwxyz-'" />
<xsl:variable name="deniedChars" select="'ABCDEFGHIJKLMNOPQRSTUVWXYZ '" />


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
	
	<!-- ITEM DEFINITIONS -->
	<xsl:template match="bpmn2:itemDefinition[@id='xs:double']">
		<bpmn2:itemDefinition structureRef="java.lang.Double">
			<xsl:copy-of select="@*" />
		</bpmn2:itemDefinition>
	</xsl:template>

	<xsl:template match="bpmn2:itemDefinition[@id='xs:integer']">
		<bpmn2:itemDefinition structureRef="java.lang.Integer" >
			<xsl:copy-of select="@*" />
		</bpmn2:itemDefinition>
	</xsl:template>

	<xsl:template match="bpmn2:itemDefinition[@id='xs:string']">
		<bpmn2:itemDefinition structureRef="java.lang.String" >
			<xsl:copy-of select="@*" />
		</bpmn2:itemDefinition>
	</xsl:template>

	<xsl:template match="bpmn2:itemDefinition[@id='xs:boolean']">
		<bpmn2:itemDefinition structureRef="java.lang.Boolean" >
			<xsl:copy-of select="@*" />
		</bpmn2:itemDefinition>
	</xsl:template>

	<xsl:template match="bpmn2:itemDefinition[@id='xs:base64Binary']">
		<bpmn2:itemDefinition structureRef="java.io.File" >
			<xsl:copy-of select="@*" />
		</bpmn2:itemDefinition>
	</xsl:template>

	<xsl:template match="bpmn2:itemDefinition[@id='xs:anyURI']">
		<bpmn2:itemDefinition structureRef="java.util.URI" >
			<xsl:copy-of select="@*" />
		</bpmn2:itemDefinition>
	</xsl:template>



	<xsl:template match="bpmn2:task">
		<xsl:message>
			bpmn2:task
		</xsl:message>
		<bpmn2:task tns:taskName="{translate(@name,$deniedChars,$allowedChars)}" tns:displayName="{@name}" tns:icon="task.png">
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


</xsl:stylesheet>

