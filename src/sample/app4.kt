package sample

fun main() {
    val m = Min()
    println(m)

    val ma = Max(3, 5)
    println(ma.toString())

    val u1 = User()
    println(u1.id)
    println(u1.name)

    val u2 = User("ID1")
    println(u2.id)
    println(u2.name)

    val u3 = User("ID3", "name3")
    println(u3.id)
    println(u3.name)

    u3.id = "xID3"
    u3.name = "xName3"
    println(u3.id)
    println(u3.name)

    val ux = UserX()
    ux.id = 500
    println(ux.id)

    val ux2 = UserX()
    ux2.id = -1
    println(ux2.id)
}

class Min

class Max(i: Int, j: Int)

class User(id: String) {
    var id = ""
    var name = ""

    init {
        this.id = id
        name = "ONE ARG"
    }

    constructor(): this("dummy") {
        id = "DUMMY"
        name = "NO ARG"
    }

    // MEMO: "this(id)" ... プライマリーコンストラクタを呼び出す。
    constructor(id: String, name: String): this(id) {
//        this.id = id
        this.name = name
    }

}

class UserX {
    var id = 0
    get() {
        return field
    }
    set(v) {
        if (v < 0) {
            return
        }
        field = v * 2
    }
}