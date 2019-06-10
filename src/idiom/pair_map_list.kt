package idiom

fun main() {
    val m = mapOf(
        1 to "First",
        2 to "Second",
        3 to "Third"
    )

    for ((k, v) in m) {
        println("key:$k, value:$v")
    }
}
