package Behavioral.mediator

import java.lang.IllegalArgumentException

class ConcreteMediator:Mediator {
    private lateinit var colleague1:ConcreteColleague1
    private lateinit var colleague2:ConcreteColleague2

    fun setColleague1(colleague: ConcreteColleague1)
    {
        colleague1 = colleague
    }

    fun setColleague2(colleague: ConcreteColleague2)
    {
        colleague2 = colleague
    }

    override fun notify(sender: Colleague, event: String) {
        when(sender)
        {
            colleague1 -> colleague2.receive(event)
            colleague2 -> colleague1.receive(event)
            else -> throw IllegalArgumentException("Unknown sender")
        }
    }
}