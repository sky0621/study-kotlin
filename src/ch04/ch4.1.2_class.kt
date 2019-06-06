package ch04

class RichButton : Clickable {
    // Interfaceの関数はopen
    override fun click() {
        println("RichButton click")
    }

    fun disable() {} // final関数なので継承不可！
    open fun animate() {}  // open関数だけどクラス自体がfinalなので継承不可！
}

//class Rich2Button : RichButton {} // 継承元がfinalなので不可！

open class Rich3Button : Clickable {
    // Interfaceの関数はopen
    override fun click() {
        println("Rich3Button click")
    }

    fun disable() {} // final関数なので継承不可！
    open fun animate() {}
}

class Rich3ButtonEx : Rich3Button() {
    override fun animate() {
        println("Override animate")
    }
}

fun main() {
    RichButton().click()
    Rich3ButtonEx().animate()
    Rich3ButtonEx().click()
    Rich3Button().click()
}
