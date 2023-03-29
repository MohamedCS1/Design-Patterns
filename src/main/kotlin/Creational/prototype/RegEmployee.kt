package Creational.prototype

class RegEmployee: EmployeePrototype() {
    override fun shallowCopy(): EmployeePrototype {
        return this
    }

    override fun deepCopy(): EmployeePrototype {
        var regEmployee = RegEmployee()
        regEmployee = this
        regEmployee.address.apply {
            Address(this!!.building ,this.street ,this.city)
        }
        regEmployee.name = this.name
        return regEmployee
    }
}