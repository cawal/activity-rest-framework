package tests.transformations

import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.TestInstance.Lifecycle
import br.usp.ffclrp.dcm.lssb.activityrest.util.ModelsService
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*;
import br.usp.ffclrp.dcm.lssb.activityrest.wsdl.DeploymentModel
import br.usp.ffclrp.dcm.lssb.activityrest.wsdl.toXsd
import java.net.InetAddress
import javax.xml.parsers.*
import javax.xml.parsers.DocumentBuilder
import org.xml.sax.ErrorHandler
import org.xml.sax.SAXParseException
import java.io.InputStream
import com.sun.xml.internal.messaging.saaj.util.ByteInputStream
import org.eclipse.xtext.util.StringInputStream


class SimpleErrorHandler() : ErrorHandler {
    override fun warning(e : SAXParseException) {
        println(e.message);
    }

    override fun error(e : SAXParseException) {
        println(e.message);
    }

    override fun fatalError(e : SAXParseException) {
        println(e.message);
    }
}


fun String.toInputStream() : InputStream =
	StringInputStream(this)

@TestInstance(Lifecycle.PER_CLASS)
class ActivityToXsdTests {
	val activityModel  = ModelsService.retrieveAADLModel(
			this.javaClass.getResourceAsStream("./activity.aadl")
		)
	val deploymentModel = DeploymentModel(
			    protocol = "http",
			    host = InetAddress.getByName("localhost"),
			    port = 8080,
			    basePath = activityModel.getName()
		)
		
	
	@Test
	fun `Valid XML`() {
		val xmlString = toXsd(activityModel,deploymentModel)
		
		val factory = DocumentBuilderFactory.newInstance();
		factory.setValidating(false);
		//factory.setNamespaceAware(true);
		val builder = factory.newDocumentBuilder();

		builder.setErrorHandler(SimpleErrorHandler());    
		// the "parse" method also validates XML, will throw an exception if misformatted
		val document = builder.parse(xmlString.toInputStream());
		assertNotNull(document,"XML document parse error!")
	}

}
