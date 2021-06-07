package enumClass

enum class EnumClass {
    NORTH, SOUTH, WEST, EAST
}

fun main(args: Array<String>) {
    val north = EnumClass.NORTH
    println(north.name)
    println(north.ordinal)
    println(north is EnumClass)
}