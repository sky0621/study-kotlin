package cheatsheet.clazz

fun main() {
    val p = Person()
    println(p.toString())

    val p2 = Person2("Taro", 10)
    println(p2.toString())
    println(p2.name)
    println(p2.age)
}

class Person

class Person2(val name: String, val age: Int)
