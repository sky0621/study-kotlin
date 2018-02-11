package sandbox.pkg20180212

/**
 * Created by SS on 2018/02/12.
 */
fun main(args: Array<String>) {
    println("Hello")
    println(add(5, 4))
    println(add(7, 8))

    val q = "Test"
    println(q)
//    q = "test2"
}

fun add(a: Int, b: Int) = if (a > b) a + a + b else a + b + b
