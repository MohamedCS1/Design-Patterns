package Behavioral.templateMethod

fun main() {
    val roundedPizza = RoundedPizza()
    val rectanglePizza = RectanglePizza()

    roundedPizza.makePizza()
    println("-----------------------------")
    rectanglePizza.makePizza()
}