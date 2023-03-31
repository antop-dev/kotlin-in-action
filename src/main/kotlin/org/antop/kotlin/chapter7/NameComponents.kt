package org.antop.kotlin.chapter7

data class NameComponents(
    val name: String,
    val extension: String
)

fun splitFilename(fullName: String): NameComponents {
    val (name, ext) = fullName.split('.', limit = 2)
    return NameComponents(name, ext)
}

operator fun <E> List<E>.component6(): E {
    return this[5]
}

fun main() {
    val (name, ext) = splitFilename("example.kt")
    println(name) // example
    println(ext) // kt

    val x = listOf(1, 2, 3, 4, 5, 6, 7)
    val (a, b, c, d, e, f) = x // Destructuring declaration initializer of type List<Int> must have a 'component6()' function

    val map = mapOf(1 to 2, 3 to 4)
    map.map { (_, value) -> value * 2 }
}
