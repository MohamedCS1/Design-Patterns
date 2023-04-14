package Behavioral.mediator

interface Mediator {
    fun notify(sender:Colleague ,event:String)
}