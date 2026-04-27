package com.gla.map_assignment.q7;

import java.util.*;

public class CountryCapital {

    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();

        map.put("India", "New Delhi");
        map.put("USA", "Washington");
        map.put("France", "Paris");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter country: ");
        String country = sc.nextLine();

        System.out.println(map.getOrDefault(country, "Unknown country"));

        // print all sorted
        for (String c : map.keySet()) {
            System.out.println(c + " -> " + map.get(c));
        }
    }
}