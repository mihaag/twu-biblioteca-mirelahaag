package com.twu.biblioteca;

import java.util.Scanner;

public class MenuBiblioteca {

    public static final String WELCOME_MESSAGE = "Welcome!";
    public static final String OPT_LIST_BOOKS = "1 - List Books";
    public static final String OPT_QUIT = "2 - Quit";
    private LibraryManagement libManagement = new LibraryManagement();

    public void startApp() {
        System.out.println(showWelcomeMessage());
        showOptionsToUser();
    }

    private void showOptionsToUser() {
        Scanner s = new Scanner (System.in);

        int option = 0;
        do {
            System.out.println(listOptions());
            option = s.nextInt();

            if(isOptionValid(option)) {
                if (option == 1) {
                    System.out.println(libManagement.getAListOfAllBooks());
                }
            } else {
                System.out.println("Select a valid option!");
            }

        } while (option != 2);

    }


    public String showWelcomeMessage() {
        return WELCOME_MESSAGE;
    }

    public String listOptions() {
        return new StringBuilder().append(OPT_LIST_BOOKS)
                .append("\n").append(OPT_QUIT).append("\nChoose an option: ").toString();
    }

    public boolean isOptionValid(int option) {

        if(option != 1 && option != 2) {
            return false;
        }

        return true;
    }
}
