package nl.syntouch.duiken.arrays

fun main() {
    val numbers = arrayOf(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89)

    numbers[10] = 1024
    println(numbers[10])

    numbers[15] = 4096 // dit werkt niet want array is fixed length

}