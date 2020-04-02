package br.usp.ffclrp.dcm.lssb.activityrest.bootstrap.server

import java.math.BigInteger
import javax.json.JsonObject
import javax.json.JsonValue

fun JsonObject.array(attributeName : String ) =
    (this.getJsonArray(attributeName) ?: emptyList<JsonValue>())

fun JsonObject.string(attributeName : String ) =
    if (this.containsKey(attributeName))
        this.getString(attributeName)
    else null

fun JsonObject.int(attributeName : String ) =
    if (this.containsKey(attributeName))
        this.getInt(attributeName)
    else null

fun JsonObject.lon(attributeName : String ) =
    if (this.containsKey(attributeName))
        this.getInt(attributeName).toLong()
    else null

fun JsonObject.bigInt(attributeName : String, default: Number = 0) =
    if (this.containsKey(attributeName))
        BigInteger.valueOf(this.getInt(attributeName).toLong())
    else BigInteger.valueOf(default.toLong())

fun JsonObject.objectOrNull(attributeName : String) =
    if (this.containsKey(attributeName))
        this.getJsonObject(attributeName)
    else null

