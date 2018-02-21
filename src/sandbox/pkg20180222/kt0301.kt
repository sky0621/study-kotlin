package sandbox.pkg20180222

/**
 * Created by SS on 2018/02/22.
 */
fun main(arg: Array<String>){
    val set = hashSetOf(1, 7, 53)
    println(set)
    println(set.max())
    println(set.min())
    println(set.size)

    val list = arrayListOf(1,4, 21)
    println(list)
    println(list.max())

    val map = hashMapOf(1 to "one", 7 to "seven", 33 to "thirty-three")
    println(map)
    println(map.keys)
    println(map.values)
    println(map.isEmpty())
}