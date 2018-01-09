package ch02

/**
 * Created by SS on 2018/01/10.
 */
fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello, $name!")
}