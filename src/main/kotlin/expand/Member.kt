package expand

class DDDDDD {
    fun bar() {
        println("D bar")
    }
//    fun baz() {
//        println("D baz")
//    }
}

class CCCCCC {
    fun baz() {
        println("C baz")
    }
    fun bar() {
        println("C bar")
    }

    fun DDDDDD.foo() {
        bar()   // 调用 D.bar
        baz()   // 调用 C.baz
    }

    fun caller(d: DDDDDD) {
        d.foo()   // 调用扩展函数
    }
}

fun main(args: Array<String>) {
    val c: CCCCCC = CCCCCC()
    val d: DDDDDD = DDDDDD()
    c.caller(d)

}