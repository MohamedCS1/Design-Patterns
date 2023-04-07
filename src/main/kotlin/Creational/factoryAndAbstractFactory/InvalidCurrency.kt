package Creational.factoryAndAbstractFactory

class InvalidCurrency:Currency {
    override fun symbol(): String {
        return "Invalid Currency"
    }

    override fun code(): String {
        return "Invalid Currency"
    }
}