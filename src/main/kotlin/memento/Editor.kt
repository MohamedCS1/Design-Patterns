package memento

class Editor {
    private var content:String = ""

    fun getContent():String
    {
        return content
    }

    fun setContent(content:String)
    {
        this.content = content
    }
    fun createState():EditorState
    {
        return EditorState(content)
    }

    fun restore(state: EditorState)
    {
        content = state.getContent()
    }
}