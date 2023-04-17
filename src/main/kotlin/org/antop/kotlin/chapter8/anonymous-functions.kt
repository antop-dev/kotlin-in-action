package org.antop.kotlin.chapter8

fun main() {
    val people = listOf(
        Person("Alice", 29),
        Person("Bob", 31)
    )

    fun lookForAlick(people: List<Person>) {
        people.forEach(fun(person) {
            if (person.name == "Alice") return
            print("${person.name} is not Alice")
        })
    }

    lookForAlick(people)
}
