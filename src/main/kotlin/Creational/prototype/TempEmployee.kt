package Creational.prototype


class TempEmployee:EmployeePrototype() {
    override fun shallowCopy(): EmployeePrototype {
        return this
    }

    override fun deepCopy(): EmployeePrototype {
        val tempEmployee = TempEmployee()
        tempEmployee.id = this.id
        tempEmployee.name = this.name
        tempEmployee.address = this.address?.copy()
        return tempEmployee
    }
}