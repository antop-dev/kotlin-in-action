package org.antop.kotlin.chapter3

fun main() {
    val immutableSet = setOf(1, 7, 53)
    println(immutableSet.javaClass)

    val mutableSet = mutableSetOf(1, 7, 53)
    println(mutableSet.javaClass)

    val hashSet = hashSetOf(1, 7, 53)
    println(hashSet.javaClass)

    val immutableList = listOf(1, 2, 3)
    println(immutableList.javaClass)

    val mutableList = mutableListOf(1, 2, 3)
    println(mutableList.javaClass)

    val immutableMap = mapOf(1 to "one", 2 to "two")
    println(immutableMap.javaClass)

    val mutableMap = mapOf(1 to "one", 2 to "two")
    println(mutableMap.javaClass)
}
