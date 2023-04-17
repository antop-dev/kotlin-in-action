package org.antop.kotlin.chapter8

fun main() {
    val people = listOf(
        Person("Alice", 29),
        Person("Bob", 31)
    )

    fun lookForAlice(people: List<Person>) {
        people.forEach {
            if (it.name == "Alice") {
                println("Found!")
                return
            }
        }
        println("Alice is not found")
    }

    lookForAlice(people)
}
