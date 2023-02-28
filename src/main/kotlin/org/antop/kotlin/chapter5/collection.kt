package org.antop.kotlin.chapter5

fun main() {
    val list = listOf(1, 2, 3, 4)
    val filtered = list.filter { it % 2 == 0 }
    println(filtered) // [2, 4]

    val mapped = list.map { it * it }
    println(mapped) // [1, 4, 9, 16]
}
