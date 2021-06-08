package nestedClass

/**
 * 内部类范例
 * Created by Over Owen
 * 2021.06.08 16:01
 */
class NestedClassesDemo {
    class Outer {
        private val zero: Int = 0
        val one: Int = 1

        class Nested {
            fun getTwo() = 2
            class Nested1 {
                val three = 3
                fun getFour() = 4
            }
        }
    }
}

fun main(args: Array<String>) {
    val one = NestedClassesDemo.Outer().one
    val two = NestedClassesDemo.Outer.Nested().getTwo()
    val three = NestedClassesDemo.Outer.Nested.Nested1().three
    val four = NestedClassesDemo.Outer.Nested.Nested1().getFour()
    println(one)
    println(two)
    println(three)
    println(four)
}