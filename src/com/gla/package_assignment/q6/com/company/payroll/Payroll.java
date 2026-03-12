package com.gla.package_assignment.q6.com.company.payroll;

import com.gla.package_assignment.q6.com.company.hr.Employee;

public class Payroll {

    public void calculateBonus(Employee e) {
        double bonusSalary = e.getSalary() + (e.getSalary() * 0.10);
        e.setSalary(bonusSalary);
    }
}