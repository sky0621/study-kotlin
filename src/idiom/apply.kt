package idiom

fun main() {
    val a = arrayOfMinusOnes(5)
    println(a)
    println(a.size)
    a.forEach { println(it) }
}

fun arrayOfMinusOnes(size: Int): IntArray {
    return IntArray(size).apply { fill(-1) }
}
