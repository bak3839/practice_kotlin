fun sum2(x: Int, y: Int): Int = x + y
val sumLambda = { x: Int, y: Int -> x + y }

fun main() {
    println(sum2(12, 34))
    println(sumLambda(12, 34))
}