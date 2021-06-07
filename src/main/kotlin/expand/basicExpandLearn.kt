package expand

val <T> List<T>.lastIndex: Int get() = size - 1
fun String.notEmpty(): Boolean {
    return !this.isEmpty()
}

//fun MutableList<Int>.swap(index1: Int, index2: Int) {
//    val tmp = this[index1] // this对应该列表m
//    this[index1] = this[index2]
//    this[index2] = tmp
//}

fun <T> MutableList<T>.mswap(index1: Int, index2: Int) {
    val tmp = this[index1] // “this”对应该列表
    this[index1] = this[index2]
    this[index2] = tmp
}

class ExtensionsDemo {
    fun useExtensions() {
        val a = "abc"
        println(a.notEmpty())       //true
        val mList = mutableListOf<Int>(1, 2, 3, 4, 5)
        println("Before Swap:")
        println(mList)              //[1, 2, 3, 4, 5]
        mList.swap(0, mList.size - 1)
        println("After Swap:")
        println(mList)              //[5, 2, 3, 4, 1]
        val mmList = mutableListOf<String>("a12", "b34", "c56", "d78")
        println("Before Swap:")
        println(mmList)             //[a12, b34, c56, d78]
        mmList.mswap(1, 2)
        println("After Swap:")
        println(mmList)             //[a12, c56, b34, d78]
        val mmmList = mutableListOf<Int>(100, 200, 300, 400, 500)
        println("Before Swap:")
        println(mmmList)
        mmmList.mswap(0, mmmList.lastIndex)
        println("After Swap:")
        println(mmmList)            //[100, 200, 300, 400, 500]
    }

    class Inner {
        fun useExtensions() {
            val mmmList = mutableListOf<Int>(100, 200, 300, 400, 500)
            println("=============================")
            println(mmmList.lastIndex)
        }
    }
}

fun main(args: Array<String>) {
    val demo = ExtensionsDemo()
    demo.useExtensions()
    val demo2 = ExtensionsDemo.Inner()
    demo2.useExtensions()
    println("=================================================")
    var a: String = "abc"
    var b: String = "abc"
    println(a.equals(b))
    val l = 1L + 3 // Long + Int => Long
    println("=================================================")
    val x = (63 shr 2)
    println(x)
    println('b'-1)              //   a
    var a1 = 'a'                //  b不能在字符的字面量上直接使用++
    println(++a1)               //   b
    println("abcdef".subSequence(0,4))
}