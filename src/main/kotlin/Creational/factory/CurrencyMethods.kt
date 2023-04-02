package Creational.factory

interface CurrencyMethods {
    fun currency(country: Country):Currency
    fun cryptoCurrency(name:CryptoCurrencyNames):CryptoCurrency
}