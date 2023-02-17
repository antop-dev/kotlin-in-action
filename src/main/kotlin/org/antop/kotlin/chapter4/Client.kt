package org.antop.kotlin.chapter4

data class Client(val name: String, val postalCode: Int)

fun main() {
    val c1 = Client("antop", 12345)
    val c2 = Client("antop", 12345)
    println(c1 == c2)
    println(c1 === c2)

    val client = Client("antop", 157222)
    println(client)

    val other = client.copy(postalCode = 77777)
    println(other)
}
