package com.gla.package_assignment.q5.library.books;

public class Book {

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayBook() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
    }

    public String getTitle() {
        return title;
    }
}