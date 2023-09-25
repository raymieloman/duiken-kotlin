package nl.syntouch.duiken.scopefunctions

import nl.syntouch.duiken.destructuring.Wine

/*
this demo shows the scope functions in action
 */
fun main() {
    val wine: Wine? = null
    drinkWine(wine)
}

fun drinkWine(w: Wine?) {
    w?.let {
        println(it.name)
    }

    with(w) {
        this?.name = "Name"
    }

    // for testing
    run {
        val a = 3
    }
    run {
        val a = 5
    }

    val w2 = Wine("White", 10.0, 1972).apply {
        this.name = "White wine"
    }.also { println("Lekker dit") }
}