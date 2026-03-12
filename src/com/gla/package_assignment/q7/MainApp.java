package com.gla.package_assignment.q7;

import com.gla.package_assignment.q7.com.bank.util.InterestCalculator;

public class MainApp {

    public static void main(String[] args) {

        InterestCalculator calculator = new InterestCalculator();

        double principal = 10000;
        double rate = 5;
        double time = 2;

        double si = calculator.calculateSimpleInterest(principal, rate, time);
        double ci = calculator.calculateCompoundInterest(principal, rate, time);

        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");

        System.out.println("----------------------");

        System.out.println("Simple Interest: " + si);
        System.out.println("Compound Interest: " + ci);
    }
}