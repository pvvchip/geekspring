package com.geekbrains.services;

import com.geekbrains.entities.Book;
import com.geekbrains.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService {
    private BookRepository bookRepository;

    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public BooksService() {
    }

    public List<Book> getAllBooksList() {
        return (List<Book>) bookRepository.findAll();
    }

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public void removeById(Long id) {
        bookRepository.deleteById(id);
    }
}
