var i: Int = 123
val j = 321
var age = 26

fun sum(a: Int, b: Int): Int = a + b

fun main() {
    age = 25
    println("age is ${sum(age, 3)}")
    // println("1 + 2 = " + sum(1, 2))
}