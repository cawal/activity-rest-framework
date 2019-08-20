package br.usp.ffclrp.dcm.lssb.activityrest.usecases

import br.usp.ffclrp.dcm.lssb.activityrest.domain.ActivityInstance
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity
import java.util.UUID
import br.usp.ffclrp.dcm.lssb.activityrest.domain.InstanceState

class CreateNewActivityInstance {
	fun from(activity : Activity,
			 withId :String = UUID.randomUUID().toString())
			: ActivityInstance {
		
		val parameters = activity.parameters
			.map {it.name to it.defaultValue}
		    .toMap()
				
		return ActivityInstance(withId,InstanceState.CREATED,parameters)
	}
}