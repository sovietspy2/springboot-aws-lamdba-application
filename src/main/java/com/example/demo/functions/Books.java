package com.example.demo.functions;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

@Configuration
public class Books {

    private final BookService bookService;

    public Books(BookService bookService) {
        this.bookService = bookService;
    }

    @Bean
    public Consumer<String> createBook() {
        return bookService::create;
    }

    @Bean
    public Supplier<List<Book>> findAll() {
        return () -> bookService.findAll();
    }
}
