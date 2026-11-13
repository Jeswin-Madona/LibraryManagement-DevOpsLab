package com.devlab.library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book(1, "Clean Code", "Robert C. Martin"));
        library.addBook(new Book(2, "Effective Java", "Joshua Bloch"));

        System.out.println("LIBRARY MANAGEMENT SYSTEM");
        System.out.println("-------------------------");
        System.out.println("Available books:");

        for (Book book : library.getAllBooks()) {
            System.out.println(book);
        }

        Book foundBook = library.findBookById(1);
        if (foundBook != null) {
            System.out.println("Search result: " + foundBook);
        }

        library.removeBook(2);
        System.out.println("Books after removing book 2:");
        for (Book book : library.getAllBooks()) {
            System.out.println(book);
        }
    }
}
