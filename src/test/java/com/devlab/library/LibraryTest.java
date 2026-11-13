package com.devlab.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    void shouldAddAndFindBook() {
        Library library = new Library();
        Book book = new Book(1, "Clean Code", "Robert C. Martin");

        library.addBook(book);

        assertEquals(book, library.findBookById(1));
    }

    @Test
    void shouldRemoveBook() {
        Library library = new Library();
        library.addBook(new Book(2, "Effective Java", "Joshua Bloch"));

        assertTrue(library.removeBook(2));
        assertNull(library.findBookById(2));
    }
}
