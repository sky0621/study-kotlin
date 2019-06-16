package cheatsheet.enumclazz

fun main() {
    println(Shape.CIRCLE)
    println(Shape.TRIANGLE.toString())

    listOf(
        Color.RED,
        Color.GREEN,
        Color.BLUE,
        Color.WHITE,
        Color.BLACK
    ).forEach { println("Color:$it, Warmer:${it.getWarmer()}") }
}

enum class Shape {
    CIRCLE, TRIANGLE, SQUARE, OVAL
}

enum class Color {
    RED, GREEN, BLUE, WHITE, BLACK
}

fun Color.getWarmer() = when (this) {
    Color.RED -> "warm"
    Color.GREEN -> "neutral"
    Color.BLUE -> "cold"
    else -> "other"
}