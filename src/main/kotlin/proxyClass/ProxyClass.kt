package proxyClass

import java.rmi.server.LogStream.log
import java.util.*

interface Subject {
    fun hello()
}
//RealSubject类实现Subject接口，主构造函数中传入name参数
class RealSubject(val name: String) : Subject {
    //重写Subject接口中的hello方法
    override fun hello() {
        //获取当前时间
        val now = Date()
        //打印当前时间
        println("Hello, REAL $name! Now is  $now")
    }
}
//ProxySubject类，主构造函数中传入sb:Subject对象，委托给sb对象，实现Subject接口中的方法
class ProxySubject(val sb: Subject) : Subject by sb {
    //重写Subject接口中的hello方法
    override fun hello() {
        //打印当前时间
        println("Before ! Now is  ${Date()}")
        //sb代理接口中的hello方法
        sb.hello()
        //打印当前时间
        println("After ! Now is  ${Date()}")
    }
}

fun main(args: Array<String>) {
    val subject = RealSubject("Wwwwworld")
    subject.hello()
    println("-----------------------------------------------")
    val proxySubject = ProxySubject(subject)
    proxySubject.hello()
    log("123123123123123132123123")
}