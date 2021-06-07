package functionTest

import java.lang.IllegalArgumentException

fun main(args: Array<String>) {
    println(" START " + ::main.name)
    fail("我是msg")
}

fun fail(msg: String): Nothing {
    throw IllegalArgumentException(msg)
}

class ThisDemo {
    val thisis = "THIS IS"
    fun whatIsThis(): ThisDemo {
        println(this.thisis) //引用变量
        this.howIsThis()// 引用成员函数
        return this // 返回此类的引用
    }

    fun howIsThis() {
        println("HOW IS THIS ?")
    }
}
