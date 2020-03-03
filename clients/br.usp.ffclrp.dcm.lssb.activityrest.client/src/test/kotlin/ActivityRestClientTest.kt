package br.usp.ffclrp.dcm.lssb.activityrest.domain

import org.junit.Test
import org.junit.Assert.*
import kotlin.test.assertEquals
import br.usp.ffclrp.dcm.lssb.activityrest.domain.ActivityInstance
import br.usp.ffclrp.dcm.lssb.activityrest.domain.ActivityInstanceState
import br.usp.ffclrp.dcm.lssb.activityrest.client.ActivityRestClient
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.AnalysisActivityDescriptionFactory
import java.net.URI

class ActivityRestClientTest {

    @Test
    fun `Creates new activities`(){
        val activity = ActivityInstance();
        val baseUrl = URI.create(
                "http://kode.ffclrp.usp.br:8081/david-chart-report-by-dataset"
                )
        val description =AnalysisActivityDescriptionFactory.eINSTANCE.createActivity()
        
        val client = ActivityRestClient(baseUrl, description)
        
        client.connectToService()
        print(client.createInstanceOnService(activity).id)
        
        
        assertEquals(ActivityInstanceState.CREATED,activity.state)
    }
    
    
    
}
