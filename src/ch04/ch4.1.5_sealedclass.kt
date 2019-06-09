package ch04

sealed class Expr2 {
    class Num(val v: Int): Expr2()
    class Sum(val l: Expr2, val r: Expr2): Expr2()
}

fun eval2(e: Expr): Int =
        when(e) {
            is Expr.Num -> e.v
            is Expr.Sum -> eval2(e.l) + eval2(e.r)
        }
