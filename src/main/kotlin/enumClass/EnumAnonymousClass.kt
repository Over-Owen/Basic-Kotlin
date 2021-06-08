package enumClass

/**
 * 枚举类中的实现匿名类
 */
enum class EnumAnonymousClass {
    onCreate {
        override fun signal() = onStart
    },
    onStart {
        override fun signal() = onStop
    },
    onStop {
        override fun signal() = onStart
    },
    onDestroy {
        override fun signal() = onDestroy
    };

    abstract fun signal(): EnumAnonymousClass
}

fun main(args: Array<String>) {
    val s = EnumAnonymousClass.onCreate
    println(s.signal())
}
