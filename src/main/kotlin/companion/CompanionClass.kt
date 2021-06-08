package companion

class ClassB {
    companion object {
        fun create(): ClassB = ClassB()
        fun get() = "Hi, I am CompanionB"
    }
}

class ClassC {
    var index = 0
    fun get(index: Int): Int {
        return 0
    }

    companion object CompanyC {
        fun create(): ClassC = ClassC()
        fun get() = "Hi, I am CompanyC"
    }
}

interface BeanFactory<T> {
    fun create(): T
}
class MyClass {
    companion object : BeanFactory<MyClass> {
        override fun create(): MyClass {
            println("MyClass Created!")
            return MyClass()
        }
    }
}