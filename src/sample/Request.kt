package sample

interface Request {
    // 抽象プロパティ
    val url: String

    // 抽象関数
    fun get(): String

    // 抽象関数のデフォルト実装
    fun path(): String {
        return url.substring(url.lastIndexOf('/'))
    }
}
