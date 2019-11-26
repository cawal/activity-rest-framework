package br.usp.ffclrp.dcm.lssb.activityrest.clients.generation.galaxy

fun String.sanitized(): String {
    return this.replace("-", "_")
}

