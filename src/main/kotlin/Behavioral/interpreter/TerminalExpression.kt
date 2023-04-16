package Behavioral.interpreter

class TerminalExpression(private val data:String):Expression {
    override fun interpret(context: Context): Boolean {
        return context.contains(data)
    }
}