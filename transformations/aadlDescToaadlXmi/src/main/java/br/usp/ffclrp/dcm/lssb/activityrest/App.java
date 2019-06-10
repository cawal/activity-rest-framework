package br.usp.ffclrp.dcm.lssb.activityrest;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	InputStream aadlSource = new FileInputStream(new File(args[0]));
    	//OutputStream openapiTarget = new FileOutputStream(new File(args[1]));
    
    	Activity aadlModel = ModelsService.retrieveAADLModel(aadlSource);
    	ModelsService.writeAADLModelToXmi(aadlModel,args[1]);
    }
}
