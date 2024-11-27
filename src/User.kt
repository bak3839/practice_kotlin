//class User constructor(_username: String) {
//    val userName: String
//
//    init {
//        userName = _username
//    }
//}

class User(
    val userName: String,
    val level: Int = 1
)

fun main() {
    println(User(userName = "Benny", level = 10).level)
    println(User("Benny").level)
}