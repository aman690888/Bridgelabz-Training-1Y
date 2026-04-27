package com.gla.regex_assignment.q6;

import java.util.regex.*;

public class DateExtractor {

    public static void main(String[] args) {

        String text = "Dates: 12/05/2023, 15/08/2024, 29/02/2020";

        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";

        Matcher matcher = Pattern.compile(regex).matcher(text);

        System.out.println("Extracted Dates:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}