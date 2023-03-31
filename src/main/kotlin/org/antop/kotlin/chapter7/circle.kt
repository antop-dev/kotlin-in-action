package org.antop.kotlin.chapter7

import org.antop.java.chapter7.Circle

fun main() {
    val point = Point(0, 0)
    val circle = Circle(point, 4)
    println(circle * 3) // Circle[point=Point(x=0, y=0), radius=12]
}
