package Creational.factory

fun main() {
    println(CurrencyFactory().currency(Country.UnitesStates).code())
    println(CurrencyFactory().currency(Country.UnitesStates).symbol())

    println(CurrencyFactory().currency(Country.Algeria).code())
    println(CurrencyFactory().currency(Country.Algeria).symbol())

    println(CurrencyFactory().currency(Country.UK).code())
    println(CurrencyFactory().currency(Country.UK).symbol())

    println(CurrencyFactory().cryptoCurrency(CryptoCurrencyNames.BITCOIN).name())
    println(CurrencyFactory().cryptoCurrency(CryptoCurrencyNames.BITCOIN).symbol())

    println(CurrencyFactory().cryptoCurrency(CryptoCurrencyNames.DOGE).name())
    println(CurrencyFactory().cryptoCurrency(CryptoCurrencyNames.DOGE).symbol())

    println(CurrencyFactory().cryptoCurrency(CryptoCurrencyNames.DZCOIN).name())
    println(CurrencyFactory().cryptoCurrency(CryptoCurrencyNames.DZCOIN).symbol())

}