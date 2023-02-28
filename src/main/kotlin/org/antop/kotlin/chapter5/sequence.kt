package org.antop.kotlin.chapter5

fun main() {
    listOf(1, 2, 3, 4).asSequence()
        .map { print("map($it) "); it * it }
        .filter { print("filter($it) "); it % 2 == 0 }
        .toList() // 최종 연산
    println()

    val find = listOf(1, 2, 3, 4)
        .map { it * it }
        .find { it == 4 }
    println(find)

    val people = listOf(
        Person("Alice", 29),
        Person("Bob", 31),
        Person("Charles", 31),
        Person("Dan", 21),
    )

    people.asSequence()
        .map { it.name }
        .filter { it.length < 4 }
        .toList()

    people.asSequence()
        .filter { it.name.length < 4}
        .map { it.name }
        .toList()
}
