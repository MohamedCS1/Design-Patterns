package Behavioral.command

fun main() {
    val light = Light()
    val turnOnCommand = TurnOnCommand(light)
    val turnOffCommand = TurnOffCommand(light)

    val switch = Switch(turnOffCommand ,turnOnCommand)

    switch.turnOn()
    switch.turnOff()
}