package com.gla.map_assignment.q11;

import java.util.*;

public class BankSystem {

    public static void main(String[] args) {

        Map<String, Double> accounts = new HashMap<>();

        // add accounts
        accounts.put("ACC1", 5000.0);
        accounts.put("ACC2", 8000.0);
        accounts.put("ACC3", 12000.0);

        // deposit
        accounts.put("ACC1", accounts.get("ACC1") + 2000);

        // withdraw
        double withdraw = 3000;
        if (accounts.get("ACC2") >= withdraw) {
            accounts.put("ACC2", accounts.get("ACC2") - withdraw);
        }

        // sort by balance desc
        List<Map.Entry<String, Double>> list = new ArrayList<>(accounts.entrySet());
        list.sort((a, b) -> Double.compare(b.getValue(), a.getValue()));

        // print all
        for (Map.Entry<String, Double> e : list) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        // top 3
        System.out.println("\nTop Customers:");
        for (int i = 0; i < Math.min(3, list.size()); i++) {
            System.out.println(list.get(i).getKey());
        }
    }
}