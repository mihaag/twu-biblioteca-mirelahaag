package com.twu.biblioteca;

public class Book {
    private String title;
    private String author;
    private Integer yearPublished;

    public Book(String title, String author, Integer yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getYearPublished() {
        return yearPublished;
    }
}
