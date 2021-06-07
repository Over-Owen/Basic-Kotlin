package expand

open class C
class D : C()

fun C.foo() = "ccc"   // 扩展函数 foo
fun D.foo() = "ddd"   // 扩展函数 foo
fun printFoo(c: C) {
    println(c.foo())  // 类型是 C 类
}

fun main(arg: Array<String>) {
    printFoo(D())
}