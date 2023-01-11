package org.antop.kotlin.chapter1

data class Person(
    val name: String,
    val age: Int? = null
)

fun main() {
    val persons = listOf(
        Person("영희"),
        Person("철수", 29),
        Person(age = 39, name = "안탑"),
    )

    val oldest = persons.maxBy { it.age ?: 0 }

    println("나이가 가장 많은 사람: $oldest")
}
