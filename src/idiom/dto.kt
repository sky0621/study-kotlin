package idiom

fun main() {
    val a = Customer("Taro", "taro@example.com")
    val b = Customer("Jiro", "jiro@example.com")
    val c = Customer("Taro", "taro@example.com")

    println(a.hashCode())
    println(b.hashCode())
    println(c.hashCode())

    println(a.toString())
    println(b.toString())
    println(c.toString())

    println(a.equals(b))
    println(b.equals(c))
    println(c.equals(a))

    val d = b.copy()
    println(d.toString())
}

// has
// equals()
// hashCode()
// toString()
// copy()
data class Customer(val name: String, val email: String)
