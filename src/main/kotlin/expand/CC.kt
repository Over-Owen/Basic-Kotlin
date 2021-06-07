package expand

class CC {
    fun foo() { println("成员函数") }
}

fun CC.foo() { println("扩展函数") }

fun main(arg:Array<String>){
    var c = CC()
    c.foo()
}