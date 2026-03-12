package com.gla.package_assignment.q8.com.access.one;

public class Base {

    private void privateMethod() {
        System.out.println("Private Method");
    }

    void defaultMethod() {
        System.out.println("Default Method");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    public void publicMethod() {
        System.out.println("Public Method");
    }

    // Method to test access inside same class
    public void testAccess() {
        privateMethod();
        defaultMethod();
        protectedMethod();
        publicMethod();
    }
}