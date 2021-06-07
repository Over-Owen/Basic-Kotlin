package sealClass

sealed class PlayerCmd { //演奏控制类（密封类）
    val playerName: String = "Player"

    //演奏类
    class Player(val url: String, val position: Long = 0) : PlayerCmd() {
        fun showUrl() {
            println("$url, $position")
        }
    }

    class Seek(val position: Long) : PlayerCmd() //快进

    object Pause : PlayerCmd() //暂停（无需进行重载的类适合用单例object）
}

//（密封类的子类也可以定义在密封类的外部，但要在同一个文件中）
object Resume : PlayerCmd() //继续

object Stop : PlayerCmd() //停止

enum class PlayerState { //枚举适合表现简单的状态
    IDLE, PAUSE, PLAYING, STOP
}

fun main(args: Array<String>) {
    PlayerCmd.Player("苍茫的天涯").showUrl()
    println(Resume.playerName)
}