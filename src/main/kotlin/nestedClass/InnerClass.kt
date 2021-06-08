package nestedClass

/**
 * 内部类调用外部类属性
 * Created by Over Owen
 * 2021.06.08 16:09
 */
class InnerClass {
    class Outer {
        private val zero: Int = 0
        val one: Int = 1

        inner class Nested {            //需要在最前面加inner修饰
            fun getTwo() = 2
            fun accessOuter() = {
                println(zero) // 不加inner修饰 否则就：error, cannot access outer class
                println(one)  // 不加inner修饰 否则就：error, cannot access outer class
            }
        }
    }
}

fun main(args: Array<String>) {
    InnerClass.Outer().Nested().accessOuter()
}