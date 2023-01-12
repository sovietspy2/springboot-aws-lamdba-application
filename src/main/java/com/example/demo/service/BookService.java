package com.example.demo.service;

import com.example.demo.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class BookService {

    private final List<Book> books = new ArrayList<>();
    private final AtomicInteger id = new AtomicInteger(0);

    public List<Book> findAll() {
        return books;
    }

    public void create(String name) {
        books.add(new Book(name, id.getAndIncrement()));
    }
}
