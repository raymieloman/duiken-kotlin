package nl.syntouch.duiken.objects

fun main() {
    logger.log("It rocks!")

//    val l = logger() // error, since logger is an object (singleton)
}

object logger {
    fun log(message: String) {
        println(message)
    }
}