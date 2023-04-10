package Structural.adapter

class TaxCalculatorAdapter: TaxCalculator() {
    private val employee = SimpleEmployee("",0.0)
    fun taxCalculator(boss: Boss):Double
    {
        employee.basicSalary = boss.basicSalary
        return super.taxCalculator(employee)
    }
}