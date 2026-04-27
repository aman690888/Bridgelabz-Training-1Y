package com.gla.wrapper_assignment.q2;

public class WrapperToPrimitive {

    public static void main(String[] args) {

        Double d = 45.67;

        double primitiveDouble = d;
        int intValue = d.intValue();

        System.out.println(primitiveDouble);
        System.out.println(intValue);
    }
}