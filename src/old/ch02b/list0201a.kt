package old.ch02b

/**
 * Created by SS on 2017/11/29.
 */
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun main(args: Array<String>) {
    println(max(1, 2))
}
