package Creational.factoryAndAbstractFactory

class CurrencyFactory:CurrencyMethods {
    override fun currency(country: Country): Currency {
        when (country)
        {
            Country.Spain ,Country.Greece -> return Euro()
            Country.UnitesStates -> return UnitedStatesDollar()
            Country.Algeria -> return DinarAlgerian()
            else -> {
              return InvalidCurrency()
            }
        }
    }

    override fun cryptoCurrency(name: CryptoCurrencyNames): CryptoCurrency {
        when (name)
        {
            CryptoCurrencyNames.BITCOIN -> return Bitcoin()
            CryptoCurrencyNames.DOGE -> return Dogecoin()
            else -> {
                return InvalidCryptoCurrency()
            }
        }
    }
}