package org.antop.java.chapter4

class CountingSet<T>(
    private val innerSet: MutableCollection<T> = mutableSetOf()
) : MutableCollection<T> by innerSet {
    var added = 0
        private set

    override fun add(element: T): Boolean {
        added++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        added += elements.size
        return innerSet.addAll(elements)
    }

    override fun toString(): String = innerSet.toString()
}

fun main() {
    val set = CountingSet<Int>()
    set += 1
    set += 3
    set += 4
    println("added = ${set.added}")
    println("set = $set")
}
