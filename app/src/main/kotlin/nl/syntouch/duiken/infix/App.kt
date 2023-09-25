package nl.syntouch.duiken.infix

import nl.syntouch.utils.Assert.Companion.assertTrue

fun main() {
    // Given
    val person = Person()
    val beer = Beer("Grolsch")

    // When
    person drinks beer

    // Then
    assertTrue(person.beerList.contains(Beer("Grolsch")))

    person drinks Beer("Hertog Jan")
    assertTrue(person.beerList.contains(Beer("Hertog Jan")))
    assertTrue(person.beerList.contains(Beer("Grolsch")))
}


data class Beer (val name: String)

class Person {
    val beerList = mutableListOf<Beer>()

    infix fun drinks(beer: Beer) {
        this.beerList.add(beer)
    }
}