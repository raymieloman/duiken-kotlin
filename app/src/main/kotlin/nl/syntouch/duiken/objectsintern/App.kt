package nl.syntouch.duiken.objectsintern

import nl.syntouch.utils.Assert.Companion.assertEquals

object Water {
    var aantalVissen = 450000000
}


// object names should start with uppercase
object Solar {
    private val solarName = "solar system"

    fun ppSolar() {
        Earth.pp()
//        println(earth.earthName); //ok when Earth.earthName is public, fails if private
    }
    object Earth {
        private val earthName: String = "earth"
        fun pp() {
            println(earthName)
            println(solarName)
        }
    }
}

fun main() {
    assertEquals(450000000, Water.aantalVissen)
}