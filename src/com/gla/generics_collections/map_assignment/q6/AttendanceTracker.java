package com.gla.map_assignment.q6;

import java.util.*;

public class AttendanceTracker {

    public static void main(String[] args) {

        List<String> students = Arrays.asList("Aman", "Rahul", "Sneha", "Priya", "Karan");

        Map<String, Integer> attendance = new HashMap<>();

        // initialize
        for (String s : students) {
            attendance.put(s, 0);
        }

        // simulate 5 days
        List<List<String>> days = Arrays.asList(
                Arrays.asList("Aman", "Rahul"),
                Arrays.asList("Sneha", "Aman"),
                Arrays.asList("Priya", "Aman"),
                Arrays.asList("Karan", "Rahul"),
                Arrays.asList("Aman", "Sneha")
        );

        for (List<String> day : days) {
            for (String s : day) {
                attendance.put(s, attendance.get(s) + 1);
            }
        }

        // print low attendance (<3)
        for (String s : attendance.keySet()) {
            if (attendance.get(s) < 3) {
                System.out.println(s + " has low attendance");
            }
        }
    }
}