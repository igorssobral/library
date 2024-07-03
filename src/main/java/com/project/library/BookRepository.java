package com.project.library;


import java.util.List;

public interface BookRepository {
    void addBook(Book book);
    List<Book> getAllBooks();
    Book findBookByIsbn(String isbn);
}
