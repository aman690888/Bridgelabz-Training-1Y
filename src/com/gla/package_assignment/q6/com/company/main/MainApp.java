package com.gla.package_assignment.q6.com.company.main;

import com.gla.package_assignment.q6.com.company.hr.Employee;
import com.gla.package_assignment.q6.com.company.payroll.Payroll;

public class MainApp {

    public static void main(String[] args) {

        Employee emp = new Employee(1, "Aman", "IT", 50000);

        System.out.println("Before Bonus:");
        System.out.println(emp);

        System.out.println("----------------------");

        Payroll payroll = new Payroll();
        payroll.calculateBonus(emp);

        System.out.println("After 10% Bonus:");
        System.out.println(emp);
    }
}