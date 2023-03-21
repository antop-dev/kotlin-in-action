package org.antop.kotlin.chapter6

fun sendEmailTo(email: String) {
    println("send email -> $email")
}

fun main() {
    val email: String? = "antop@naver.com"
    val r = email?.let { sendEmailTo(it) }
    println("r = $r")

    val s :String? = null
    s.hashCode()
}
