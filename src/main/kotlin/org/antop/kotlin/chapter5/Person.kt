package org.antop.kotlin.chapter5

data class Person(val name: String, val age: Int)

fun findTheOldest(people: List<Person>) {
    val oldest = people.maxBy { it.age }
    println(oldest)
}

fun main() {
    val people = listOf(
        Person("Alice", 27),
        Person("Bob", 31)
    )
    findTheOldest(people)

    people.maxBy { it.age }

    val oldest = people.maxBy { it.age }
    println(oldest)

    val canBeInClub27 = { p: Person -> p.age <= 27 }
    println(people.all(canBeInClub27)) // false
    println(people.any(canBeInClub27)) // true
    println(people.count(canBeInClub27)) // 1
    println(people.find(canBeInClub27)) // Person(name=Alice, age=27)

    // (1) .map {} 의 결과로 새로운 컬렉션을 만듬
    // (2) .filter {} 의 결과로 새로운 컬렉션을 만듬
    people
        .map { it.name }
        .filter { it.startsWith("A") }

    people.asSequence()
        .map { it.name}
        .filter { it.startsWith("A") }
        .toList()
}
