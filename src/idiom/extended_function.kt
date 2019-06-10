package idiom

fun main() {
    println("Convert this from blank to underline".SpaceToUnderline())
}

fun String.SpaceToUnderline(): String {
    return this.replace(" ", "_")
}