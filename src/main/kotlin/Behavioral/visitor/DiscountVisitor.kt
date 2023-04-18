package Behavioral.visitor

class DiscountVisitor:Visitor {
    override fun visit(book: BookElement) {
        book.price *= 0.9
    }

    override fun visit(fruit: FruitElement) {
        fruit.weight *= 0.95
    }
}