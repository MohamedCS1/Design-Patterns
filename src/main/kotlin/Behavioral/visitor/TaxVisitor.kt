package Behavioral.visitor

class TaxVisitor:Visitor {
    override fun visit(book: BookElement) {
        book.price *= 1.1
    }

    override fun visit(fruit: FruitElement) {
        fruit.weight *= 1.05
    }
}