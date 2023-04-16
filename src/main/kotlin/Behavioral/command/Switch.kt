package Behavioral.command

class Switch(private val turnOffCommand: Command ,private val turnOnCommand: Command) {
    fun turnOn()
    {
        turnOnCommand.execute()
    }

    fun turnOff()
    {
        turnOffCommand.execute()
    }
}