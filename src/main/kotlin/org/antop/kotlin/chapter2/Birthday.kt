package org.antop.kotlin.chapter2

import java.time.LocalDate
import java.time.temporal.ChronoUnit

/**
 * 생일 VO
 */
class Birthday(val date: LocalDate) {
    val age: Int
        get() = ChronoUnit.YEARS
            .between(date, LocalDate.now())
            .toInt()

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as Birthday
        if (date != other.date) return false
        return true
    }

    override fun hashCode(): Int {
        return date.hashCode()
    }
}

fun main() {
    val b1 = Birthday(LocalDate.of(1983, 11, 12))
    val b2 = Birthday(LocalDate.of(1983, 11, 12))

    println("b1.age = ${b1.age}") // 39
    println("b2.age = ${b2.age}") // 39
    // equals 사용함
    println(b1 == b2) // true
}
