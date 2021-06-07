package enumClass

enum class EnumValue {
    RED, GREEN, BLUE
}

enum class Colorful(val rgb: Int) { RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF)
}

fun main(args: Array<String>) {
    val rgbs = enumValues<EnumValue>().joinToString { "${it.name} : ${it.ordinal} " }
    println(rgbs)
    val colors = enumValues<Colorful>().joinToString { "${it.rgb} : ${it.name} : ${it.ordinal} " }
    println(colors)
}
