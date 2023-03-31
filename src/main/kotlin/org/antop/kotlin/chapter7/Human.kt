package org.antop.kotlin.chapter7

class Human {
    private val _attributes = hashMapOf<String, String>()

    fun setAttribute(attrName: String, value: String) {
        _attributes[attrName] = value
    }

    fun getAttribute(attrName: String) =
        _attributes[attrName]

    // 위임 프로퍼티로 맵을 사용한다.
    val name: String by _attributes
}

fun main() {
    val human = Human()
    val data = mapOf("name" to "Antop", "company" to "Google")
    for ((attrName, value) in data) {
        human.setAttribute(attrName, value)
    }

    println(human.name) // Antop
    println(human.getAttribute("company")) // Google
}
