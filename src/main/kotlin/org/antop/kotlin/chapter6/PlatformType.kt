package org.antop.kotlin.chapter6

import org.antop.java.chapter6.Person

fun yellAt(person:Person) {
    println(person.name.uppercase() + "!!!") // person.name must not be null
}

fun main() {
    val person = Person(null)
    yellAt(person)
}
