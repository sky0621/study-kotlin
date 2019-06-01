package sample

fun main() {
    val ri = RequestImpl("http://example.com/abc/xyz?test=va")
    println(ri.url)

    val ri2 = RequestImpl2("http://example2.com/aaaaa/bbbbb/ccccc/ddddd?k=v&k2=v2")
    println(ri2.url)
}

class RequestImpl(override val url: String) : Request {
    override fun get(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

class RequestImpl2(url: String) : Request {
    override fun get(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override val url: String = url
}