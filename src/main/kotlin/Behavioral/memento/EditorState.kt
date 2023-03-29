package Behavioral.memento

class EditorState(private val content: Content) {

    fun getContent(): Content
    {
        return content
    }
}