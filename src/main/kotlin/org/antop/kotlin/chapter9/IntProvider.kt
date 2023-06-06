package org.antop.kotlin.chapter9

interface IntProvider {
    fun nextInt(): Int
}

class GoogleIntProvider : IntProvider {
    private val pool = IntArray(9) { i -> i + 1 }
    private var i = 0

    override fun nextInt(): Int {
        i %= pool.size
        return pool[i++]
    }
}
