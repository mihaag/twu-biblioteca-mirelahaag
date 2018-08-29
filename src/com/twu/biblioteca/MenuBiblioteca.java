package com.twu.biblioteca;

import java.util.Scanner;

public class MenuBiblioteca {

    public static final String WELCOME_MESSAGE = "Welcome!";
    public static final String LIST_BOOKS = "1 - List Books";
    private LibraryManagement libManagement = new LibraryManagement();

    public void startApp() {
        Scanner s = new Scanner (System.in);

        System.out.println(showWelcomeMessage());
        System.out.println(showOptions());

        System.out.println("Choose an option: ");
        int option = s.nextInt();

        if(option == 1){
            System.out.println(libManagement.getAListOfAllBooks());
        }

    }


    public String showWelcomeMessage() {
        return WELCOME_MESSAGE;
    }

    public String showOptions() {
        return LIST_BOOKS;
    }

}
