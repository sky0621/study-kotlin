package cheatsheet.collection

fun main() {
    val l = listOf("Kotlin", "Scala", "Java", "Closure", "Go", "Ruby", "PHP", "Python", "C", "C++", "C#", "Rust")
    println(l)
    print("first:${l.first()} last:${l.last()}\n")

    val al = arrayListOf(1, 3, 5, 7, 9, 11, 13, 15)
    println(al)

    println("==================================")

    val s = setOf(7, 14, 21, 28, 35)
    println(s)

    val hs = hashSetOf(4, 8, 12, 16, 20)
    println(hs)

    val ls = linkedSetOf(6, 12, 18, 24, 30)
    println(ls)

    val ss = sortedSetOf(11, 55, 22, 44, 33, 66)
    println(ss)

    println("==================================")

    val m = mapOf(1 to "Red", 3 to "Green", 2 to "Blue")
    println(m)

    val hm = hashMapOf(2 to "Oval", 1 to "Triangle", 3 to "Circle", 4 to "Rectangle")
    println(hm)

    val sm = sortedMapOf(4 to "Fourth", 2 to "Second", 3 to "Third", 1 to "First")
    println(sm)

}
