<?xml version="1.0"?>
<!-- A guide: https://www.vogella.com/tutorials/XSLT/article.html -->
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

    <xsl:output method="xml" />

    <!-- Copy everything -->
    <xsl:template match="node()">
        <xsl:copy>
            <xsl:copy-of select="@*" />
            <xsl:apply-templates />
        </xsl:copy>
    </xsl:template>

</xsl:stylesheet>

