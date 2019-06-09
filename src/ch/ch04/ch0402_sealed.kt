package ch.ch04

fun main() {

}

fun eval(e: Expr): Int =
    when(e) {
        is Expr.Num -> e.v
        is Expr.Sum -> eval(e.l) + eval(e.r)
    }

sealed class Expr {
    class Num(val v: Int): Expr()
    class Sum(val l: Expr, val r: Expr): Expr()
}