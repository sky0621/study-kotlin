package reference.typecheck

fun main() {
    println(getStringLength("AIUEO"))
    println(getStringLength(134))
    println(getStringLength(listOf(3, 4, 5, 6)))
    println(getStringLength(3.3333))
}

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length   // is でチェック後のブロックなので自動的に String になっている。
    }
    if (obj is Int) {
        return obj.toString().length
    }
    if (obj is List<*>) {
        return obj.size
    }
    return null
}
