package com.gla.map_assignment.q12;

import java.util.*;

public class ShoppingCart {

    public static void main(String[] args) {

        Map<String, Double> cart = new LinkedHashMap<>();

        // add products
        cart.put("Laptop", 50000.0);
        cart.put("Mouse", 1000.0);
        cart.put("Keyboard", 2000.0);

        // display order preserved
        for (String p : cart.keySet()) {
            System.out.println(p + " -> " + cart.get(p));
        }

        // total
        double total = 0;
        for (double price : cart.values()) total += price;

        // discount
        if (total > 5000) {
            total *= 0.9;
        }

        System.out.println("Total Bill: " + total);

        // remove item
        cart.remove("Mouse");
    }
}