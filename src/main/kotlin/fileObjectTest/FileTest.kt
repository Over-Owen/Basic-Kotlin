package fileObjectTest

import java.io.File

/**
 * 文件字符串读取测试
 * kotlin单例模式
 */
class DataProcessor {
    fun process() {
        println("Process Data")
    }

    object FileUtils {
        val userHome = "/Users/jack/"
        fun getFileContent(file: String): String {
            var content = ""
            val f = File(file)
            f.forEachLine { content = content + it + "\n" }
            return content
        }
    }
}

fun main(args: Array<String>) {
//    DataProcessor.FileUtils.userHome // /Users/jack/
    println(DataProcessor.FileUtils.userHome)
//    DataProcessor.FileUtils.getFileContent("fileObjectTest.txt") // 输出文件的内容
    println(DataProcessor.FileUtils.getFileContent("fileObjectTest.txt"))
}