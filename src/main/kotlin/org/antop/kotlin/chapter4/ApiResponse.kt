package org.antop.kotlin.chapter4

data class ApiResponse private constructor(val statusCode: Int, val message: String) {
    companion object {
        const val OK = 200
        const val BAD_REQUEST = 400
        const val INTERNAL_SERVER_ERROR = 500
        const val NOT_FOUND = 404
        fun ok(message: String) = ApiResponse(OK, message)
        fun error(message: String) = ApiResponse(INTERNAL_SERVER_ERROR, message)
        fun badRequest(message: String) = ApiResponse(BAD_REQUEST, message)
        fun from(statusCode: Int, message: String) = ApiResponse(statusCode, message)
    }
}

fun main() {
    val ok = ApiResponse.ok("성공")
    val error = ApiResponse.error("NullPointerException: null")
    val badRequest = ApiResponse.badRequest("20~100 사이의 나이를 입력해주세요.")
    val notFound = ApiResponse.from(ApiResponse.NOT_FOUND, "요청한 자원을 찾을 수 없습니다.")

    println(ok)
    println(error)
    println(badRequest)
    println(notFound)
}
