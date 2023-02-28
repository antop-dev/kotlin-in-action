package org.antop.kotlin.chapter5

class Book(val title: String, val authors: List<String>)

fun main() {
    val books = listOf(
        Book("Thursday Next", listOf("Jasper Fforde")),
        Book("Mort", listOf("Terry Pratcheet")),
        Book("Good Omens", listOf("Terry Pratcheet", "Neil Gaiman")),
    )
    val authors = books.flatMap { it.authors }.toSet()
    println(authors)
    // [Jasper Fforde, Terry Pratcheet, Neil Gaiman]
}
