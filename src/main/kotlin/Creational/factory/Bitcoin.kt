package Creational.factory

class Bitcoin:CryptoCurrency {
    override fun symbol(): String {
        return "B"
    }

    override fun name(): String {
        return "Bitcoin"
    }
}