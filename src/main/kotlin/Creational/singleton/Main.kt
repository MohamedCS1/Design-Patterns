package Creational.singleton

fun main() {

    val counter = Counter

    counter.addOne()

    println(counter.printCurrentValueCounter())

    val counterA = Counter

    counterA.addOne()

    println(counterA.printCurrentValueCounter())
}