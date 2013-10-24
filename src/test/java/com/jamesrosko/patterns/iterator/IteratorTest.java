package com.jamesrosko.patterns.iterator;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class IteratorTest {

    private BookCollection bookCollection;

    @Before
    public void setup() {
        bookCollection = new BookCollection();
    }

    @Test
    public void singleTitle() {
        bookCollection.setTitle("Design Patterns");

        Iterator<String> bookIterator = bookCollection.createIterator();
        assertThat(bookIterator.hasNext(), is(true));
        assertThat((String) bookIterator.next(), is("Design Patterns"));
    }

    @Test
    public void multipleTitle() {
        bookCollection.setTitle("Design Patterns");
        bookCollection.setTitle("book b");
        bookCollection.setTitle("book c");
        bookCollection.setTitle("book d");

        Iterator<String> bookIterator = bookCollection.createIterator();
        assertThat(bookIterator.hasNext(), is(true));
        assertThat((String) bookIterator.next(), is("Design Patterns"));
        assertThat(bookIterator.hasNext(), is(true));
        assertThat((String) bookIterator.next(), is("book b"));
        assertThat(bookIterator.hasNext(), is(true));
        assertThat((String) bookIterator.next(), is("book c"));
        assertThat(bookIterator.hasNext(), is(true));
        assertThat((String) bookIterator.next(), is("book d"));
        assertThat(bookIterator.hasNext(), is(false));
    }

    @Test
    public void emptyCollection() {
        Iterator<String> bookIterator = bookCollection.createIterator();
        assertThat(bookIterator.hasNext(), is(false));
    }

}
