package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class MenuBibliotecaTest {

    @Test
    public void whenAplicationStartsWelcomeMessageMustBeAppear() {
        assertEquals("Welcome!", new MenuBiblioteca().showWelcomeMessage());
    }

    @Test
    public void listOptionInMainMenu() {
        assertEquals("1 - List Books", new MenuBiblioteca().showOptions());
    }

    @Test
    public void isOptionValidReturnsFalseWhenOptionNotValid() {
        assertFalse(new MenuBiblioteca().isOptionValid(7));
    }

}
