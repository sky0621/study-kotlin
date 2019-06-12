package ch.ch04

fun main() {
    val a = Person(1000)
    val b = Person(500)
    val c = Person(3200)

    Payroll.addEmployee(a)
    Payroll.calculateSalary()
    Payroll.addEmployee(b)
    Payroll.calculateSalary()
    Payroll.addEmployee(c)
    Payroll.calculateSalary()
}

class Person(val salary: Int)

object Payroll {
    val allEmployees = arrayListOf<Person>()

    fun addEmployee(e: Person) = allEmployees.add(e)

    fun calculateSalary() {
        var all = 0
        for (e in allEmployees) {
            println(e.salary)
            all += e.salary
        }
        println("==============")
        println(all)
        println("==============")
    }
}