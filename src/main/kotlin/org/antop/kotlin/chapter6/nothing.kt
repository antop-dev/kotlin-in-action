package org.antop.kotlin.chapter6

class Company(var address: Address? = null)

class Address(val city: String)

fun fail(message: String): Nothing {
    throw IllegalStateException(message)
}

fun main() {
    val company = Company(Address("Seoul"))
    val address: Address = company.address ?: fail("No address")
    // 이후 address의 값이 널이 아님을 추론할 수 있다
    println(address.city) // Seoul

    val c: Collection<String> = mutableListOf()
}
