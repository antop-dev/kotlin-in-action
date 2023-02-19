package org.antop.kotlin.chapter4

import com.google.gson.Gson

data class Person(val name: String) {
    companion object // 빈 객체라도 동반 객체가 꼭 있어야 한다
}

fun Person.Companion.fromJson(json: String): Person {
    val gson = Gson()
    return gson.fromJson(json, Person::class.java)
}

fun main() {
    val json = """{ "name" : "Antop"  }"""
    val person = Person.fromJson(json)
    println(person)

}
