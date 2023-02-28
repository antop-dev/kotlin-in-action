package org.antop.kotlin.chapter5

fun main() {
    val people = listOf(
        Person("Alice", 31),
        Person("Bob", 29),
        Person("Carol", 31),
    )
    val map = people.groupBy { it.age }
    println(map) // {31=[Person(name=Alice, age=31), Person(name=Carol, age=31)], 29=[Person(name=Bob, age=29)]}

    val counter = people.groupingBy { it.age }.eachCount()
    println(counter)
}
