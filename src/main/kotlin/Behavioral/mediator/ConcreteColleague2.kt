package Behavioral.mediator

class ConcreteColleague2(mediator: Mediator) : Colleague(mediator) {
    override fun receive(event: String) {
        println("ConcreteColleague2 received event: $event")
    }
}