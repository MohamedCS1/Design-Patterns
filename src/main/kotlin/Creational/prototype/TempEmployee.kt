package Creational.prototype


class TempEmployee:EmployeePrototype() {
    override fun shallowCopy(): EmployeePrototype {
        return this
    }

    override fun deepCopy(): EmployeePrototype {
        var tempEmployee = TempEmployee()
        tempEmployee = this.shallowCopy() as TempEmployee
        tempEmployee.address.apply {
            Address(this!!.building ,this.street ,this.city)
        }
        tempEmployee.name = this.name
        return tempEmployee
    }
}