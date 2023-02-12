package org.antop.kotlin.chapter4

sealed class Expr {
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
    class Sub(val left: Expr, val right: Expr) : Expr()
}

fun eval(e: Expr): Int =
    when (e) {
        is Expr.Num -> e.value
        is Expr.Sum -> eval(e.left) + eval(e.right)
        is Expr.Sub -> eval(e.left) - eval(e.right)
    }

fun main() {
    val v = eval(Expr.Sum(Expr.Num(10), Expr.Sub(Expr.Num(5), Expr.Num(3))))
    println(v)
}
