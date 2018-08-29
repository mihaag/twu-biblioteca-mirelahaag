package com.twu.biblioteca;

import java.util.Scanner;

public class MenuBiblioteca {

    public static final String WELCOME_MESSAGE = "Welcome!";
    public static final String OPT_LIST_BOOKS = "1 - List Books";
    public static final String OPT_BOOK_DETAILS = "2 - Book Details";
    public static final String OPT_QUIT = "3 - Quit";
    public static final String NEW_LINE = "\n";
    private LibraryManagement libManagement = new LibraryManagement();

    public void startApp() {
        System.out.println(showWelcomeMessage());
        showOptionsToUser();
    }

    private void showOptionsToUser() {
        Scanner s = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println(listOptions());
            option = s.nextInt();

            if (isOptionValid(option)) {
                switch (option) {
                    case 1:
                        System.out.println(libManagement.getAListOfAllBooks());
                        break;
                    case 2:
                        libManagement.printFormattedListOfBooksDetails();
                        break;
                    default:
                        break;
                }
            } else {
                System.out.println("Select a valid option!");
            }

        } while (option != 3);

    }


    public String showWelcomeMessage() {
        return WELCOME_MESSAGE;
    }

    public String listOptions() {
        return new StringBuilder().append(OPT_LIST_BOOKS).append(NEW_LINE).append(OPT_BOOK_DETAILS)
                .append(NEW_LINE).append(OPT_QUIT).append(NEW_LINE).append("Choose an option: ").toString();
    }

    public boolean isOptionValid(int option) {

        if (option != 1 && option != 2 && option != 3)
            return false;

        return true;
    }
}
