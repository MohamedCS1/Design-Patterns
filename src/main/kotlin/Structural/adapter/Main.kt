package Structural.adapter

fun main() {
    val employee = SimpleEmployee("Ahmed" ,2500.0)

    val taxCalculator = TaxCalculator()

    println(taxCalculator.taxCalculator(employee))

    val taxCalculatorAdapter = TaxCalculatorAdapter()

    val boss = Boss("Mohamed" ,998765.0)

    println(taxCalculatorAdapter.taxCalculator(boss))
}