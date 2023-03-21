package org.antop.kotlin.chapter6

interface Processor<T> {
    fun process(): T
}
