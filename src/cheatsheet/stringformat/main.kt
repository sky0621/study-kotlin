package cheatsheet.stringformat

fun main(args: Array<String>) {
    val msg = "Hello, ${args[0]}"
    println(msg)

    val user = "Taro"
    println("Hello, $user")

    val item = "商品１"
    println("${item}の値段は1000円です。")

    val lang = """
        Kotlin
        Scala
        Java
        Ruby
    """.trimIndent()
    println(lang)
}
