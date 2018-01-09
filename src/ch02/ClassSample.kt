package ch02

import com.sun.org.apache.xpath.internal.operations.Bool

/**
 * Created by SS on 2018/01/10.
 */
fun main(args: Array<String>) {
    println("=== PERSON ===")
    val taro = Person("taro", true)
    println(taro.name)
    println(taro.isMarried)
    taro.isMarried = false
    println(taro.isMarried)

    println("=== RECTANGLE ===")
    val rect = Rectangle(165, 164)
    println(rect.isSquare)
    val rect2 = Rectangle(25, 25)
    println(rect2.isSquare)
}

class Person(
    val name: String,   // 読み取り専用のプロパティ（※フィールドとgetterが生成される）
    var isMarried: Boolean  // 書き込み可能なプロパティ（※フィル度とgetter/setterが生成される）
)

class Rectangle(
        val height:Int,
        val width:Int
) {
    val isSquare: Boolean
    get() {
        return height == width
    }
}