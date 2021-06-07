package Constructor

class Parent1(name: String) {

    var age = 0;
    var sex = "man"

    //次级构造函数1
    constructor(name: String, age: Int) : this("Main name 1") {
        this.age = age;
        println("constructor 1 $name , $age , $sex")
    }

    //次级构造函数2
    constructor(nickName: String, sex: String) : this("nickName jj", 12) {

        this.sex = sex;
        println("constructor 2 $nickName , $age , $sex")
    }

    open fun learn() {
        println(" learn ")
    }
}

fun main() {
    Parent("lucy", "woman").learn()
}