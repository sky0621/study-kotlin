package sample

fun main() {
    println(calc(10, { x -> x * x }))
    println(calc(10, { x -> x * 3 }))
    println(calc(10, { it * 3 }))
}

fun calc(v: Int, ope: (Int) -> Int): Int {
    return ope(v)
}
