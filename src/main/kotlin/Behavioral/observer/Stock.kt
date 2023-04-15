package Behavioral.observer

data class Stock(val symbol:String, var price:Double) {
    private val observers = mutableListOf<StockPriceObserver>()

    fun attach(observer: StockPriceObserver)
    {
        observers.add(observer)
    }

    fun detach(observer: StockPriceObserver)
    {
        observers.remove(observer)
    }

    fun updatePrice(price: Double)
    {
        this.price = price
        notifyObservers()
    }

    private fun notifyObservers()
    {
        observers.forEach{
            it.onStockPriceChanged(this)
        }
    }
}