package Behavioral.templateMethod

class RectanglePizza:Pizza() {
    override fun definePizzaShape() {
        println("Making the rectangle pizza...")
    }

    override fun thePizzaIsReady() {
        println("The rectangle pizza is ready")
    }
}