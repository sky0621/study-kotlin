package old.ch02

import old.ch02.list0208.Rectangle

/**
 * Created by SS on 2017/11/08.
 */
fun main(args: Array<String>) {
    val r = Rectangle(100, 101)
    println(r.isSquare)
    val r2 = Rectangle(100, 100)
    println(r.isSquare)

}

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }
}