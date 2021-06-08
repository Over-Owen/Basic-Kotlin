package timeStamp

import java.text.SimpleDateFormat
import java.util.*

fun main(args: Array<String>) {
    val time1 = SimpleDateFormat("yyyyMMddHHmmss").format(Date())
    println(time1)
    val time2 = SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(Date())
    println(time2)
    val time3 = SimpleDateFormat("yyyy/MM/dd HH:mm").format(Date())
    println(time3)
    val time4 = SimpleDateFormat("yyyy.MM.dd").format(Date())
    println(time4)
    val time5 = SimpleDateFormat("yyyy.M.d").format(Date())
    println(time5)
}