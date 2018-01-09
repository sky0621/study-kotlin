package old.ch02b

import java.util.*

/**
 * Created by SS on 2017/12/13.
 */
fun main(args: Array<String>) {
    val binaryReps = TreeMap<Char, String>()

    for (c in 'A' .. 'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }

    for ((k, v) in binaryReps) {
        println("$k = $v")
    }
}