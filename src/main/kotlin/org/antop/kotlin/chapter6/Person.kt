package org.antop.kotlin.chapter6

class Person(val firstName: String, val lastName: String) {
    override fun equals(o: Any?): Boolean {
        // Person 타입으로 바꿀 수 없으면 null
        // null 이기 때문에 ?:에 의해 false 리턴
        val other = o as? Person ?: return false
        // 이후부터 other는 Person이다
        return firstName == other.firstName && lastName == other.lastName
    }

    override fun hashCode() = firstName.hashCode() * 37 + lastName.hashCode()
}

fun main() {
    val p1 = Person("Jeong Yong", "An")
    val p2 = Person("Jeong Yong", "An")
    println(p1 == p2) // true
}
