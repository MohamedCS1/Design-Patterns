package Behavioral.interpreter

interface Expression {
    fun interpret(context:Context):Boolean
}