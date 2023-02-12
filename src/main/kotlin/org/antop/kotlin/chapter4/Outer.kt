package org.antop.kotlin.chapter4

class Outer {
    inner class Inner {
        fun getOuterReference() = this@Outer
    }
}

fun main() {
    val inner = Outer().Inner()
    println(inner.getOuterReference())
}
