package com.gla.regex_assignment.q2;

import java.util.Scanner;

public class LicensePlateValidator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter license plate: ");
        String plate = sc.nextLine();

        // 2 uppercase letters + 4 digits
        String regex = "^[A-Z]{2}[0-9]{4}$";

        if (plate.matches(regex)) {
            System.out.println("Valid License Plate");
        } else {
            System.out.println("Invalid License Plate");
        }

        sc.close();
    }
}