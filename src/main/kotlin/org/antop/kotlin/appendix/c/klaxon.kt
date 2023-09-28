package org.antop.kotlin.appendix.c

import com.beust.klaxon.Json
import com.beust.klaxon.Klaxon

data class Person(
    @Json("the_name")
    val name: String,
    var age: Int = 23
)

data class Data(
    @Json(index = 2) val id: String,
    @Json(index = 1) val name: String
)

fun main() {
    val json = """
        {
            "the_name": "John Smith",
        }
    """
    val person = Klaxon().parse<Person>(json)
    println(person)

    val data = Data("10", "antop")
    println(Klaxon().toJsonString(data))
}
