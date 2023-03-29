package Behavioral.state

class Canvas {

    private lateinit var currentTool: Tool

    fun mouseUp()
    {
        currentTool.mouseUp()
    }

    fun mouseDown()
    {
        currentTool.mouseDown()
    }

    fun setCurrentTool(tool: Tool)
    {
        this.currentTool = tool
    }

    fun getCurrentTool(): Tool
    {
        return this.currentTool
    }
}