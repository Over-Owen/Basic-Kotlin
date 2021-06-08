package singleton

class AnonymousObjectType { // 私有函数，返回的是匿名object类型
    private fun privateFoo() = object {
        val x: String = "x"
    }

    // 公有函数，返回的类型是 Any
    fun publicFoo() = object {
        val x: String = "x"          // 无法访问到
    }

    fun test() {
        val x1 = privateFoo().x     // Works
        //val x2 = publicFoo().x // ERROR: Unresolved reference 'x'
    }
}

fun main(args: Array<String>) {
    /**
     *
    AnonymousObjectType().publicFoo().x     //报错: Unresolved reference 'x'

    */
}