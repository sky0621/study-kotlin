package ch03

fun main() {
    println("Kotlin".lastChar())
    println("Kotlin".firstChar())

    println("".firstChar())
}

// 拡張関数
fun String.lastChar(): Char = this[this.length - 1]
fun String.firstChar(): Char = this[0]
