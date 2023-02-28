package org.antop.kotlin.chapter5

import org.antop.java.chapter5.Button

fun printProblemCounts(responses: Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0
    responses.forEach {
        if (it.startsWith("4")) {
            clientErrors++
        } else if (it.startsWith("5")) {
            serverErrors++
        }
    }
    println("$clientErrors client errors, $serverErrors server errors")
}

fun main() {
    val button = Button()
    button.setOnClickListener { /* code */ }

    val sum = { x: Int, y: Int -> x + y }
    println(sum(1, 2))

    val responses = listOf("200 OK", "418 I'm not teapot", "500 Internal Server Error")
    printProblemCounts(responses)

}
