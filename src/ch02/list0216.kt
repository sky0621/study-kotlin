package ch02

/**
 * Created by SS on 2017/11/22.
 */
enum class Color {
    RED,YELLOW,ORANGE,BLUE,VIOLET,INDIGO
}

fun mixOptimized(c1:Color, c2:Color) =
        when {
            (c1 == Color.RED && c2==Color.YELLOW) ||
                    (c1==Color.YELLOW && c2==Color.RED) ->
                    Color.ORANGE
            else -> throw Exception("Dirty color")
        }
