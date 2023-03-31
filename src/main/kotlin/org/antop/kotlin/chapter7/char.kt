package org.antop.kotlin.chapter7

operator fun Char.times(count: Int): String {
    return "$this".repeat(count)
}

fun main() {
    println('a' * 3) // aaa
}
