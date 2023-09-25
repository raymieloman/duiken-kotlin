package nl.syntouch.duiken.extensionfunctions

fun Int.syntouch(m: Int): Int {
    return if (this > m) this else m
}

fun Int.modulus(a: Int) = this % a