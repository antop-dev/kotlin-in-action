package org.antop.kotlin.chapter6

import org.antop.java.chapter6.NonnullInterface

class NonnullImpl : NonnullInterface {
    override fun method(parameter: String): String {
        return parameter
    }
}

fun main() {
    val o = NonnullImpl()
    o.method("antop")
}
