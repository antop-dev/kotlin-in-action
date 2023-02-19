package org.antop.kotlin.chapter4

class CoreConstants {
    companion object {
        const val TRUE = "Y"
        const val FALSE = "N"
        const val PAGE_SIZE = 20;
    }
}

fun main() {
    println(CoreConstants.TRUE)
    println(CoreConstants.FALSE)
    println(CoreConstants.PAGE_SIZE)
}
