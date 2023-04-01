package Creational.factory

class UnitedStatesDollar:Currency {
    override fun symbol(): String {
        return "$"
    }

    override fun code(): String {
        return "USD"
    }
}