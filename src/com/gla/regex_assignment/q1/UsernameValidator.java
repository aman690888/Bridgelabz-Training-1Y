package com.gla.regex_assignment.q1;

import java.util.Scanner;

public class UsernameValidator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        // Regex pattern
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";

        if (username.matches(regex)) {
            System.out.println("Valid Username");
        } else {
            System.out.println("Invalid Username");
        }

        sc.close();
    }
}