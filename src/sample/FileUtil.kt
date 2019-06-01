package sample

object FileUtil {
    var txt: String = "DEF"

    fun read(): String {
        return txt
    }

    fun write(txt: String) {
        this.txt = txt
    }
}
