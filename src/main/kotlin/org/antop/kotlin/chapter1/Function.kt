package org.antop.kotlin.chapter1

import java.util.*

fun main() {
    val nums = listOf(3, 4, 5, 2, 1)
    println("nums   = $nums")
    // 마지막 인자가 함수라면 밖으로 뺄 수 있다.
    Collections.sort(nums) { o1, o2 -> o2 - o1 }
    println("sorted = $nums")
}
