package Creational.factory

class Euro:Currency {
    override fun symbol(): String {
        return "€"
    }

    override fun code(): String {
        return "EUR"
    }
}