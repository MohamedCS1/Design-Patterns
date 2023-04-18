package Behavioral.visitor

class FruitElement(val name:String, var weight:Double):Element {
    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
    override fun toString(): String {
        return "$name / $weight"
    }
}