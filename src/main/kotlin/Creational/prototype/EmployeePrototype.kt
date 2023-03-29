package Creational.prototype

abstract class EmployeePrototype {

    var id:Int? = null
    var name:String? = null
    var address:Address? = null

    abstract fun shallowCopy():EmployeePrototype
    abstract fun deepCopy():EmployeePrototype

    override fun toString(): String {
        return "id -> $id ,name -> $name ,address -> $address"
    }
}