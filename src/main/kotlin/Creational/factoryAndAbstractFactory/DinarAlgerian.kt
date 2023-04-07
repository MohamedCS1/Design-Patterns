package Creational.factoryAndAbstractFactory

class DinarAlgerian:Currency {
    override fun symbol(): String {
        return "D.Z"
    }

    override fun code(): String {
        return "DZD"
    }
}