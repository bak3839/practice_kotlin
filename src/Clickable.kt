interface Clickable {
    fun click(): Unit
}

class Button: Clickable {
    override fun click() {
        println("Button is clicked")
        internalPrint()
    }
}

private fun internalPrint() {
    println("Internal out")
}

fun main() {
    Button().click()
    internalPrint()
}