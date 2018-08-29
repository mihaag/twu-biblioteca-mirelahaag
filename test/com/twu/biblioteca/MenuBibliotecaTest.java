package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MenuBibliotecaTest {

    @Test
    public void whenAplicationStartsWelcomeMessageMustBeAppear() {
        assertEquals("Welcome!", new MenuBiblioteca().showWelcomeMessage());
    }

    @Test
    public void listOptionInMainMenu() {
        assertEquals("1 - List Books", new MenuBiblioteca().showOptions());
    }

}
