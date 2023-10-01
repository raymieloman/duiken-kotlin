package nl.syntouch.duiken.dataobjects

/*
a data object has a friendly toString, it prints the simpleName of the class (in the case Sun)
 */
fun main() {
    println(Sun)
    println(Sun.name)
    println(Moon)
    println(Moon.name)
}


data object Sun {
    var name: String = "Raymond"
}

object Moon {
    val name = "Moon"
}