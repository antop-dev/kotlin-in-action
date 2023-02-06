package org.antop.kotlin.chapter3

var opCount = 0

@JvmOverloads
fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "(",
    postfix: String = ")"
): String {
    val sb = StringBuilder(prefix)
    for ((i, e) in this.withIndex()) {
        if (i > 0) sb.append(separator)
        sb.append(e)
    }
    sb.append(postfix)
    return sb.toString()
}

fun main() {
    val list = listOf(1, 2, 3)
    val join = list.joinToString(
        postfix = ") -> end"
    )
    println(join)

}
