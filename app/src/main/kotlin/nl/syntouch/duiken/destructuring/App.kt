package nl.syntouch.duiken.destructuring

import nl.syntouch.utils.Assert.Companion.assertEquals

data class Person(val name: String, val address: String)

class Wine(
    var name: String,
    val alcoholPercentage: Double,
    val year: Int
) {


    operator fun component1(): String {
        return name
    }

    operator fun component2(): Double {
        return alcoholPercentage
    }

    operator fun component3(): Int {
        return year
    }
}


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

    // if you want your class to be able to destructured add componentN to the class
    val (name, percentage, year) = Wine("RedWine", 12.2, 1968)
    assertEquals("RedWine", name)
    assertEquals(12.2, percentage)
    assertEquals(1968, year)
}