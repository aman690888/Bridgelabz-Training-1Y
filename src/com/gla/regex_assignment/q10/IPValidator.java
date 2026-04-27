package com.gla.regex_assignment.q10;

import java.util.Scanner;

public class IPValidator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter IP: ");
        String ip = sc.nextLine();

        String regex =
                "^(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\." +
                        "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\." +
                        "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\." +
                        "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)$";

        if (ip.matches(regex)) {
            System.out.println("Valid IP");
        } else {
            System.out.println("Invalid IP");
        }

        sc.close();
    }
}