fun String.double() = this + this

infix fun String.add(postfix: String) = this + postfix

fun main() {
    println("TTOO".double())

    println(setOf(1, 3, 4, 522, 34, 4).maxOrNull())

    println("My name is " add "Snow")

    mapOf(
        "key" to "value",
        "key2" to "value2"
    ).forEach {
        (key, value) -> println("${key} : ${value}")
    }
}