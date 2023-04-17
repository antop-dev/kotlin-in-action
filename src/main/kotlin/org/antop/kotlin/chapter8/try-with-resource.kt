package org.antop.kotlin.chapter8

import java.io.BufferedReader
import java.io.FileReader

fun readFirstLineFromFile(path: String): String {
    BufferedReader(FileReader(path)).use {
        return it.readLine()
    }
}

fun main() {
    println(readFirstLineFromFile("README.md"))
    // # kotl-in-action
}
