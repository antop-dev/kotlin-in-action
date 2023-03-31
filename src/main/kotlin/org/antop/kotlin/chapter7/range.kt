package org.antop.kotlin.chapter7

import java.time.LocalDate

fun main() {
    val now = LocalDate.now()
    val vacation: ClosedRange<LocalDate> = now..(now.plusDays(10))
    val nextWeek = now.plusWeeks(1)
    println(nextWeek in vacation) // true
}
