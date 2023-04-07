package Creational.prototype

fun main() {

    val tempEmployee1 = TempEmployee()
    tempEmployee1.id = 1
    tempEmployee1.name = "Ahmed"
    tempEmployee1.address = Address("Bourouba" ,"El harrach" ,"Alger")

    val tempEmployee2 = tempEmployee1.deepCopy()

    println("-----------------tempEmployee 1 original value-----------------")

    println(tempEmployee1.toString())

    println("-----------------tempEmployee 2 copied value-----------------")

    println(tempEmployee2.toString())

    // change in tempEmployee2
    tempEmployee2.address!!.city = "Oran"
    tempEmployee2.id = 4
    tempEmployee2.name = "Mohamed"

    println("-----------------tempEmployee 1 after change-----------------")

    println(tempEmployee1.toString())

    println("-----------------tempEmployee 2 after change-----------------")

    println(tempEmployee2.toString())


}