package br.usp.ffclrp.dcm.lssb.davidchartreport.jbpmclient;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
  
    @Test
    public void shouldAnswerWithTrue() {
    	String [] args = {
    			"--categories-in-result", 
					"BBID","BIOCARTA","COG_ONTOLOGY","GOTERM_BP_FAT",
					"GOTERM_CC_FAT","GOTERM_MF_FAT","INTERPRO",
					"KEGG_PATHWAY","OMIM_DISEASE","PIR_SUPERFAMILY",
					"SMART","SP_PIR_KEYWORDS","UP_SEQ_FEATURE",
    			"--count-cutoff", "2",
    			"--threshold", "0.1",
    			"--column-name", "gene_ids",
    			"/home/cawal/git/lssb/phd-tests-scratch-project/clients/jbpm-based/src/test/resources/input.tsv",
    			"output.tsv",
    			"ricardocawal@usp.br"};
        App.test(args);
      
        assertTrue(true);
    }
}
