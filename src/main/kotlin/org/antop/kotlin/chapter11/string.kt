package org.antop.kotlin.chapter11

fun buildString(
    /* 수신 객체가 있는 함수 타입의 파라미터를 선언한다. */
    buildAction: StringBuilder.() -> Unit
): String {
    val sb = StringBuilder()
    sb.buildAction()
    return sb.toString()
}

inline fun <T> T.apply(block: T.() -> Unit): T {
    block()
    return this
}

inline fun <T, R> T.apply(receiver: T, block: T.() -> R): R = receiver.block()

fun main() {
    val s = buildString {
        this.append("Hello, ")
        append("World!")
    }
    println(s) // hello kotlin!

    val appendExcl: StringBuilder.() -> Unit = { this.append("!") }
    val sb = StringBuilder("Hi")
    sb.appendExcl()
    println(sb) // Hi!

    val map = mutableMapOf(1 to "one")
    map.apply { this[2] = "two" }
    with(map) { this[3] = "three" }
    println(map) // {1=one, 2=two, 3=three}
}
