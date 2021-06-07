package list

fun main(args: Array<String>) {
    val list = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    val iterator = list.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }
    println("======================================================")
    val list1 = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    list1.forEach {
        println(it)
    }
}