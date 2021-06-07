package inherit

interface Interface1 {
    open fun read() {
        println("read")
    }
}

open class Parent() {
    fun sleep() {
        println("sleep")
    }
}

class Son() : Parent(), Interface1 {
    fun write() {
        println("son write")
    }
}

fun main() {
    Son().write()
}