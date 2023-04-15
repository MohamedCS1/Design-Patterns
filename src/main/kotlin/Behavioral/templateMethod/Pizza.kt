package Behavioral.templateMethod

abstract class Pizza {
    private fun bakePizza()
    {
        println("Baking Pizza....")
    }

    protected abstract fun definePizzaShape()

    protected abstract fun thePizzaIsReady()

    private fun putAddons()
    {
        println("Putting Pizza Addons....")
    }

    private fun heatPizza()
    {
        println("Heating Pizza....")
    }

    fun makePizza()
    {
        bakePizza()
        definePizzaShape()
        putAddons()
        heatPizza()
        thePizzaIsReady()
    }
}