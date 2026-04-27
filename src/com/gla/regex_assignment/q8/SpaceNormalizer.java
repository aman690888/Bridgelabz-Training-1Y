package com.gla.regex_assignment.q8;

public class SpaceNormalizer {

    public static void main(String[] args) {

        String text = "This   is   an   example    with multiple   spaces.";

        String result = text.replaceAll("\\s+", " ");

        System.out.println("Normalized Text:");
        System.out.println(result);
    }
}