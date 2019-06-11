package idiom

fun main() {
    println(Resource.name)
//    Resource.name = "Jiro"

    println(Resource2.name)
    Resource2.name = "Saburo"
    println(Resource2.name)

    println(Resource3.name)
    println(Resource3.email)
    Resource3.name = "Siro"
    Resource3.email = "abcde-siro@example.com"
    println(Resource3.name)
    println(Resource3.email)
}

object Resource {
    const val name = "Taro"
}

object Resource2 {
    var name = "Jiro"
}

object Resource3 {
    var name = "Saburo"
        set(v: String) {
            println("Setter!")
            field = v + "さん"
        }

    var email: String? = null
        get() = field?.substringBefore("@") ?: "no address"
}
