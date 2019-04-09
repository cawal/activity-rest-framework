#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import java.io.IOException;
import javax.ws.rs.Path;


/**
 * Root resource of the API.
 * Provides the URI path segments for its subresources.
 * 
 * @author cawal
 *
 */
@Path("/")
public class RootResource  extends br.usp.ffclrp.dcm.lssb.activityrest.rest.endpoints.RootResource {
	
	static final String ACTIVITY_DESCRIPTION = "activity.aadl";
		
	public RootResource() throws IOException {
		super();		
		initializeEcoreResources(this.getClass().getResourceAsStream(ACTIVITY_DESCRIPTION));
		initializeFileSystemDaos(new FileSystemDaoPropertiesImpl());
		
		System.out.println(this.getClass().toString());
	}

}
