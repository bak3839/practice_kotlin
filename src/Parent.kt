open class Parent(val familyName: String)

class Child(
    val subName: String,
    familyName: String
) : Parent(familyName = familyName) {
    constructor(subName: String) : this(subName, "")
}

//class Child : Parent {
//    private val subName: String
//
//    constructor(subName: String) : this(subName, "")
//
//    constructor(subName: String, familyName: String) : super(familyName) {
//        this.subName = subName
//    }
//}

class Account {
    var balance: Long = 0
        private set
//        set(value) {
//            if(value < 0) throw IllegalStateException("음수 잔액은 불가합니다.")
//
//            field = value
//        }

    var accountName: String = ""
        get() = "계좌이름:$field"

    fun increaseBalance(value: Int) {
        this.balance += value;
    }

    fun decreaseBalance(value: Int) {
        this.balance -= value;
    }
}

fun main() {
    val account = Account()
    // account.balance = 100
    account.increaseBalance(100)
    account.accountName = "급여계좌"

    println("balance : ${account.balance}, name : ${account.accountName}")
}