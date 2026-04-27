package com.gla.map_assignment.q13;

import java.util.*;

public class EmployeeDept {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "HR");
        map.put(2, "IT");
        map.put(3, "HR");

        // update dept
        map.put(2, "Finance");

        // reverse lookup (employees in HR)
        for (int id : map.keySet()) {
            if (map.get(id).equals("HR")) {
                System.out.println("HR Employee ID: " + id);
            }
        }

        // count per dept
        Map<String, Integer> count = new HashMap<>();

        for (String dept : map.values()) {
            count.put(dept, count.getOrDefault(dept, 0) + 1);
        }

        System.out.println(count);
    }
}