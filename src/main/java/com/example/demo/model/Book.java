package com.example.demo.model;

public class Book {

    private String name;
    private Integer id;

    public Book(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
