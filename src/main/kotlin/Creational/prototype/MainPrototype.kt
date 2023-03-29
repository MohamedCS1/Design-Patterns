package Creational.prototype

fun main() {

    val tempEmployee = TempEmployee()
    tempEmployee.id = 1
    tempEmployee.name = "Ahmed"
    tempEmployee.address = Address("Bourouba" ,"El harrach" ,"Alger")

    val tempEmployee2 = tempEmployee.deepCopy()

    println("-----------------tempEmployee 1 original value-----------------")

    println(tempEmployee.toString())

    println("-----------------tempEmployee 2 copied-----------------")

    println(tempEmployee2.toString())

    tempEmployee2.address!!.city = "Oran"

    println("-----------------tempEmployee 1 after change-----------------")

    println(tempEmployee.toString())

    println("-----------------tempEmployee 2 after change-----------------")

    println(tempEmployee2.toString())


}