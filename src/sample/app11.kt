package sample

fun main() {
    val addFunc = fun(x: Int, y: Int): Int {
        return x + y
    }
    println(addFunc(3, 4))

    val subFunc = fun(x: Int, y: Int): Int {
        return x - y
    }
    println(subFunc(9, 6))

    println(calc(1, 5, 10, addFunc))
    println(calc(1, 5, 10, subFunc))
}

fun calc(x: Int, y: Int, z: Int, ope: (Int, Int) -> Int): Int {
    return ope(x, y) * z
}
