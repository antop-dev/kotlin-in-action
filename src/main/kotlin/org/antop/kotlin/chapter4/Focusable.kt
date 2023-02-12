package org.antop.kotlin.chapter4

interface Focusable {
    fun setFocus(b: Boolean) {
        println("I ${if (b) "got" else "list"} focus.")
    }

    fun showOff() {
        println("I'm focusable!")
    }
}
