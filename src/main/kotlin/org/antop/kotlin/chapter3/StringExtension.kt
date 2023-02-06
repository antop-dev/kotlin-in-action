package org.antop.kotlin.chapter3

fun String.lastChar():Char = this[length - 1]

val String.lastChar: Char
    get() = this[length -1]

fun main() {
    println("Antop".lastChar())
    println("Antop".lastChar)
}
