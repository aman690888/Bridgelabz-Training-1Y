package com.gla.stream_assignment.lambda.q2;

import java.util.*;

class Product {
    String name;
    double price;
    double rating;

    Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String toString() {
        return name + " | ₹" + price + " | Rating: " + rating;
    }
}

public class ProductSorting {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Laptop", 60000, 4.5));
        list.add(new Product("Phone", 30000, 4.2));
        list.add(new Product("Tablet", 20000, 4.8));

        // 🔹 Sort by price (lambda comparator)
        list.sort((p1, p2) -> Double.compare(p1.price, p2.price));

        System.out.println("Sorted by Price:");
        list.forEach(System.out::println);

        // 🔹 Sort by rating
        list.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));

        System.out.println("\nSorted by Rating:");
        list.forEach(System.out::println);
    }
}