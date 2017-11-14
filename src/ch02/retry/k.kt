package ch02.retry

import com.sun.org.apache.xpath.internal.operations.Bool

/**
 * Created by SS on 2017/11/15.
 */
fun main(args: Array<String>) {
    println("Hello, Kotlin!")
    println(add(3, 5))

    val Taro = Person("Taro", 39)
    println(Taro)
    println(Taro.name + Taro.age)

    val Jiro = Person2()
    Jiro.age = 20
    println(Jiro.isAdult)
}

fun add(a: Int, b: Int): Int = a + b

class Person(val name: String, val age: Int)

class Person2 {
    var age: Int = 0
    val isAdult: Boolean
    get(){
        return age >= 20
    }
}