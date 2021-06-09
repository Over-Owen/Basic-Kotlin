package varAndval
/**
 * getter和 setter方法
 * Created by Over Owen
 * 2021.06.09 09:30
 */
class User {
    var name = "Mike"
        get() {
            return field + " nb"
        }
        set(value) {
            field = "Cute " + value
        }
    val age = 18
    get() {
        return field + 10
    }
}

fun main(args: Array<String>) {
    val user1 = User()
    //get方法获取到的是  field + “ nb”
    println(user1.name)
    //set方法赋值的是  "Cute " + "Lily"
    user1.name = "Lily"
    //get方法获取到的是  field + “ nb”     field = Cute Lily
    println(user1.name)
    //age作为val只读变量，再取值时仍然可能被修改   18 ---> 28
    println(user1.age)
}