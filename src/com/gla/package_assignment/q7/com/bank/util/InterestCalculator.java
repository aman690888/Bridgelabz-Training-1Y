package com.gla.package_assignment.q7.com.bank.util;

import static java.lang.Math.pow;

public class InterestCalculator {

    // Simple Interest
    public double calculateSimpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    // Compound Interest
    public double calculateCompoundInterest(double p, double r, double t) {
        return p * (pow((1 + r / 100), t)) - p;
    }
}