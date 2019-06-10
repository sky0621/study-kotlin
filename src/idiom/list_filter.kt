package idiom

fun main() {
    val l = listOf(3, 4, 5, 6, 7, 8)
    println(l)
    println(l.filter { n -> n % 2 == 0 })
    println(l.filter { it % 2 != 0 })
}
