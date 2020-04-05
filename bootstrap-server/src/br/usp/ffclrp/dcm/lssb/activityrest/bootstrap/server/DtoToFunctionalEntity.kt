package br.usp.ffclrp.dcm.lssb.activityrest.bootstrap.server

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.*
import br.usp.ffclrp.dcm.lssb.restaurant.stringlistmanipulators.*
import javax.json.JsonObject



class DtoToFunctionalEntity() {

    init {
        AnalysisActivityDescriptionPackage.eINSTANCE.eClass()
        StringListManipulatorsPackage.eINSTANCE.eClass()
    }

    private var factory = AnalysisActivityDescriptionFactory.eINSTANCE
    private var slmFactory = StringListManipulatorsFactory.eINSTANCE

    fun transform(dto: JsonObject, activity: Activity): FunctionalEntity {
        return getFunctionalEntity(dto, activity)
    }


    fun getFunctionalEntity(dto: JsonObject, activity: Activity)
            : FunctionalEntity {
        val functionalEntity = factory.createCommandLineTool();
        functionalEntity.name = dto.string("name")
        functionalEntity.remark = dto.string("remark")
        functionalEntity.activity = activity

        functionalEntity.exitCodes.addAll(
            dto.array("exitCodes")
                .map { getExitCode(it as JsonObject) }
                .toList()
        )

        functionalEntity.commandLineTemplate.addAll(
            dto.array("commandLineTemplate")
                .map { getCommandLineEntryList(it as JsonObject,activity) }
                .toList()
        )

        var standardInputName = dto.objectOrNull("standardInputStream")
            ?.string("name")
        functionalEntity.standardInputStream =
            activity.getInputDatasetByName(standardInputName)

        var standardOutputName = dto.objectOrNull("standardOutputStream")
            ?.string("name")
        functionalEntity.standardOutputStream =
            activity.getOutputDatasetByName(standardOutputName)

        var standardErrorName = dto.objectOrNull("standardErrorStream")
            ?.string("name")
        functionalEntity.standardOutputStream =
            activity.getOutputDatasetByName(standardErrorName)

        return functionalEntity
    }

    fun getExitCode(dto: JsonObject): ExitCode {
        val exitCode = factory.createExitCode()
        exitCode.code = dto.bigInt("code")
        exitCode.reportMessage = dto.string("reportMessage")
        exitCode.status = TerminationStatus.valueOf(
            dto.string("status") ?: TerminationStatus.FAILED.toString()
        )
        return exitCode
    }

    fun getCommandLineEntryList(dto: JsonObject, activity: Activity): CommandLineEntryList {
        return when (true) {
            dto.containsKey("literals") ->
                getLiteralCommandLineEntryList(dto)
            dto.containsKey("parameters") ->
                getParameterCommandLineEntryList(dto, activity)
            dto.containsKey("dataset") ->
                getDatasetCommandLineEntryList(dto,activity)
            else -> factory.createLiteralCommandLineEntryList()
        }
    }

    fun getLiteralCommandLineEntryList(dto: JsonObject)
            : LiteralCommandLineEntryList {
        val clel = factory.createLiteralCommandLineEntryList()
        setCommandLineEntryListFields(clel, dto)
        clel.literals.addAll(
            dto.array("literals")
                .map { it.toString() })
        return clel
    }



    fun getParameterCommandLineEntryList(dto: JsonObject, activity: Activity)
            : ParameterCommandLineEntryList {
        val clel = factory.createParameterCommandLineEntryList()
        setCommandLineEntryListFields(clel, dto)
        val parameter = dto.string("parameter")
        clel.parameter = activity.getParameterByName(parameter)
        return clel
    }



    fun getDatasetCommandLineEntryList(dto: JsonObject, activity: Activity)
            : DatasetCommandLineEntryList {
        val clel = factory.createDatasetCommandLineEntryList()
        setCommandLineEntryListFields(clel, dto)
        val dataset = dto.string("dataset")
        clel.dataset = activity.getDatasetByName(dataset)
        return clel
    }

    fun setCommandLineEntryListFields(
        clel: CommandLineEntryList,
        dto: JsonObject
    ) {
        clel.manipulators.addAll(
            dto.array("manipulators")
                .map { getStringListManipulator(it as JsonObject) }
                .toList()
        )

    }


    fun getStringListManipulator(dto: JsonObject): StringListManipulator {
        return when (dto.string("identifier")) {
            "Join" -> getJoinManipulator(dto)
            "PrependEach" -> getPrependEachManipulator(dto)
            "AppendEach" -> getAppendEachManipulator(dto)
            "AppendListWith" -> getAppendListWithManipulator(dto)
            "PrependListWith" -> getPrependListWithManipulator(dto)
            "ToFlag" -> getToFlagManipulator(dto)
            else -> throw  Exception(
                "Unknown manipulator ${
                dto.string("identifier")}"
            )
        }
    }

    fun getJoinManipulator(dto: JsonObject): Join {
        return slmFactory.createJoin().apply {
            delimiter = dto.string("delimiter")
        }
    }

    fun getPrependEachManipulator(dto: JsonObject): PrependEach {
        return slmFactory.createPrependEach().apply {
            value = dto.string("value")
        }
    }


    fun getAppendEachManipulator(dto: JsonObject): AppendEach {
        return slmFactory.createAppendEach().apply {
            value = dto.string("value")
        }
    }

    fun getAppendListWithManipulator(dto: JsonObject): AppendListWith {
        return slmFactory.createAppendListWith().apply {
            value = dto.string("value")
        }
    }

    fun getPrependListWithManipulator(dto: JsonObject): PrependListWith {
        return slmFactory.createPrependListWith().apply {
            value = dto.string("value")
        }
    }

    fun getToFlagManipulator(dto: JsonObject): ToFlag {
        return slmFactory.createToFlag().apply {
            ifTrue = dto.string("ifTrue")
            ifFalse = dto.string("ifFalse")
        }
    }


}