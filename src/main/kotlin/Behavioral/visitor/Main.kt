package Behavioral.visitor

fun main() {
    val elements = arrayListOf<Element>(
        BookElement("Zero to One", 20.0),
        FruitElement("Apple", 1.5),
        FruitElement("Banana", 2.0)
    )

    val taxVisitor = TaxVisitor()
    val discountVisitor = DiscountVisitor()

    // Elements before visitor
    for (element in elements)
    {
        if (element is BookElement) println((element as BookElement))
        else println((element as FruitElement))
    }

    for (element in elements) {
        element.accept(taxVisitor)
        element.accept(discountVisitor)
    }

    println("---------------------")

    // Elements after visitor
    for (element in elements)
    {
        if (element is BookElement) println((element as BookElement))
        else println((element as FruitElement))
    }

}