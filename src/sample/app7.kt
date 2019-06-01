package sample

fun main() {
    println(FileUtil.txt)
    println(FileUtil.read())
    FileUtil.write("WARAWARA")
    println(FileUtil.read())
}
