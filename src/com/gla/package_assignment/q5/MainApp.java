package com.gla.package_assignment.q5;

import com.gla.package_assignment.q5.library.books.Book;
import com.gla.package_assignment.q5.library.members.Member;
import com.gla.package_assignment.q5.library.transactions.Transaction;

public class MainApp {

    public static void main(String[] args) {

        // Adding new book
        Book book = new Book("Java Programming", "James Gosling");
        book.displayBook();

        System.out.println("----------------------");

        // Registering new member
        Member member = new Member("Aman", 101);
        member.displayMember();

        System.out.println("----------------------");

        // Issuing book
        Transaction transaction = new Transaction();
        transaction.issueBook(book, member);
    }
}