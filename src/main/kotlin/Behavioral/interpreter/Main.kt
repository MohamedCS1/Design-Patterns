package Behavioral.interpreter


fun main() {
    val context = Context("This is a test string")

    val expression1 = TerminalExpression("test")
    val expression2 = TerminalExpression("foo")
    val expression3 = TerminalExpression("string")

    val orExpression = OrExpression(expression1, expression2)
    val andExpression = AndExpression(orExpression, expression3)

    println(orExpression.interpret(context))
}