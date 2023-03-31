package org.antop.kotlin.chapter7

data class Point(val x: Int, val y: Int)

// 확장 함수로 정의
operator fun Point.plus(other: Point): Point {
    return Point(x + other.x, y + other.y)
}

operator fun Point.times(d: Double): Point {
    return Point((x * d).toInt(), (y * d).toInt())
}

operator fun Double.times(p: Point): Point {
    return Point((p.x * this).toInt(), (p.y * this).toInt())
}

operator fun Point.unaryMinus(): Point {
    return Point(-x, -y)
}

operator fun Point.get(index: Int): Int {
    return when (index) {
        0 -> x
        1 -> y
        else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

fun main() {
    val p = Point(10, 20)
    println(p[0]) // 10
    println(p[1]) // 20
}
