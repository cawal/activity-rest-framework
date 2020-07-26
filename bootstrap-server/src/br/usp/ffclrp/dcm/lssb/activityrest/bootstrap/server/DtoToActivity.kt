package br.usp.ffclrp.dcm.lssb.activityrest.bootstrap.server

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.*
import javax.json.JsonObject
import javax.json.JsonValue


class DtoToActivity() {

    init {
        AnalysisActivityDescriptionPackage.eINSTANCE.eClass()
    }

    private var factory = AnalysisActivityDescriptionFactory.eINSTANCE

    fun transform(dto: JsonObject): Activity {
        return getActivity(dto)
    }


    fun getActivity(dto: JsonObject): Activity {
        val activity = factory.createActivity();
        setIdentifiableElementFields(activity, dto)
        activity.parameters.addAll(
                dto.array("parameters")
                .map { getParameter(it) }
                .toList()
        )
        activity.inputDatasets.addAll(
            dto.array("inputDatasets")
                .map { getInputDataset(it) }
                .toList()
        )
        activity.outputDatasets.addAll(
            dto.array("outputDatasets")
                .map { getOutputDataset(it) }
                .toList()
        )
        return activity
    }

    fun getParameter(dto: JsonValue?): Parameter {
        val p = factory.createParameter()
        return when (dto) {
            is javax.json.JsonObject -> {
                setIdentifiableElementFields(p, dto)
                setMultiplicityElementFields(p, dto)
                p.parameterType = when (dto.string("parameterType")) {
                    "STRING" -> ParameterType.STRING
                    "INTEGER" -> ParameterType.INTEGER
                    "REAL" -> ParameterType.REAL
                    "BOOLEAN" -> ParameterType.BOOLEAN
                    else -> null
                }
                p.defaultValue.addAll(
                    dto.array("defaultValue")
                        .map { it.toString() }
                       .toList())
                p.constraints.addAll(
                    dto.array("constraints")
                        .map{getConstraint(it as JsonObject)}
                        .toList()
                )
                p
            }
            else -> p
        }
    }


    fun getInputDataset(dto: JsonValue) : InputDataset {
       val d = factory.createInputDataset()
       return when (dto) {
           is JsonObject -> {
               setDatasetFields(d,dto)
               d
           }
           else -> d

       }
    }



    fun getOutputDataset(dto: JsonValue) : OutputDataset {
        val d = factory.createOutputDataset()
        return when (dto) {
            is JsonObject -> {
                setDatasetFields(d,dto)
                d
            }
            else -> d

        }
    }


    fun setIdentifiableElementFields(ie: IdentifiableElement, dto: JsonObject) {
        ie.name = dto.string("name")
        ie.remark = dto.string("remarks")
    }

    fun setMultiplicityElementFields(me: MultiplicityElement, dto: JsonObject) {
        me.minimumCardinality = dto.bigInt("minimunCardinality",1)
        me.maximumCardinality = dto.bigInt("maximunCardinality",1)
    }

    fun setDatasetFields(d : Dataset, dto : JsonObject){
        setIdentifiableElementFields(d,dto)
        setMultiplicityElementFields(d,dto)
        d.mimetype = dto.string("mimetype")
        d.constraints.addAll(  dto.array("constraints")
            .map{getConstraint(it as JsonObject)}
            .toList()
        )
    }

    fun getConstraint(dto : JsonObject) : Constraint{
        val c = factory.createConstraint()
        c.name = dto.string("name")
        return c
    }

}