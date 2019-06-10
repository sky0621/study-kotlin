package idiom

fun main() {
    foo()
    foo(a = 1)
    foo(b = "str")
    foo(3)
    foo(100, "200")
}

fun foo(a: Int = 0, b: String = "") {
    println("a=${a}, b=${b}")
}
