package com.gla.map_assignment.q8;

import java.util.*;

public class CourseRegistration {

    public static void main(String[] args) {

        Map<String, Integer> courses = new HashMap<>();

        courses.put("CS101", 40);
        courses.put("CS102", 3);

        // add students
        courses.put("CS101", courses.get("CS101") + 10);

        // remove students
        courses.put("CS102", Math.max(0, courses.get("CS102") - 2));

        // print categories
        for (String c : courses.keySet()) {
            int count = courses.get(c);

            if (count >= 50)
                System.out.println(c + " near full");
            else if (count < 5)
                System.out.println(c + " under-subscribed");
        }
    }
}