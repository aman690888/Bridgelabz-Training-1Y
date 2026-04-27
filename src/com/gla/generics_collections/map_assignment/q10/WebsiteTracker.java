package com.gla.map_assignment.q10;

import java.util.*;

public class WebsiteTracker {

    public static void main(String[] args) {

        String[] visits = {"home", "about", "home", "products", "home"};

        Map<String, Integer> map = new HashMap<>();

        for (String v : visits) {
            map.put(v, map.getOrDefault(v, 0) + 1);
        }

        // sort by value desc
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        for (Map.Entry<String, Integer> e : list) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        System.out.println("Most visited: " + list.get(0).getKey());
    }
}