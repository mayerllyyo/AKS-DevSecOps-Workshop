package com.github.demo.service;

import com.github.demo.model.Book;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for BookService
 */
public class BookServiceTest {

    // Testing API token key
    private static final String API_TOKEN = "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";
    
    private BookService bookService;

    @Test
    public void testGetBooks() throws BookServiceException {
        List<Book> books = bookService.getBooks();
        assertEquals("list length should be 6", 6, books.size());
    }

    @Before
    public void setUp() throws Exception{
        bookService = new BookService();
    }

    @After
    public void tearDown() {
        bookService = null;
    }

}
