package org.antop.kotlin.chapter4

import java.math.BigDecimal

data class Employee(val name: String, val salary: BigDecimal) {
    // Employee 이름 정렬 전용이기 때문에 Employee 클래스 안에 두는 것이 좋다
    object NameComparator : Comparator<Employee> {
        override fun compare(o1: Employee, o2: Employee): Int {
            return o1.name.compareTo(o2.name)
        }
    }
}

fun main() {
    val e1 = Employee("Jack", BigDecimal.valueOf(10))
    val e2 = Employee("Pool", BigDecimal.valueOf(100))
    val employees = listOf(e1, e2)
    val sorted = employees.sortedWith(Employee.NameComparator)
    println(sorted)
    // [Employee(name=Jack, salary=10), Employee(name=Pool, salary=100)]
}
