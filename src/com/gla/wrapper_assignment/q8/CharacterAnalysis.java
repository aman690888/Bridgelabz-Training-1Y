package com.gla.wrapper_assignment.q8;

import java.util.*;

public class CharacterAnalysis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int letters = 0, digits = 0, special = 0;

        for (char c : str.toCharArray()) {

            if (Character.isLetter(c)) letters++;
            else if (Character.isDigit(c)) digits++;
            else if (!Character.isWhitespace(c)) special++;
        }

        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Special: " + special);
    }
}