package singleton

fun distance(x: Double, y: Double): Double {
    val porigin = object {
        var x = 0.0
        var y = 0.0
    }
    return Math.sqrt(
        //勾股定理
        (x - porigin.x) * (x - porigin.x) + (y - porigin.y) * (y - porigin.y)
    )
}

fun main(args: Array<String>) {
    println(distance(5.0, 12.0))
}