package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryManagementTest {

    @Test
    public void listBooksFromLibrary() {
        String expected = "Clean Code: A Handbook of Agile Software Craftsmanship\n" +
                "Test Driven Development by Example\nHead First Java\n";

        assertEquals(expected, new LibraryManagement().getAListOfAllBooks());
    }

    @Test
    public void getFormatByTitleAndAuthorMaxWidths () {
        String expected = "%-54s %-24s %d\n";
        assertEquals(expected, new LibraryManagement().getFormatFromWidths());
    }
}
