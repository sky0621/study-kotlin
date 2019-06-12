package ch.ch04

fun main() {
    A.baa()
    A.foo()

    val s = S()
    println(s.foo)
}

class S {
    val foo = "foo"
    private val baa = "baa"
}

fun getSfoo(): String {
    val s = S()
    return s.foo
}

//fun getSbaa(): String {
//    val s = S()
//    return s.baa
//}

class A {
    companion object {
        fun baa() {
            println("companion object called")
        }

        fun foo() {
            println("foo called")
        }
    }
}