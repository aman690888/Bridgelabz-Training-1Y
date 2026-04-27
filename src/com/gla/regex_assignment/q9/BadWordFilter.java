package com.gla.regex_assignment.q9;

public class BadWordFilter {

    public static void main(String[] args) {

        String text = "This is a damn bad example with some stupid words.";

        String regex = "\\b(damn|stupid)\\b";

        String result = text.replaceAll(regex, "****");

        System.out.println(result);
    }
}