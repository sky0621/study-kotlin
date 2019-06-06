package ch04

interface Clickable {
    fun click()
    // デフォルト実装付き
    fun showOff() = println("I'm clickable!")
}

class Button : Clickable {
    override fun click() = println("I was clicked")
}

interface Focusable {
    // デフォルト実装付き
    fun showOff() = println("I'm focusable!")
}

class DButton : Clickable, Focusable {
    override fun showOff() {
    }

    override fun click() = println("DButton was clicked")
}

fun main() {
    Button().click()
    Button().showOff()

    DButton().click()
    DButton().showOff()
}