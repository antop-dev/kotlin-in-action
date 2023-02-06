package org.antop.kotlin.chapter3

fun makeOf(vararg values: Int) {

}

fun main() {
    val array = intArrayOf(1, 2, 3)
    makeOf(*array)
}
