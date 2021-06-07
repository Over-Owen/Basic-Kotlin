package whenLearn

fun main() {
    val result = when (val response = getResult()) {
        200 -> "Success"
        404 -> "Not Found"
        else -> "unknown"
    }
    println(result)//Success
}
fun getResult(): Int {
    return 200
}