package inherit

interface MyInterface {
    fun bar()
    fun foo() {
        // 可选的方法体
    }
}
class Child : MyInterface {
    override fun bar() {
        // 方法体
    }
}