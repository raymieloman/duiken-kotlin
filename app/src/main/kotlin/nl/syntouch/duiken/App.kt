/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package nl.syntouch.duiken

fun main() {

    var name:String? = "Kevin"

    name = null

    val names:List<String> = listOf("Raymond", "Poedel")

    for (name in names) {
        println(name!!.length)
    }




}
