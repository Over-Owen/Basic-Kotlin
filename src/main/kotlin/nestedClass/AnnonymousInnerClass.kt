package nestedClass

class AnnonymousInnerClass {
    class AnonymousInnerClassDemo {
        var isRunning = false
        fun doRun() {
            Thread(object : Runnable {        //线程
                override fun run() {
                    isRunning = true
                    println("doRun : I am running, isRunning = $isRunning")
                }
            }).start()
        }
    }
}

fun doStop() {
    var isRunning = true
    Thread({
        isRunning = false
        println("doStop: i am not running, isRunning = $isRunning")
    }).start()
}

fun doWait() {
    var isRunning = true
    val wait = Runnable {
        isRunning = false
        println("doWait: i am waiting, isRunning = $isRunning")
    }
    Thread(wait).start()
}

fun doNotify() {
    var isRunning = true
    val wait = {
        isRunning = false
        println("doNotify: i notify, isRunning = $isRunning")
    }
    Thread(wait).start()
}

