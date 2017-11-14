package ch02.list0208

import java.util.*

/**
 * Created by SS on 2017/11/15.
 */
class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
    get() = height == width
}

fun createRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}

fun main(args: Array<String>) {
    val r = createRectangle()
    println(r.isSquare)
}
