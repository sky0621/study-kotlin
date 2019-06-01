package sample

fun main() {
    val taro = Name(1, "Taro")
    val taro2 = Name(1, "Taro")

    println(taro == taro2)

    val taro3 = Name(2, "Taro")
    println(taro == taro3)

    val (id, v) = Name(3, "Saburo")
    println(id)
    println(v)

}
