package Behavioral.command

class TurnOffCommand(private val light: Light):Command {
    override fun execute() {
        light.turnOff()
    }

}