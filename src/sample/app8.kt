package sample

fun main() {
    val callback = object : Callback {
        override fun onResponse(res: Response) {
            println("onResponse!")
        }
    }
    callback.onResponse(ResponseImpl())
}

interface Response
class ResponseImpl() : Response

interface Callback {
    fun onResponse(res: Response)
}
