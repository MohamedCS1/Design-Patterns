package Creational.prototype

class RegEmployee: EmployeePrototype() {
    override fun shallowCopy(): EmployeePrototype {
        return this
    }

    override fun deepCopy(): EmployeePrototype {
        val regEmployee = RegEmployee()
        regEmployee.id = this.id
        regEmployee.name = this.name
        regEmployee.address = this.address?.copy()
        return regEmployee

    }
}