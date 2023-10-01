package nl.syntouch.duiken.destructuring

import nl.syntouch.utils.Assert.Companion.assertEquals

data class Person(val name: String, val address: String)




fun main() {
    val person = Person("Raymond", "Almelo")

    // destructuring declarations
    val (a, b) = person

    assertEquals("Raymond", a)
    assertEquals("Almelo", b)

//    val (aWine: String,bWine: Int) = Wine() // add component
    val (c, d) = Pair("c", "d")
    val (e, f, g) = Triple("e", "f", "g")

    assertEquals("Raymond", person.component1())
    assertEquals("Almelo", person.component2())


}