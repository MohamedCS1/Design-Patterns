package Creational.factoryAndAbstractFactory

interface CurrencyMethods {
    fun currency(country: Country):Currency
    fun cryptoCurrency(name:CryptoCurrencyNames):CryptoCurrency
}