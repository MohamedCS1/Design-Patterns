package Behavioral.mediator

abstract class Colleague(private var mediator:Mediator) {
    fun send(event:String)
    {
        mediator.notify(this ,event)
    }
    abstract fun receive(event:String)
}