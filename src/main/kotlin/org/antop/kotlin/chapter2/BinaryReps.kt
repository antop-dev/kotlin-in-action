package org.antop.kotlin.chapter2

import java.util.*

fun main() {
    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.code)
        binaryReps[c] = binary
    }
    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
    // 사용하지 않는 변수는 밑줄로 처리
    for ((_, binary) in binaryReps) {
        println(binary)
    }
}
