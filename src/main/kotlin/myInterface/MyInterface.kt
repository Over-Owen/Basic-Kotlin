package myInterface

interface MyInterface {
    var name:String
    fun bar()
    fun sleep(){

    }
}
class Dog: MyInterface{
    override var name: String
        get() = "旺旺"
        set(value) {}
    override fun bar() {
        println("wangwangwang")
    }

    override fun sleep() {
        super.sleep()
        println("huhuhu")
    }
}

fun main(args: Array<String>) {
    var dog1 = Dog()
    println(dog1.name)
    dog1.bar()
    dog1.sleep()
}