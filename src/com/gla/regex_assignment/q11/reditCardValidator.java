package com.gla.regex_assignment.q11;

import java.util.Scanner;

public class CreditCardValidator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter card number: ");
        String card = sc.nextLine();

        // Visa (starts 4) OR MasterCard (starts 5) → 16 digits
        String regex = "^(4|5)\\d{15}$";

        if (card.matches(regex)) {
            System.out.println("Valid Card");
        } else {
            System.out.println("Invalid Card");
        }

        sc.close();
    }
}