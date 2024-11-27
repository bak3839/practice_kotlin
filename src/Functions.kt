fun getMyName(
    firstName: String,
    lastName: String,
): String = "$firstName $lastName"

const val ONE = 1;
const val TWO = 2;

fun sum1(num1: Int, num2: Int): Int = num1 + num2

fun main() {
    println(getMyName("Steve", "Jobs"))
    println(getMyName(firstName = "Steve", lastName = "Jobs"))
    println(getMyName("Jobs", "Steve"))
}