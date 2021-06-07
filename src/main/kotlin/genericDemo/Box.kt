package genericDemo

class Box<T>(t: T) {
    var value = t

}

fun main(args: Array<String>) {
    var boxInt = Box<Int>(66666)
    var boxString = Box<String>("OverOwen")
    println(boxInt.value)
    println(boxString.value)
}
class Table(){
    fun <T> boxIn(value: T) = Box(value)
    val box4 = boxIn<Int>(1)
    val box5 = boxIn(1)
}

