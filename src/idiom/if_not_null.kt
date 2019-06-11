package idiom

import java.io.File

fun main() {
    val f = File("Test").listFiles()
    println(f?.size)
    println(f?.size ?: "Non")

    val d = null
    d?.let {
        println("Not Null")
    }

    val d2 = "aaaa"
    d2?.let {
        println(d2)
    }
}
