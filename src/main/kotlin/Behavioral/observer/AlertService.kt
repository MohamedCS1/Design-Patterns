package Behavioral.observer

class AlertService:StockPriceObserver {
    override fun onStockPriceChanged(stock: Stock) {
        if (stock.price < 100) {
            println("ALERT: ${stock.symbol} price has dropped below 100!")
        }
    }
}