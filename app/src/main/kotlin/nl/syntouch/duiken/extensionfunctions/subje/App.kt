package nl.syntouch.duiken.extensionfunctions.subje

import nl.syntouch.duiken.extensionfunctions.modulus
import nl.syntouch.duiken.extensionfunctions.syntouch

// watch these extension functions below
fun main() {
    val first = 3;
    val second = 4;
    println(first.syntouch(second))
    println(5.modulus(2))
    println(SyntouchWaiter().calculate(3))
    println("34".parseInt()+5)
    println("Raymond".countVowels())
}

fun String.parseInt(): Int {
    return Integer.parseInt(this)
}

fun SyntouchWaiter.calculate(n: Int) : String {
    return "This is calculated by Syntouch: ${this.waiterNameOfSyntouch} ${n*n}"
}

fun String.countVowels(): Int {
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')

    return count { it in vowels }
}


// simulate bought software from a 3rd party
class SyntouchWaiter {
    val waiterNameOfSyntouch = "SyntouchWaiter is a very good waiter"
    fun foo(): String = "foo"
}