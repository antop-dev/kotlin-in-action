package org.antop.kotlin.chapter2

interface Expr

class Num(val value: Int) : Expr

class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int = when (e) {
    is Num -> e.value
    is Sum -> eval(e.left) + eval(e.right)
    else -> throw IllegalArgumentException("Unknown expression")
}

fun evalWithLogging(e: Expr): Int = when (e) {
    is Num -> {
        println("num: ${e.value}")
        e.value // 블록의 마지막 식이 블록의 결과다.
    }

    is Sum -> {
        val left = evalWithLogging(e.left)
        val right = evalWithLogging(e.right)
        println("sum : $left + $right")
        left + right // 블록의 마지막 식이 블록의 결과다.
    }

    else -> throw IllegalArgumentException("Unknown expression")
}

fun main() {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4)))) // 7
    println(evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4)))) // 7
}
