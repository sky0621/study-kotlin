package old.ch02b

/**
 * Created by SS on 2017/12/13.
 */
fun main(args: Array<String>) {
    var number: Int = 0
    val percentage =
        if (number in 0..100)
            number
    else
        throw IllegalArgumentException("A percentage value must be between 0 and 100: $number")
}