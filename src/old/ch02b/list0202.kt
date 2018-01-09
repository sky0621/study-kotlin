package old.ch02b

/**
 * Created by SS on 2017/11/29.
 */
fun main(args: Array<String>){
    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello, $name!")
}