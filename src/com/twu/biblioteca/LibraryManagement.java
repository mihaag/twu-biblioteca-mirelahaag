package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagement {

    public static final String COLUMN_TITLES = "Title\t\t\t\t\t\t\t\t\t\t\t\t\tAuthor\t\t\t\t\tYear Published";
    public static final String NEXT_LINE = "\n";
    public static final String HEADER_TITLE = "Title";
    public static final String HEADER_AUTHOR = "Author";
    List<Book> listOfBooks;

    public LibraryManagement() {
        mockListOfBooks();
    }

    private void mockListOfBooks() {
        listOfBooks = new ArrayList<>();
        listOfBooks.add(new Book("Clean Code: A Handbook of Agile Software Craftsmanship",
                "Robert Cecil Martin", 2008));
        listOfBooks.add(new Book("Test Driven Development by Example", "Kent Beck", 2000));
        listOfBooks.add(new Book("Head First Java", "Kathy Sierra, Bert Bates", 2003));
    }

    public String getAListOfAllBooks() {
        StringBuilder listOfTitles = new StringBuilder();

        for (Book book : listOfBooks)
            listOfTitles.append(book.getTitle()).append(NEXT_LINE);

        return listOfTitles.toString();
    }

    public void printFormattedListOfBooksDetails() {
        printColumnTitles();
        printFormattedBooksDetails();
    }

    public void printColumnTitles() {
        System.out.printf(getFormatForHeaders(), HEADER_TITLE, HEADER_AUTHOR, "Year");
    }

    public String getFormatFromWidths() {
        return new StringBuilder().append("%-").append(getMaxWidthTitle()).append("s")
                .append(" %-").append(getMaxWidthAuthor()).append("s")
                .append(" %d\n")
                .toString();
    }

    private String getFormatForHeaders() {
        return new StringBuilder().append("%-").append(getMaxWidthTitle()).append("s")
                .append(" %-").append(getMaxWidthAuthor()).append("s")
                .append(" %s\n")
                .toString();
    }

    public void printFormattedBooksDetails() {
        for (Book book : listOfBooks) {
            System.out.printf(getFormatFromWidths(), book.getTitle(), book.getAuthor(), book.getYearPublished());
        }
    }

    private int getMaxWidthAuthor() {
        int max = 0;

        for (Book book : listOfBooks) {
            max = checkIfMaxAuthorShouldBeReplaced(max, book);
        }

        return max;
    }

    private int getMaxWidthTitle() {
        int max = 0;

        for (Book book : listOfBooks) {
            max = checkIfMaxTitleShouldBeReplaced(max, book);
        }

        return max;
    }

    private int checkIfMaxTitleShouldBeReplaced(int max, Book book) {
        return book.getTitle().length() > max ? book.getTitle().length() : max;
    }

    private int checkIfMaxAuthorShouldBeReplaced(int max, Book book) {
        return book.getAuthor().length() > max ? book.getAuthor().length() : max;
    }
}
