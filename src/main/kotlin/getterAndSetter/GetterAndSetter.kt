package getterAndSetter

class GetterAndSetter {
    var age: Int = 2
        get() = field
        set(value) {
            field = value
        }
}

fun main(args: Array<String>) {
    val a = GetterAndSetter()
    a.age = 23
    println(a.age)
}