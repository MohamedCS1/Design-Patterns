package Behavioral.memento

class Editor {
    private lateinit var content: Content

    fun getContent(): Content
    {
        return content
    }

    fun setContent(content: Content)
    {
        this.content = content
    }

    fun createState(): EditorState
    {
        return EditorState(content)
    }

    fun restore(state: EditorState)
    {
        content = state.getContent()
    }
}