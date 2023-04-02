package Creational.factory

class Dogecoin:CryptoCurrency {
    override fun symbol(): String {
        return "D"
    }

    override fun name(): String {
        return "DogeCoin"
    }
}