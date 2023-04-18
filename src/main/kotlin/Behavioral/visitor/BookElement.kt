package Behavioral.visitor

class BookElement(val name:String, var price:Double):Element {
    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }

    override fun toString(): String {
        return "$name / $price"
    }
}