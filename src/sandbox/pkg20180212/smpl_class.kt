package sandbox.pkg20180212

import com.sun.org.apache.xpath.internal.operations.Bool

/**
 * Created by SS on 2018/02/12.
 */
fun main(args: Array<String>) {
    val name = "Taro"
    println("Hello, $name.")

    val p1 = Person(39)
    println(p1.age)

    val p2 = Person2("Jiro", true)
    println("Name:${p2.name}, IsMarried:${p2.isMarried}")

    val p3 = Rectangle(30, 30)
    println(p3.isSquare)
    val p4 = Rectangle(110, 90)
    println(p4.isSquare)
}

class Person(val age: Int)

class Person2(
        val name: String,
        var isMarried: Boolean
)

class Rectangle(val w: Int, val h: Int) {
    val isSquare: Boolean
    get() {
        return w == w
    }
}
