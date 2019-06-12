package ch.ch04

fun main() {
    val d = DelegatingCollection<String>()
    println(d.size)
    println("===========================")

    val d2 = DelegatingCollection2<Int>()
    println(d2.size)
    println("===========================")

    val c = CountingSet<Int>()
    c.add(3)
    c.add(4)
    println(c.size)
    val s = HashSet<Int>()
    s.add(10)
    s.add(11)
    s.add(12)
    c.addAll(s)
    println(c.size)
    println(c.length())
}

class DelegatingCollection<T> : Collection<T> {
    private val innerList = arrayListOf<T>()

    override val size: Int get() = innerList.size
    override fun isEmpty(): Boolean = innerList.isEmpty()
    override fun contains(element: T): Boolean = innerList.contains(element)
    override fun iterator(): Iterator<T> = innerList.iterator()
    override fun containsAll(elements: Collection<T>): Boolean = innerList.containsAll(elements)
}

class DelegatingCollection2<T>(innerList: Collection<T> = ArrayList<T>()) : Collection<T> by innerList {}

class CountingSet<T>(val innerSet: MutableCollection<T> = HashSet<T>()) : MutableCollection<T> by innerSet {
    var objectsAdded = 0

    override fun add(element: T): Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        objectsAdded += elements.size
        return innerSet.addAll(elements)
    }

    fun length(): Int {
        return objectsAdded
    }
}