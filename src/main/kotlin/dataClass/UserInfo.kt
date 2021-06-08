package dataClass

data class Book(val name: String)
data class UserInfo(
    val name: String,
    val gender: String,
    val age: Int
) {
    fun validate(): Boolean {
        return true
    }
}

fun main(args: Array<String>) {
    val book = Book("Book")
    book.name
    book.copy("Book2")
    val jack = UserInfo("Jack", "Male", 1)
    jack.name
    jack.gender
    jack.age
    jack.toString()
    jack.validate()
    val olderJack = jack.copy(age = 2)
    val anotherJack = jack.copy(name = "Jacky", age = 10)
    println("原始的jack：$olderJack")
    println("copyd的jack：$anotherJack")

}
