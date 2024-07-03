package com.project.library;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryFacade {
    private final BookRepository bookRepository;
    private final DatabaseConnection dbConnection;

    @Autowired
    public LibraryFacade(BookRepository bookRepository, DatabaseConnection dbConnection) {
        this.bookRepository = bookRepository;
        this.dbConnection = dbConnection;
    }

    public void addBook(String title, String author, String isbn) {
        Book book = new Book(title, author, isbn);
        bookRepository.addBook(book);
        dbConnection.executeQuery("INSERT INTO books (title, author, isbn) VALUES ('" +
                title + "', '" + author + "', '" + isbn + "')");
    }

    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }

    public Book findBookByIsbn(String isbn) {
        return bookRepository.findBookByIsbn(isbn);
    }
}
