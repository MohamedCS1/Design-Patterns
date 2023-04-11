package Structural.flyWeight

fun main() {

    val currencyService = CurrencyService()

    println(currencyService.getCurrency(CurrencyName.EURO))

    if (currencyService.getCurrency(CurrencyName.EURO) == currencyService.getCurrency(CurrencyName.EURO))
    {
        println("new objects in the same memory address mean I reuse the existing objects")
    }
}