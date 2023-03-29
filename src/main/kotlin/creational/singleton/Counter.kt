package creational.singleton

object Counter {
    var counter = 0

    fun addOne()
    {
        counter++
    }

    fun printCurrentValueCounter():String
    {
        return counter.toString()
    }
}