package Behavioral.memento

fun main() {
    val editor = Editor()
    val history = History()

    editor.setContent(Content("a" ,"content a"))
    history.push(editor.createState())

    editor.setContent(Content("b" ,"content b"))
    history.push(editor.createState())

    editor.setContent(Content("c" ,"content c"))
    editor.restore(history.pop())

    println(editor.getContent().title)
    println(editor.getContent().content)


}