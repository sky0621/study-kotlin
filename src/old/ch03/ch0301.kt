package old.ch03

/**
 * Created by SS on 2017/12/14.
 */
fun main(args: Array<String>) {
    val set = hashSetOf(1, 7, 53)
    println(set)

    val list = arrayListOf(2, 8, 54)
    println(list)

    val map = hashMapOf(3 to "Kotlin", 9 to "Golang", 55 to "Scala")
    println(map)

    val strings = listOf("first","second","third")
    println(strings.last())
    println(strings.first())
    println(strings.get(2))
    println(strings.subList(1,3))

    val numbers = setOf(3, 11, 2, 9, 26, 5)
    println(numbers.size)
    println(numbers.max())
    println(numbers.min())
}
