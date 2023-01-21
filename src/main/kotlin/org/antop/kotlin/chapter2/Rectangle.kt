package org.antop.kotlin.chapter2

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() { // 프로퍼티 게터 선언
            return height == width
        }
}

fun main() {
    val rectangle = Rectangle(100, 100)
    rectangle.isSquare // true
}
