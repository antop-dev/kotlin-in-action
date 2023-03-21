package org.antop.kotlin.chapter6

fun main() {
    val list = listOf(1, 2, 3)
    println(list)
    val array = list.toIntArray()
    println(array.contentToString())
}
