package nl.syntouch.duiken.jvmstatic


fun main() {
    println(Flesje.duiken)
    val s = Flesje()
}

class Flesje {
    companion object GlasFles {
        var duiken: Int  = 3
    }
}