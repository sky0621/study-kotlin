package old.ch02

/**
 * Created by SS on 2017/11/05.
 */
fun main(args: Array<String>) {
    println("Hello, world!")
    println(max(3, 2))
    println(max(2, 5))
    println("=====================")
    println(add(6, 3))
    println(add(5, 0))
    println(add(0, 2))
    println(add(0, 0))
    println("=====================")
    val question = "The Question"
    val answer = 42
    val years2Compute = 7.5e6
    println(question)
    println(answer)
    println(years2Compute)
    // ↓イミュータブル変数への再代入はコンパイルエラー
//    answer = 43

    // 文字列テンプレート
    println("My answer is $answer")
}

fun max(a: Int, b: Int): Int {
    // ifは文でなく式
    return if (a > b) a else b
}

// 戻り値を省略の上、ワンライナー
fun add(x: Int, y: Int) = if (x > 0 && y > 0) x + y else 0

fun sub(x: Int, y: Int) = if (x < 0 || y < 0) 0 else x - y
