package old.ch02

/**
 * Created by SS on 2017/11/08.
 */
fun main(args: Array<String>) {
    val p = Person2("Taro", true)
    println(p.name)
    println(p.isMarried)
}

// 注意「{ }」ではなく「( )」
class Person2(
    val name: String,
    var isMarried: Boolean
)
