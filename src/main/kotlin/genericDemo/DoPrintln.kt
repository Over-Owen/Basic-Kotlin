package genericDemo

import java.util.*

fun main(args: Array<String>) {
    val intage = 23
    val stringname = "OverOwen"
    val bool = true
    val afloat = 132341241241241f

    doPrintln(intage)    // 整型
    doPrintln(stringname)   // 字符串
    doPrintln(bool)   // 布尔型
    doPrintln(afloat)   // 长整型
}

fun <T> doPrintln(content: T) {

    when (content) {
        is Int -> println("整型数字为 $content")
        is String -> println("字符串转换为大写：${content.uppercase()}")
        is Boolean -> println("布尔类型 $content")
        else -> println("T 不是整型，也不是字符串 $content")
    }
}

fun <T : Comparable<T>> sort(list: List<T>) {
    // ……


}