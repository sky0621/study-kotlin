package sample

fun main() {
    val ls = listOf("Kotlin", "Java", "C", "Go", "Ruby")
    var res: String
    for (l in ls) {
        res = when (l.length) {
            1 -> "C"
            2 -> "Go"
            else -> "?"
        }
        println(res)
    }
}
