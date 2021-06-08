package inheritClass

/**
 * 面向对象简单继承使用 super关键字理解
 * 工厂方法模式理解
 *
 * Created by Over Owen
 * 2021.06.08 15:10
 */
open class Person() {

     open fun eat(){
        println("直接吃东西")
    }
    open fun run(){
        println("走路")
    }
    fun play(){
        println("玩手机")
    }
}
class Worker:Person(){
    override fun eat() {
        //不加super关键字，不调用父类方法
        println("用勺子吃")
    }

    override fun run() {
        //加了super关键字，调用父类方法，再继续
        super.run()
        println("骑自行车")
    }
    fun sleep(){
        println("躺着睡")
    }
}

fun main(args: Array<String>) {
    val worker1 = Worker()
    val worker2:Person = Worker()

    worker1.eat()
    worker1.run()
    worker1.sleep()
    worker1.play()
    println("=====================")
    worker2.eat()
    worker2.run()
//    worker2.//没有sleep方法
    worker2.play()

}