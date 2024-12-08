data class Person(val name: String, var age: Int, var isMarried: Boolean)

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width

    // fun isSquare() = height == width
}

fun main() {
    val nullablePerson: Person? =
        if (System.currentTimeMillis() % 2 == 0L) Person("Even", 22, true)
        else null

    val notNullPerson: Person = nullablePerson ?: Person(
        "DefaultPerson", 0, false
    )

    println(notNullPerson.age)

    // if 검사 등으로 특정 영역에서는 not null 타입처럼 사용 가능
//    if (nullablePerson != null) {
//        println("짝수 시간에만 존재하는 사람의 나이는 : ${nullablePerson.age}")
//    }
//
//    println(nullablePerson?.age ?: 0)
//
//    // ?. 호출을 수행 : 값이 있는 경우는 호출 결과, 값이 없는 경우 null
//    println("짝수 시간에만 존재하는 사람의 나이는 : ${nullablePerson?.age}")
//
//    // !!. 호출을 수행 : 값이 없는 경우 NPE가 발생
//    println("짝수 시간에만 존재하는 사람의 나이는 : ${nullablePerson!!.age}")



//    val persons = listOf(
//        Person("James", 32, true),
//        Person("Kameron", 42, true),
//        Person("Sphilberg", 52, true),
//        Person("Philip", 12, true),
//    )
//
//    val result1:List<Char> = persons.asSequence()
//        .map { it.name }
//        .flatMap { it.toList() }
//        .toList()
//
//    val result2:String? = persons.asSequence()
//        .map { it.name }
//        .find { it.startsWith("J") }
//
//    println("result1 = " + result1)
//    println("result2 = " + result2)

//    val result1:List<List<Char>> = persons.map {it.name}
//        .map { it.toList() }
//
//    val result2:List<Char> = persons.map {it.name}
//        .map { it.toList() }
//        .flatten()
//
//    val result3:List<Char> = persons.map {it.name}
//        .flatMap { it.toList() }
//
//    println("result1 = " + result1)
//    println("result2 = " + result2)
//    println("result3 = " + result2)
//    println(persons.groupBy { it.age })

//    println(
//        persons.filter { it.age > 36 }
//            .map { "${it.name}의 나이는 ${it.age}" }
//    )
//
//    println(
//        persons.filter { it.age > 36 }
//            .map { Child2.ofDefaultAge(it.name, "No Family Name") }
//            .find { it.subName == "Kameron" }
//    )

//    println(persons.maxByOrNull { person: Person -> person.age })
//    println(persons.maxByOrNull { person -> person.age })
//    println(persons.maxByOrNull { it.age })
//    println(persons.maxByOrNull(Person::age))
}

