package com.twu.biblioteca;

import java.util.Scanner;

public class MenuBiblioteca {

    public static final String WELCOME_MESSAGE = "Welcome!";
    public static final String OPT_LIST_BOOKS = "1 - List Books";
    public static final String OPT_BOOK_DETAILS = "2 - Book Details";
    public static final String OPT_QUIT = "3 - Quit";
    public static final String NEW_LINE = "\n";
    private Scanner s = new Scanner(System.in);
    private LibraryManagement libManagement = new LibraryManagement();

    public void startApp() {
        showWelcomeMessage();
        showMenu();
    }

    private void showMenu() {
        int option = 0;

        do {
            showListOfOptions();
            option = s.nextInt();

            if (!isOptionValid(option)) {
                showInvalidMessage();
                continue;
            }

            treatSelectedOption(option);
        } while (option != 3);

    }


    private void treatSelectedOption(int option) {
        switch (option) {
            case 1:
                libManagement.printListOfBooksTitles();
                break;
            case 2:
                libManagement.printFormattedListOfBooksDetails();
                break;
            default:
                break;
        }
    }

    private void showWelcomeMessage() {
        System.out.println(getWelcomeMessage());
    }

    private void showInvalidMessage() {
        System.out.println("Select a valid option!");
    }

    private void showListOfOptions() {
        System.out.println(getListOfOptions());
    }

    public String getWelcomeMessage() {
        return WELCOME_MESSAGE;
    }

    public String getListOfOptions() {
        return new StringBuilder().append(OPT_LIST_BOOKS).append(NEW_LINE).append(OPT_BOOK_DETAILS)
                .append(NEW_LINE).append(OPT_QUIT).append(NEW_LINE).append("Choose an option: ").toString();
    }

    public boolean isOptionValid(int option) {
        if (option != 1 && option != 2 && option != 3)
            return false;
        return true;
    }
}
