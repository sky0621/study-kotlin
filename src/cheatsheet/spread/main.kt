package cheatsheet.spread

fun main() {
    xyz("Kotlin", "Scala", "Java")

    val ia = intArrayOf(2, 4, 6, 8, 10)
    abc(*ia)
}

fun xyz(vararg args: String) = args.forEach { print("$it ") }

fun abc(vararg args: Int) = args.forEach { print("$it ") }
