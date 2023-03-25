package memento

fun main() {
    val editor = Editor()
    val history = History()

    editor.setContent("a")
    history.push(editor.createState())

    editor.setContent("b")
    history.push(editor.createState())

    editor.setContent("c")
    editor.restore(history.pop())

    println(editor.getContent())

}