package org.antop.kotlin.chapter8

fun performRequest(
    url: String,
    callback: (code: Int, content: String) -> Unit
) {
    // do something
}

fun twoAndThree(operation: (Int, Int) -> Int) {
    val result = operation(2, 3)
    println("The result is $result")
}

fun String.filter(predicate: (Char) -> Boolean) = buildString {
    for (ch in this@filter) {
        if (predicate(ch)) append(ch)
    }
}

fun processTheAnswer(f: (Int) -> Int) {
    println(f(42))
}

fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = "",
    transform: ((T) -> String)? = null
) = buildString {
    append(prefix)
    for ((i, element) in this@joinToString.withIndex()) {
        if (i > 0) append(separator)
        val s = transform?.invoke(element)
            ?: element.toString()
        append(s)
    }
    append(postfix)
}

fun main() {
    performRequest("https://www.google.com") { code, content -> }

    twoAndThree { x, y -> x + y } // The result is 5
    twoAndThree { x, y -> x * y } // The result is 6

    println("ab1c".filter { it in 'a'..'z' }) // abc

    processTheAnswer { it + 1 } // 43

    val list = listOf("a", "n", "t", "o", "p")
    println(list.joinToString()) // a, n, t, o, p
    println(list.map { it.uppercase() }.joinToString()) // A, N, T, O, P
    println(list.joinToString(transform = { it.uppercase() })) // A, N, T, O, P
}
