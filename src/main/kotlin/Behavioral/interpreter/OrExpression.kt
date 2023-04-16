package Behavioral.interpreter

class OrExpression(private val expression1: Expression, private val expression2: Expression) : Expression {
    override fun interpret(context: Context): Boolean {
        return expression1.interpret(context) || expression2.interpret(context)
    }
}