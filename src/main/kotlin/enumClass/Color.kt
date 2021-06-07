package enumClass

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

fun main(args: Array<String>) {
    val red = Color.RED
    println("RGB的十六进制转换为十进制：${red.rgb}")
}