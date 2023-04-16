package Behavioral.command

class TurnOnCommand(private val light: Light):Command {
    override fun execute() {
        light.turnOn()
    }
}