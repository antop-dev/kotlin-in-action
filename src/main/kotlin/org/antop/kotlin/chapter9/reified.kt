package org.antop.kotlin.chapter9

import java.util.*

inline fun <reified T> isA(value: Any): Boolean {
    return value is T
}

inline fun <reified T> Iterable<*>.filterIsInstance(): List<T> {
    val dest = mutableListOf<T>()
    for (el in this) {
        if (el is T) {
            dest += el
        }
    }
    return dest
}

inline fun <reified T> loadService(): ServiceLoader<T> {
    return ServiceLoader.load(T::class.java)
}

fun main() {
    println(isA<String>("abc"))
    println(isA<Int>(123))

    val items = listOf("one", 2, "three")
    println(items.filterIsInstance<String>())

    val services = loadService<IntProvider>()
    for (service in services) {
        println("service = $service")
        repeat(15) {
            print(" " + service.nextInt())
        }
        println()
    }

}
