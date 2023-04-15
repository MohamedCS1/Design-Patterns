package Behavioral.templateMethod

class RoundedPizza:Pizza() {
    override fun definePizzaShape() {
        println("Making the pizza rounded...")
    }

    override fun thePizzaIsReady() {
        println("The rounded pizza is ready")
    }
}