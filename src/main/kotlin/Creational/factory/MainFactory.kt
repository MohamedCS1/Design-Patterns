package Creational.factory

fun main() {
    println(CurrencyFactory().currency(Country.UnitesStates).code())
    println(CurrencyFactory().currency(Country.UnitesStates).symbol())

    println(CurrencyFactory().currency(Country.Algeria).code())
    println(CurrencyFactory().currency(Country.Algeria).symbol())
}