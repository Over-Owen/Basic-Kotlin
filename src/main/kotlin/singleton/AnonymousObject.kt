package singleton

fun distance(a: Double, b: Double): Double {
    val porigin = object {
        var a = 0.0
        var b = 0.0
    }
    return Math.sqrt(
        //勾股定理
        (a - porigin.a) * (a - porigin.a) + (b - porigin.b) * (b - porigin.b)
    )
}

fun main(args: Array<String>) {
    println(distance(5.0, 12.0))
}