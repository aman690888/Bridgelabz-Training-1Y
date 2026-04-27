package com.gla.regex_assignment.q7;

import java.util.regex.*;

public class LinkExtractor {

    public static void main(String[] args) {

        String text = "Visit https://www.google.com and http://example.org";

        String regex = "https?://[\\w.-]+\\.[a-zA-Z]{2,}";

        Matcher matcher = Pattern.compile(regex).matcher(text);

        System.out.println("Extracted Links:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}