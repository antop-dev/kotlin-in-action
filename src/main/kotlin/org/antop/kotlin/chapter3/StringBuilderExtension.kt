package org.antop.kotlin.chapter3

var StringBuilder.lastChar: Char
    get() = this[length - 1]
    set(ch) {
        this.setCharAt(length - 1, ch)
    }

fun main() {
    val sb = StringBuilder("Antop!")
    println(sb) // Antop!
    sb.lastChar = '?'
    println(sb) // Antop?
}
