package Creational.factory

class InvalidCryptoCurrency:CryptoCurrency {
    override fun symbol(): String {
        return "Invalid crypto currency"
    }

    override fun name(): String {
        return "Invalid crypto currency"
    }
}