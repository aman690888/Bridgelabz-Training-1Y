package com.gla.map_assignment.q9;

import java.util.*;

public class SalaryDirectory {

    public static void main(String[] args) {

        Map<String, Double> map = new HashMap<>();

        map.put("Aman", 50000.0);
        map.put("Rahul", 60000.0);
        map.put("Sneha", 70000.0);

        // raise
        if (map.containsKey("Aman")) {
            map.put("Aman", map.get("Aman") * 1.10);
        }

        // average
        double sum = 0;
        for (double s : map.values()) sum += s;
        System.out.println("Average: " + (sum / map.size()));

        // max
        double max = Collections.max(map.values());
        for (String name : map.keySet()) {
            if (map.get(name) == max) {
                System.out.println("Highest: " + name);
            }
        }
    }
}