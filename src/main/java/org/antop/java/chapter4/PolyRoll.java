package org.antop.java.chapter4;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PolyRoll {
    public static final PolyRoll INSTANCE = new PolyRoll();
    private final List<Employee> allEmployees = new ArrayList<>();

    private PolyRoll() {}

    public void add(Employee employee) {
        allEmployees.add(employee);
    }

    public void calculateSalary() {
        BigDecimal totalSalary = BigDecimal.ZERO;
        for (Employee employee : allEmployees) {
            totalSalary = totalSalary.add(employee.salary());
        }
        System.out.println("totalSalary = " + totalSalary);
    }

    public static void main(String[] args) {
        PolyRoll.INSTANCE.add(new Employee("2p", BigDecimal.valueOf(2000)));
        PolyRoll.INSTANCE.add(new Employee("Antop", BigDecimal.valueOf(1000)));
        PolyRoll.INSTANCE.add(new Employee("MJ", BigDecimal.valueOf(500)));
        PolyRoll.INSTANCE.calculateSalary();
    }
}
