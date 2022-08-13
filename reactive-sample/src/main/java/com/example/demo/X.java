package com.example.demo;

interface Library {
    void issueBook(Book b);

    void retrieveBook(Book b);

    public class Book implements Library {
        int bookId;
        String bookName;
        int issueDate;
        int returnDate;

        public void issueBook(Book b) {
            System.out.println("book issued");
        }

        public void retrieveBook(Book b) {
            System.out.println("book retrieved");
        }
    }
}

public class X {
    public void demo() {
        System.out.println("Hello welcome to tutorialspoint");
    }

    public static void main(String args[]) {
        X obj = new X();
        obj.demo();
    }
}

