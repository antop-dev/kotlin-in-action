package org.antop.kotlin.chapter2

data class Person(val age: Int, val name: String)

fun main() {
    val person = Person(name = "antop", age = 39)
    val (name, age) = person
    println("name = $name, age = $age")
}
