package inherit

interface InputDevice {
    fun input(event: Any)
}

interface USBInputDevice : InputDevice

interface BLEInputDevice : InputDevice

abstract class USBMouse(private val name: String): USBInputDevice{
    override fun input(event: Any) {

    }

    override fun toString(): String {
        return name
    }
}
class LogitechMouse : USBMouse("罗技鼠标"){

}

class Computer {
    fun addUSBInputDevice(inputDevice: USBInputDevice) {
        println("add USB Input Device : $inputDevice")
    }

    fun addBLEInputDevice(inputDevice: BLEInputDevice){
        println("add ble Input Device : $inputDevice")
    }
}

fun main() {
    val computer = Computer()
    val mouse = LogitechMouse()
    computer.addUSBInputDevice(mouse)
}
