package br.usp.ffclrp.dcm.lssb.activityrest.domain
// TEST IN : https://play.kotlinlang.org
/**
 * ActivityInstance is a entity and maintains its identity
 * at all times through its id value.
 */
class ActivityInstance(val id:String) {
    
}

enum class ParameterType {INTEGER,REAL,STRING,BOOLEAN}


sealed class ParameterValue<X>(val value : X)

fun getParameterValue(representation : String, type : ParameterType) : ParameterValue<*> { 
    return when(type) {
        ParameterType.INTEGER -> IntegerValue(representation.toInt())
        ParameterType.REAL -> RealValue(representation.toDouble())
        ParameterType.STRING -> StringValue(representation)
        ParameterType.BOOLEAN -> BooleanValue(representation.toBoolean())
    }
}

data class IntegerValue(var v : Int) : ParameterValue<Int>(v)

data class RealValue(var v : Double) : ParameterValue<Double>(v)

data class StringValue(var v : String) : ParameterValue<String>(v)

data class BooleanValue(var v : Boolean) : ParameterValue<Boolean>(v)

fun main(){
    print(getParameterValue("2",ParameterType.REAL))
    print(getParameterValue("true",ParameterType.BOOLEAN))
    print(getParameterValue("2",ParameterType.INTEGER))
    print(getParameterValue("2.1",ParameterType.INTEGER)) //NumberFormatException
}
