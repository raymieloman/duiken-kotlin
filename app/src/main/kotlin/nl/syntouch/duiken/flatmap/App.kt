package nl.syntouch.duiken.flatmap


// this shows flatMap in action
/*
It makes a list of three words. Then per word it makes a list of it in the closure en flatMaps it one single dimension charList
 */
fun main() {
    val words = listOf("apple", "banana", "cherry")
    val letters = words.flatMap { it.toList() }
// letters: [a, p, p, l, e, b, a, n, a, n, a, c, h, e, r, r, y]

    println(letters)
}