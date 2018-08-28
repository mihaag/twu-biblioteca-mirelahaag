package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MenuBibliotecaTest {

    @Test
    public void whenAplicationStartsWelcomeMessageMustBeAppear() {
        MenuBiblioteca menu = new MenuBiblioteca();
        assertEquals("Welcome!", menu.showWelcomeMessage());
    }
}
