package org.antop.kotlin.chapter6

import org.antop.java.chapter6.NullableInterface

class NullableImpl : NullableInterface {
    override fun method(parameter: String?): String {
        return parameter ?: ""
    }
}

fun main() {
    val o = NullableImpl()
    o.method(null) // ""
}
