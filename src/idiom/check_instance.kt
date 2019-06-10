package idiom

fun main() {
    chk("aiueo")
    chk(345)
    chk(3.14)
}

fun chk(x: Any) {
    when(x) {
        is String -> println("is String")
        is Int -> println("is Int")
        else -> println("other")
    }
}