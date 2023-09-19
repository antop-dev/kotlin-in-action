package org.antop.kotlin.chapter11

import java.time.LocalDate
import java.time.Period

// 확장 프로퍼티
val Int.days: Period
    get() = Period.ofDays(this)

val Period.ago: LocalDate
    get() = LocalDate.now() - this

val Period.fromNow: LocalDate
    get() = LocalDate.now() + this

fun main() {
    val yesterday = 1.days.ago
    val tomorrow = 1.days.fromNow
    println("yesterday = $yesterday")
    println("tomorrow = $tomorrow")
}
