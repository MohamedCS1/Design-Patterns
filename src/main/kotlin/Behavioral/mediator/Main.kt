package Behavioral.mediator

fun main() {
    val mediator = ConcreteMediator()
    val colleague1 = ConcreteColleague1(mediator)
    val colleague2 = ConcreteColleague2(mediator)

    mediator.setColleague1(colleague1)
    mediator.setColleague2(colleague2)

    colleague1.send("Hello from colleague1")
    colleague2.send("Hello from colleague2")
}