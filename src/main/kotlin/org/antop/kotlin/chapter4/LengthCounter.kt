package org.antop.kotlin.chapter4

class LengthCounter {
    var counter: Int = 0
        private set

    fun addWord(word: String) {
        counter += word.length
    }
}

fun main() {
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("hello")
    lengthCounter.addWord("antop")
    println(lengthCounter.counter) // 10
}
