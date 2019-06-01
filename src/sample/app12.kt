package sample

fun main() {
    val f5 = calc(5)
    val f10 = f5(2)
    val f = f10(8)
    println(f)
}

fun calc(n: Int): (Int) -> ((Int) -> Int) {
    return fun(n2: Int): (Int) -> Int {
        return fun(n3: Int): Int {
            return (n + n2 + n3) * 2
        }
    }
}