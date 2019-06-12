package ch.ch04

fun main() {
    val u = Ch442_User("Jiro@example.com")
    println(u.nickname)

    val u2 = Ch442_User(345)
    println(u2.nickname)
}

class Ch442_User {
    val nickname: String

    constructor(email: String) {
        nickname = email.substringBefore('@')
    }

    constructor(fbAccountId: Int) {
        nickname = getFbName(fbAccountId)
    }
}

class Ch442_User2 private constructor(val nickname: String) {
    // FIXME: P.128 List4.26
}

fun getFbName(fbAccountId: Int): String {
    return "Taro$fbAccountId"
}