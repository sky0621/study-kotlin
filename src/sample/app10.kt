package sample

fun main() {
    val dog = AnimalImpl("Pochi")
    println(dog.name)
    println(dog.n)

    cry(dog)
    cry(AnimalImpl("Mike"))
}

interface Animal {
    val name: String
    fun cry()
}

class AnimalImpl(override val name: String) : Animal {
    val n = name
    override fun cry() {
        println(name)
    }
}

fun <T : Animal> cry(a: T) = a.cry()
