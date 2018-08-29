package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class MenuBibliotecaTest {

    @Test
    public void whenAplicationStartsWelcomeMessageMustBeAppear() {
        assertEquals("Welcome!", new MenuBiblioteca().getWelcomeMessage());
    }

    @Test
    public void listOptionInMainMenu() {
        assertEquals("1 - List Books\n" +
                        "2 - Book Details\n" +
                        "3 - Quit\n" +
                        "Choose an option: ",
                new MenuBiblioteca().getListOfOptions());
    }

    @Test
    public void isOptionValidReturnsFalseWhenOptionNotValid() {
        assertFalse(new MenuBiblioteca().isOptionValid(7));
    }


}
