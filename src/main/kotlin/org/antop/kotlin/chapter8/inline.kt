package org.antop.kotlin.chapter8

import java.util.concurrent.locks.Lock

inline fun <T> sync(lock: Lock, action: () -> T): T {
    lock.lock()
    try {
        return action()
    } finally {
        lock.unlock()
    }
}

class LockOwner(val lock: Lock) {
    fun runUnderLock(body: () -> Unit) {
        sync(lock, body)
    }
}

fun foo(l: Lock) {
    println("Before sync")
    sync(l) {
        println("Action")
    }
    println("After sync")
}

class Foo(private val inline: () -> Unit) {
    fun bar() {
        inline()
    }
}

fun main() {
    val foo = Foo { println("hello world") }
    foo.bar()
}

inline fun foo(inlined: () -> Unit, noinline notInlined: () -> Unit) {
    inlined()
    notInlined()
}

fun bar() {
    foo(
        inlined = { println("i am inlined") },
        notInlined = { println("i an not inlined") }
    )
}
