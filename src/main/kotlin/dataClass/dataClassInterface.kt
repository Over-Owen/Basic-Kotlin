package dataClass

/**
 * 数据类实现接口
 * Created by Over Owen
 * 2021.06.08 15:39
 */
open class DBase
interface IBaseA
interface IBaseB
data class LoginUser(val name: String, val password: String) : DBase(), IBaseA, IBaseB {
    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun toString(): String {
        return super.toString()
    }

    fun validate(): Boolean {
        return true
    }
}

fun main(args: Array<String>) {
    val loginUser1 = LoginUser("Admin", "123456")
    println(loginUser1.component1())        //name
    println(loginUser1.component2())        //password
    println(loginUser1.name)
    println(loginUser1.password)
    println(loginUser1.hashCode())          //hashCode
    println(loginUser1.toString())          //内存地址
}