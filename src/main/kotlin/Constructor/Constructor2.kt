package Constructor

class Parent2(name: String) {

    var age = 30;
    var sex = "man"

    constructor(name:String, age: Int,sex: String) : this("Main name 1") {

        println("constructor 1 $sex , $age , $sex")
    }

    constructor(name: String,address: String, sex: String) : this("Main name 2",12,"female") {
        println("constructor 2 $address , $age , $sex")
    }

    open fun learn() {
        println(" learn ")
    }
}

fun main() {
    Parent2("Tom",20,"tom").learn()

}