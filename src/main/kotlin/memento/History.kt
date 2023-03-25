package memento

import java.util.Stack

class History {
    val states = Stack<EditorState>()

    fun push(state:EditorState)
    {
        states.push(state)
    }

    fun pop():EditorState
    {
        return states.pop()
    }
}