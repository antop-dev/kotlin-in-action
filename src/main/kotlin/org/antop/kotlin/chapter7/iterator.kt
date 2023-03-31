package org.antop.kotlin.chapter7

import java.time.LocalDate

operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
    object : Iterator<LocalDate> {
        var current: LocalDate = start

        override fun hasNext(): Boolean {
            return current <= endInclusive
        }

        override fun next(): LocalDate {
            return current.apply {
                current = plusDays(1)
            }
        }
    }

fun main() {
    val newYear = LocalDate.ofYearDay(2024, 1)
    val daysOff = newYear.minusDays(7)..newYear
    for (dayOff in daysOff) {
        println(dayOff)
    }
    // 2023-12-25
    // 2023-12-26
    // 2023-12-27
    // 2023-12-28
    // 2023-12-29
    // 2023-12-30
    // 2023-12-31
    // 2024-01-01
}
