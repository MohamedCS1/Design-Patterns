package Behavioral.observer

class User(val name:String):StockPriceObserver {
    override fun onStockPriceChanged(stock: Stock) {
        println("$name: ${stock.symbol} price has changed to ${stock.price}")
    }
}