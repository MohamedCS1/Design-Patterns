package state

class BrushTool:Tool {
    override fun mouseUp() {
        println("Brush icon")
    }

    override fun mouseDown() {
        println("Draw a line")
    }
}