package com.gla.wrapper_assignment.q10;

public class GameScore {

    public static void main(String[] args) {

        Integer[] scores = {100, null, 50, null, 75};

        int countNull = 0;
        int sum = 0;

        for (Integer s : scores) {

            if (s == null) {
                countNull++;
            } else {
                sum += s; // auto-unboxing
            }
        }

        System.out.println("Players not played: " + countNull);
        System.out.println("Total score: " + sum);
    }
}