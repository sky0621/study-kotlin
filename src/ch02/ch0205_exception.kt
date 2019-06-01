package ch02

fun main() {
    fn(3)
}

fun fn(x: Int) {
    if (x in 1..10) {
        throw IllegalArgumentException("Excep: $x")
    }
}