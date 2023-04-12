package Structural.composite

class Container(override val name: String = "Container" ,val children:MutableList<Component>) :Component {
    fun printChildren()
    {
        children.forEach{
            child -> println("Container has ${child.name}")
        }
    }
}