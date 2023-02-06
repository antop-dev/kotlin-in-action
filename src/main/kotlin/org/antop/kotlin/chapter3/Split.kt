package org.antop.kotlin.chapter3

fun main() {
    println("12.345-6.A".split("."))
    // [12, 345-6, A]

    val regex = "\\.|-".toRegex()
    println("12.345-6.A".split(regex))
    // [12, 345, 6, A]

    println("12.345-6.A".split(".", "-"))
    // [12, 345, 6, A]
}
