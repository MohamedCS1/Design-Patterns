package state

class SelectionTool:Tool {
    override fun mouseUp() {
        println("Selection icon")
    }

    override fun mouseDown() {
        println("Draw a rectangle")
    }
}