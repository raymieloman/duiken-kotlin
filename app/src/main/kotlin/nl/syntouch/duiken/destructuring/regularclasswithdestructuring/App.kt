package nl.syntouch.duiken.destructuring.regularclasswithdestructuring

import nl.syntouch.utils.Assert

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
    // <.>If you want your class to be able to destructured add componentN methods to the class
    val (name, percentage, year) = Wine("RedWine", 12.2, 1968)
    Assert.assertEquals("RedWine", name)
    Assert.assertEquals(12.2, percentage)
    Assert.assertEquals(1968, year)
}
