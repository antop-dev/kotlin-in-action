package org.antop.kotlin.chapter2

import java.io.BufferedReader
import java.io.StringReader

fun readNumber(reader: BufferedReader) = try {
    reader.use {
        reader.readLine()?.toInt()
    }
} catch (e: NumberFormatException) {
    null
}

fun main() {
    val reader = BufferedReader(StringReader("11f"))
    val n = readNumber(reader)
    println("number = $n")
}
