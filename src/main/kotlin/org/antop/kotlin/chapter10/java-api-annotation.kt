package org.antop.kotlin.chapter10

import kotlin.jvm.JvmStatic
import kotlin.jvm.Volatile

class Volatile(@Volatile var id: Int)

class JvmStatic {
    companion object {
        @JvmStatic
        fun add(x: Int, y: Int) = x + y
    }
}

class Calculator {
    @Strictfp
    fun add(x: Double, y: Double) = x + y
}

class Empty(private val value: String? = null) {
    @JvmOverloads
    fun getValue(defaultValue: String = ""): String {
        return value ?: defaultValue
    }
}

class Field {
    @JvmField
    var name: String? = null
}
