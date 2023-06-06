package org.antop.kotlin.chapter9

fun <T : Number> oneHalf(value: T): Double {
    return value.toDouble() / 2.0
}

fun <T : Comparable<T>> max(first: T, second: T): T {
    return if (first > second) first else second
}

fun <T> ensureTrailingPeriod(seq: T)
        where T : CharSequence, T : Appendable {
    if (!seq.endsWith('.')) {
        seq.append('.')
    }
}

fun main() {
    val half = oneHalf(4)
    println("half = $half")

    // 다른 타입이기 때문에 컴파일 에러
    // println(max("kotlin", 42))

    println(max("kotlin", "java"))

    val sb = StringBuilder("hello")
    ensureTrailingPeriod(sb)
    println("sb = $sb")
}
