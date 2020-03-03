package br.usp.ffclrp.dcm.lssb.activityrest.client.exceptions


class ActivityCannotBeCreated(
        message: String?,
        cause: Throwable?)
    : Throwable(message, cause) {

    constructor(message: String?) : this(message, null)
    constructor(cause: Throwable?) : this(cause?.toString(), cause)
    constructor() : this(null, null)

}

class ServiceUnavailable(
        message: String?,
        cause: Throwable?)
    : Throwable(message, cause) {

    constructor(message: String?) : this(message, null)
    constructor(cause: Throwable?) : this(cause?.toString(), cause)
    constructor() : this(null, null)

}