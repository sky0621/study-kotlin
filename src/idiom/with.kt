package idiom

fun main() {
    val sb = StringBuilder()
    val res = with(sb) {
        for (l in 'A'..'Z') {
            append("$l, ")
        }
        append("\nTHE END.")
        toString()
    }
    println(res)
}
