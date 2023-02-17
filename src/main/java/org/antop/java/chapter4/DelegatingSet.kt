package org.antop.java.chapter4

class DelegatingSet<T> : MutableCollection<T> {
    private val innerSet = mutableSetOf<T>()

    override val size: Int get() = innerSet.size
    override fun clear() = innerSet.clear()
    override fun addAll(elements: Collection<T>) = innerSet.addAll(elements)
    override fun add(element: T) = innerSet.add(element)
    override fun isEmpty() = innerSet.isEmpty()
    override fun iterator() = innerSet.iterator()
    override fun retainAll(elements: Collection<T>) = innerSet.retainAll(elements.toSet())
    override fun removeAll(elements: Collection<T>) = innerSet.removeAll(elements.toSet())
    override fun remove(element: T) = innerSet.remove(element)
    override fun containsAll(elements: Collection<T>) = innerSet.containsAll(elements)
    override fun contains(element: T) = innerSet.contains(element)
    override fun toString() = innerSet.toString()
}

fun main() {
    val set = DelegatingSet<String>()
    set += "a"
    set += "n"
    println(set)
}
