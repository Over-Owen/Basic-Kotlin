package dataClass

data class User(val name: String, val age: Int)

fun main(args: Array<String>) {
    val jack = User("Jack", 38)
    val jackson = jack.copy(name = "jackson", age = 10)
    println(jack)
    println(jackson)
}

