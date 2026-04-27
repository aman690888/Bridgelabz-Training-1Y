package com.gla.regex_assignment.q3;

import java.util.Scanner;

public class HexColorValidator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hex color: ");
        String color = sc.nextLine();

        // # + 6 hex characters
        String regex = "^#[0-9a-fA-F]{6}$";

        if (color.matches(regex)) {
            System.out.println("Valid Hex Color");
        } else {
            System.out.println("Invalid Hex Color");
        }

        sc.close();
    }
}