package org.antop.kotlin.chapter8

data class Person(val name: String, val age: Int)

fun main() {
    val people = listOf(
        Person("alice", 29),
        Person("Bob", 31),
    )

    println(people.filter { it.age < 30 }
        .map(Person::name))

    val result = mutableListOf<Person>()
    for (person in people) {
        if (person.age < 30) result += person
    }
    println(result)
}
