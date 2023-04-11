package Structural.flyWeight

class CurrencyService {

    val listCurrencies = hashMapOf<CurrencyName ,Currency>()

    fun getCurrency(currencyName: CurrencyName):Currency
    {
        if (listCurrencies.containsKey(currencyName))
        {
            return listCurrencies[currencyName]!!
        }
        else
        {
            when(currencyName)
            {
                CurrencyName.DINAR -> {
                    listCurrencies[currencyName] = Dinar()
                    return Dinar()
                }
                CurrencyName.DOLLAR -> {
                    listCurrencies[currencyName] = Dollar()
                    return Dollar()
                }
                CurrencyName.EURO -> {
                    listCurrencies[currencyName] = Euro()
                    return Euro()
                }
                else -> {
                    listCurrencies[currencyName] = InvalidCurrency()
                    return InvalidCurrency()
                }
            }
        }
    }
}