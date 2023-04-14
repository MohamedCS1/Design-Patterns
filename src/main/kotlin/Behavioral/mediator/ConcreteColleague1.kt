package Behavioral.mediator

class ConcreteColleague1(mediator:Mediator):Colleague(mediator) {
    override fun receive(event: String) {
        println("ConcreteColleague1 receive event: $event")
    }
}