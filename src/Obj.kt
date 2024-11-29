object NumberUtils{
    fun sum(a:Int, b:Int):Int {
        return a + b
    }

    fun multiply(a:Int, b:Int):Int {
        return a * b
    }
}

data class Child2(val subName:String, val familyName:String, val age:Int) {

    companion object {
        const val MAX_CHILDREN_COUNT = 4

        fun ofDefaultAge(
            subName: String,
            familyName: String
        ):Child2 {
            return Child2(subName, familyName, 0)
        }
    }
}

fun main() {
    println(NumberUtils.sum(1, 2))
    println(NumberUtils.multiply(1, 2))

    println(Child2.ofDefaultAge("Snow", "John").age)
}