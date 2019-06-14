package br.usp.ffclrp.dcm.lssb.activityrest;

import java.io.File;
import java.io.FileWriter;

import org.eclipse.emf.common.util.URI;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import edu.uoc.som.openapi.API;
import edu.uoc.som.openapi.Root;
import edu.uoc.som.openapi.io.ExporterBuilder;
import edu.uoc.som.openapi.io.OpenAPIExporter;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws Exception
    {
//    	InputStream aadlSource = new FileInputStream(new File(args[0]));
//    	OutputStream openapiTarget = new FileOutputStream(new File(args[1]));
    	URI resourceUri =  URI.createURI(args[0]);
//    	Activity activity = ModelsService.retrieveActivityFromXmi(resourceUri);
    	//API api = ModelsService.retrieveOpenApiFromXmi(resourceUri);
    	Root root = ModelsService.retrieveOpenApiRootFromXmi(resourceUri);
//    	root.getApi().getDefinitions().forEach(d -> System.out.println(d.getRef()));
    	//System.out.println(api);
    	OpenAPIExporter exporter = ExporterBuilder.create();
		JsonObject jsonOb = exporter.toJson(root.getApi());
		System.out.println(jsonOb);
    	FileWriter writer = new FileWriter(new File(args[1]));
    	Gson gson = new Gson();
    	gson.toJson(jsonOb,writer);
    	writer.close();
        //System.out.println( "Hello World!" );
    }
}
