package com.gla.package_assignment.q5.library.transactions;

import com.gla.package_assignment.q5.library.books.Book;
import com.gla.package_assignment.q5.library.members.Member;

public class Transaction {

    public void issueBook(Book book, Member member) {
        System.out.println(book.getTitle() + " issued to " + member.getName());
    }
}