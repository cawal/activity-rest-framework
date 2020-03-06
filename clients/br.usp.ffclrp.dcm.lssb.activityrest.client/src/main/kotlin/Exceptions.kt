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


class UnexpectedResponseStatus(
        message: String?,
        cause: Throwable?)
    : Throwable(message, cause) {

    constructor(message: String?) : this(message, null)
    constructor(cause: Throwable?) : this(cause?.toString(), cause)
    constructor() : this(null, null)

}



class InvalidActivityInstance(
        message: String?,
        cause: Throwable?)
    : Throwable(message, cause) {

    constructor(message: String?) : this(message, null)
    constructor(cause: Throwable?) : this(cause?.toString(), cause)
    constructor() : this(null, null)
}



class InstanceExecutionFailed(
        message: String?,
        cause: Throwable?)
    : Throwable(message, cause) {

    constructor(message: String?) : this(message, null)
    constructor(cause: Throwable?) : this(cause?.toString(), cause)
    constructor() : this(null, null)
}