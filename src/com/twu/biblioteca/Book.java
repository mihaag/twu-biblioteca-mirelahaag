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

    @Override
    public String toString() {
       return new StringBuilder()
                .append(title)
                .append("\t")
                .append(author)
                .append("\t\t")
                .append(yearPublished)
                .toString();
    }
}
