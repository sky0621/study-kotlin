package sample

fun main() {
    listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
        .filter { it % 2 == 0 }
        .map { it.toString() }
        .forEach {
            println(it)
        }

    println(listOf(1, 2, 3, 4, 5)
        .reduce{ x, y -> x * y })
}
