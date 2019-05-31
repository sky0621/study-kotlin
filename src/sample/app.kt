package sample

fun main() {
    println("HELLOOOOOOOOOOOOOOO")
    println(add(3, 5))
    println(sub(10, 2))

    var x = 3
    x = 5
    println(x)

    var str: String? = null
    println(length("aiueo"))
    println(length(str))

    val str2 = "STR2"
    println(str2.length)

    println(length2(null))
    println(length2("warawara"))

    val isOdd = if (x % 2 == 0) false else true
    println(isOdd)
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun sub(a: Int, b: Int): Int = a - b

fun length(text: String?): Int? {
    return text?.length
}

fun length2(s: String?) = s?.length ?: 0
