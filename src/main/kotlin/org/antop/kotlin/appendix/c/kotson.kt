package org.antop.kotlin.appendix.c

import com.github.salomonbrys.kotson.*
import com.google.gson.Gson
import java.time.LocalTime
import java.time.format.DateTimeFormatter

class User(val name: String, val files: Int) {
    override fun toString(): String {
        return "Json(name='$name', files=$files)"
    }
}

fun main() {
    val obj = jsonObject(
        "name" to "kotson",
        "creation" to LocalTime.now().format(DateTimeFormatter.ISO_TIME),
        "files" to 4,
        "array" to jsonArray("one", "two", 42, 21.5)
    )
    obj += "age" to 40
    obj -= "creation"

    println("obj = $obj")

    val json = """
        [{
            "name": "kotson",
            "files": 4,
            "array": [1, 2, 3, 4],
            "age": 40
        }, {
            "name": "kotlin",
            "files": 0,
            "array": [5, 6, 7, 8],
            "age": 44
        }]
    """.trimIndent()

    val gson = Gson()

    val user = gson.fromJson<User>(obj.toString())
    println("user = $user")

    val users = gson.fromJson<List<User>>(json)
    println("users = $users")
}
