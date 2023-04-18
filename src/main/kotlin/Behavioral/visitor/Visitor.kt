package Behavioral.visitor

interface Visitor {
    fun visit(book:BookElement)
    fun visit(fruit:FruitElement)
}