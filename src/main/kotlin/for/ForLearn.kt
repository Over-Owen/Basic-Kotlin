package `for`

fun main() {
    val array = arrayOf("a", "b", "c","d","e","f")
    println(array.withIndex())
    for ((index, value) in array.withIndex()) {
        println("the element at $index is $value")
    }
}