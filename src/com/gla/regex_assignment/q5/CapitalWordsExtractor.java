package com.gla.regex_assignment.q5;

import java.util.regex.*;

public class CapitalWordsExtractor {

    public static void main(String[] args) {

        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        String regex = "\\b[A-Z][a-zA-Z]*\\b";

        Matcher matcher = Pattern.compile(regex).matcher(text);

        System.out.println("Capitalized Words:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}