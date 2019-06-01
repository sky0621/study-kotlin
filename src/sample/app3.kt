package sample

fun main() {
    abc(15, "C")
    abc(12345)
}

fun abc(a: Int, b: String = "B") {
    println(a)
    println(b)
}