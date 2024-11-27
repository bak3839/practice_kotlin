import java.io.IOException

fun main() {
    try {
        Integer.parseInt("123")
    } catch (e: Exception) {
        throw IOException("Checked Exception")
    } finally {
        println("무조건 실행")
    }
}