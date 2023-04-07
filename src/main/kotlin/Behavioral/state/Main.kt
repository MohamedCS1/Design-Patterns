package Behavioral.state

fun main() {
    val canvas = Canvas()

    canvas.setCurrentTool(SelectionTool())
    canvas.mouseUp()
    canvas.mouseDown()

    println()

    canvas.setCurrentTool(BrushTool())
    canvas.mouseUp()
    canvas.mouseDown()
}