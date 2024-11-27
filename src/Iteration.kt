fun main() {
    val students = mutableMapOf<Int, String>()

    students[1] = "Jack"
    students[2] = "Diana"
    students[3] = "Frost"

    println(students[1])

    for(c in students) {
        println("번호:${c.key}, 이름:${c.value}")
    }

    val st = mapOf(
        1 to "Jack",
        2 to "Diana",
        3 to "Frost"
    )

    println("a is ${recognize('a')}")
    println("3 is ${recognize('3')}")
    println("[ is ${recognize('[')}")
}

fun recognize(c:Char) = when(c) {
    in '0'..'9' -> "Number"
    in 'a'..'z', in 'A'..'Z' -> "Alphabet"
    else -> "Nothing"
}