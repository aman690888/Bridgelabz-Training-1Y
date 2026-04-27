package com.gla.map_assignment.q14;

import java.util.*;

public class ExamResults {

    public static void main(String[] args) {

        Map<String, Map<String, Integer>> map = new HashMap<>();

        // subject -> (student -> marks)
        Map<String, Integer> math = new HashMap<>();
        math.put("Aman", 95);
        math.put("Rahul", 80);

        Map<String, Integer> science = new HashMap<>();
        science.put("Aman", 85);
        science.put("Rahul", 92);

        map.put("Math", math);
        map.put("Science", science);

        for (String subject : map.keySet()) {

            Map<String, Integer> students = map.get(subject);

            // top scorer
            int max = Collections.max(students.values());
            for (String s : students.keySet()) {
                if (students.get(s) == max) {
                    System.out.println(subject + " Topper: " + s);
                }
            }

            // average
            double sum = 0;
            for (int marks : students.values()) sum += marks;
            System.out.println(subject + " Avg: " + (sum / students.size()));

            // above 90
            for (int m : students.values()) {
                if (m > 90) {
                    System.out.println(subject + " has high scorer");
                    break;
                }
            }
        }
    }
}