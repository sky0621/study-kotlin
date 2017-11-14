package ch02

/**
 * Created by SS on 2017/11/15.
 */
enum class Signal(
        val r: Int,
        val g: Int,
        val b: Int
) {
    BLUE(0, 0, 255), YELLOW(255, 255, 0), RED(255, 0, 0);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun main(args: Array<String>) {
    println(Signal.BLUE.rgb())

    val y = Signal.YELLOW
    println(getColor(y))
}

fun getColor(s: Signal) = when (s) {
    ch02.Signal.BLUE -> "Blue"
    ch02.Signal.YELLOW -> "Yellow"
    ch02.Signal.RED -> "Red"
}
