package com.gla.package_assignment.q10.college.student;

public class Student {

    private String name;
    private int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + roll);
    }
}