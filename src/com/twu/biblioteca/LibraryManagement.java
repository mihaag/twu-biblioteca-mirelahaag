package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagement {

    List<Book> listOfBooks;

    public LibraryManagement() {
        listOfBooks = new ArrayList<>();
        listOfBooks.add(new Book("Clean Code: A Handbook of Agile Software Craftsmanship",
                "Robert Cecil Martin", 2008));
        listOfBooks.add(new Book("Test Driven Development by Example", "Kent Beck", 2000));
        listOfBooks.add(new Book("Head First Java", "Kathy Sierra, Bert Bates", 2003));
    }

    public String listAllBooks() {
        StringBuilder listOfTitles = new StringBuilder();

        for (Book book : listOfBooks) {
            listOfTitles.append(book.getTitle()+"\n");
        }

        return listOfTitles.toString();
    }
}
