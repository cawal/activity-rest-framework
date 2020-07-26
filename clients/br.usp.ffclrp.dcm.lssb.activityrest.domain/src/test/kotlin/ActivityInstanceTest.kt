package br.usp.ffclrp.dcm.lssb.activityrest.domain

import org.junit.Test
import org.junit.Assert.*
import kotlin.test.assertEquals
import br.usp.ffclrp.dcm.lssb.activityrest.domain.ActivityInstance
import br.usp.ffclrp.dcm.lssb.activityrest.domain.ActivityInstanceState

class ActivityiInstanceTest {

    @Test
    fun `Basic creation`(){
        val activity = ActivityInstance();
        
        assertEquals(ActivityInstanceState.CREATED,activity.state)
    }
    
}
