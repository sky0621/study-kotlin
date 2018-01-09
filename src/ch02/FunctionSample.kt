package ch02

/**
 * Created by SS on 2018/01/10.
 */
fun main(args: Array<String>) {
    println(max(3,2))
    println(max(9, 11))

    println(add(32, 23))
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun add(x: Int, y: Int): Int = x + y
