package sandbox.pkg20180222

/**
 * Created by SS on 2018/02/22.
 */
fun main(args: Array<String>){
    val list = listOf(3, 9, 27, 81)
    val result = list.joinToString("-$-", "pRe", "...")
    println(result)
}

fun <T> joinToString(
    collection: Collection<T>,
    separator: String,
    prefix: String,
    postfix: String
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}