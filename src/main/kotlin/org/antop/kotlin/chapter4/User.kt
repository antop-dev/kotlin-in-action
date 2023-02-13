package org.antop.kotlin.chapter4

open class User(
    val nickname: String,
    val isSubscribed: Boolean = true
) {
    var address: String = "unspecified"
        set(value) {
            println("""Address was changed for $nickname:
                |"$field" -> "$value"""".trimMargin())
            field = value
        }
}

class TwitterUser(nickname: String) : User(nickname)

fun main() {
    val antop = User("안탑")
    println("${antop.nickname} -> ${antop.isSubscribed}")

    val jack = User("Jack", false)
    println("${jack.nickname} -> ${jack.isSubscribed}")

    val twitter = TwitterUser("twitter")
    println("I am ${twitter.nickname}")

    val user = User("Kent")
    user.address = "Elsenheimerstrasse 47, 80687 Muechen"
}
