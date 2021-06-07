package expand

/**
 * 扩展函数
 */
class Dog {

    fun showName() {
        print("Dog")
    }
}

fun Dog.showName(name: String) {
    print("Cat")
}

fun main(args: Array<String>) {
    Dog().showName("随意反正不输出")
}