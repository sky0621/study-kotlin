package ch04

fun main() {
    val taro = User("Ore")
    println(taro.nickname)

    val jiro = User2("Ara")
    println(jiro._nickname)
    println(jiro.nickname)

    val saburo = User3("Iri")
    println(saburo.nickname)
}

class User(val nickname: String)

class User2 constructor(val _nickname: String) {
    val nickname: String = _nickname

}

class User3(_nickname: String) {
    val nickname = _nickname
}
