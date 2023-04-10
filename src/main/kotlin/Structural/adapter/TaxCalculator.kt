package Structural.adapter

open class TaxCalculator {
    fun taxCalculator(simpleEmployee: SimpleEmployee):Double
    {
        return simpleEmployee.basicSalary * 0.19
    }
}