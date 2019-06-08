package br.usp.ffclrp.dcm.lssb.activityrest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	InputStream aadlSource = new FileInputStream(new File(args[0]));
    	OutputStream openapiTarget = new FileOutputStream(new File(args[1]));
    	
    	JsonObject jsonOb = TransformationService.aadl2OpenAPI(aadlSource, openapiTarget, null);

    	FileWriter writer = new FileWriter(new File(args[1]));
    
    	
    	Gson gson = new Gson();
    	
    	gson.toJson(jsonOb,writer);
    	
        System.out.println( "Hello World!" );
    }
}
