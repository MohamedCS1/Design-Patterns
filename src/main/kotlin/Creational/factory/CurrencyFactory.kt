package Creational.factory

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
}