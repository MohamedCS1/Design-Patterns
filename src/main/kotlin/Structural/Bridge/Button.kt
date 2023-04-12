package Structural.Bridge

class Button(override var operatingSystem: OperatingSystem) :CommonUI {
    override fun click() {
        operatingSystem.doOperation()
    }
}