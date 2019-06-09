package reference.`when`

fun main() {
    cases(1)
    cases("Hello")
    cases(2)
    cases(3.2345)
    cases("HELLO")
}

fun cases(obj: Any) {
    when(obj) {
        1 -> println("ONE")
        "Hello" -> println("Greeting")
        is Int -> println("Int")
        !is String -> println("Not String")
        else -> println("Unknown")
    }
}