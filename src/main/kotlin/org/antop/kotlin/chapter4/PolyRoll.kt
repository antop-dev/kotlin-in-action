package org.antop.kotlin.chapter4

import java.math.BigDecimal

object PolyRoll {
    private val allEmployees = mutableListOf<Employee>()

    fun add(employee:Employee) {
        allEmployees += employee
    }

    fun calculateSalary() {
        var totalSalary = BigDecimal.ZERO
        for (p in allEmployees) {
            totalSalary += p.salary
        }
        println("totalSalary = $totalSalary")
    }

}

fun main() {
    PolyRoll.add(Employee("2P", BigDecimal.valueOf(2000)))
    PolyRoll.add(Employee("Antop", BigDecimal.valueOf(1000)))
    PolyRoll.add(Employee("MJ", BigDecimal.valueOf(500)))
    PolyRoll.calculateSalary()
}
