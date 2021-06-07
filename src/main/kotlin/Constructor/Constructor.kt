package Constructor

class Parent(name: String,) {
    var age = 18
    var sex = "male"
    var address = "Beijing"

    constructor(name: String, age: Int) : this("Main name 1","female","nanjing") {
        this.age = age
        println("constructor 1 $name, $age, $sex")
    }

    constructor(nickName: String, sex: String, address: String) : this("Main name 2") {
        this.sex = sex;
        println("constructor 2 $nickName , $age , $sex,$address")
    }

    constructor(nickName: String, address: String) : this("Main name 3",12) {
        this.sex = sex;
        println("constructor 3 $nickName ,  $address")
    }

    fun learn() {
        println(" learn ")
    }
}

fun main() {
    Parent("Tom", 19).learn()
    Parent("Lucy", "Beijing",).learn()
}