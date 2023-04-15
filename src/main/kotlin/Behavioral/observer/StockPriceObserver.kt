package Behavioral.observer

interface StockPriceObserver {
    fun onStockPriceChanged(stock:Stock)
}