package org.antop.kotlin.chapter10

data class User(val id: Long, val email: String, val name: String)

class UserService {
    @Deprecated(
        message = "유저의 식별자 정책이 아이디에서 이메일로 변경됨",
        replaceWith = ReplaceWith("getUser(email)")
    )
    fun getUser(id: Long): User? = null

    fun getUser(email: String): User? = null
}

class UserController(private val userService: UserService) {
    fun getUser() {
        val user = userService.getUser(1L)
    }
}
