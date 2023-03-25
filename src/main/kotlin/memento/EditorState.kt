package memento

class EditorState(private val content: String) {

    fun getContent():String
    {
        return content
    }
}