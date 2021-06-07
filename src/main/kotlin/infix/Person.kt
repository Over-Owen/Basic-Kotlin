package infix
//infix实现自定义中缀操作符
data class Person(val name: String, val age: Int)

infix fun Person.grow(years: Int): Person {
    return Person(name, age + years)
}


fun main() {
    val person = Person("Jack", 20)
//    println(person.grow(2))
    println (person grow 2)
}
