package sample

fun main() {
    val o = Organization(123)
    println(o.id)
//    o.id = 345

    val g = Group(987)
    println(g.id)
//    g.id = 777

    val sg = SGroup(5555, "gogogogo")
    println(sg.id)
    println(sg.name)

}

class Organization(id: Int) {
    val id = id
}

open class Group(val id: Int)

class SGroup(id: Int, val name: String) : Group(id)
