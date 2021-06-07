package singleton

import java.text.SimpleDateFormat
import java.util.*

class AdminUser {
    val username: String = "admin"
    val password: String = "admin"
    fun getTimestamp() = SimpleDateFormat("yyyyMMddHHmmss").format(Date())
    fun md5Password() = EncoderByMd5(password + getTimestamp())
}

class EncoderByMd5(s: String) {

}
