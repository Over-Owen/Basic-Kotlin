package expand

/**
 * 扩展属性
 */

class Snake {
    var aaa = 1
}

var Snake.over: Int
    set(value) {
        aaa = value
    }
    get() = aaa + 1

fun main(args: Array<String>) {
    val snake = Snake()
    println(snake.over)
    snake.over = 3
    println(snake.over)
}
