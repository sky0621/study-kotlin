package old.ch03

/**
 * Created by SS on 2017/12/18.
 */
fun <T> joinToString(
        c: Collection<T>,
        sep: String,
        pre: String,
        post:String
): String {
    val sb = StringBuilder(pre)
    for ((idx, ele) in c.withIndex()) {
        if(idx > 0) sb.append(sep)
        sb.append(ele)
    }
    sb.append(post)
    return sb.toString()
}

fun main(args: Array<String>) {
    val c = listOf("Go", "Kotlin","C++", "Python", "Ruby", "PHP", "C#", "Java","Scala","OCaml")
    println(joinToString(c, "///","[pre]","[post]"))
}