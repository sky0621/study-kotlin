package cheatsheet.range

fun main() {
    (1..10).forEach { print("$it "); if (it==10) println() }

    for (i in 1 until 10) { print("$i "); if (i == 9) println() }

    for (i in 50 downTo 0 step 5) { print("$i ") }
}
