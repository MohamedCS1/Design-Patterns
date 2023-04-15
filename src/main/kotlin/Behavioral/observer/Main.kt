package Behavioral.observer

fun main() {
    val apple = Stock("AAPL", 150.0)
    val google = Stock("GOOG", 900.0)

    val user1 = User("Alice")
    val user2 = User("Bob")
    val alertService = AlertService()

    apple.attach(user1)
    apple.attach(user2)
    apple.attach(alertService)

    google.attach(user1)
    google.attach(alertService)

    apple.updatePrice(160.0)
    google.updatePrice(1000.0)
    apple.updatePrice(140.0)
    apple.updatePrice(90.0)
    google.updatePrice(80.0)
}