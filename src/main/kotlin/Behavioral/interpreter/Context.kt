package Behavioral.interpreter

class Context(private val input:String) {
    fun contains(data:String):Boolean
    {
        return input.contains(data)
    }
}