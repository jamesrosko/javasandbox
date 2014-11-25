package com.jamesrosko.patterns.iterator;

import java.util.Iterator;

public class BookIterator implements Iterator<String> {

    private BookCollection bookCollection;
    private int index;

    public BookIterator(BookCollection bookCollection) {
        this.bookCollection = bookCollection;
        this.index = 0;
    }

    public boolean hasNext() {
        return bookCollection.size() > index;
    }

    public String next() {
        String title = bookCollection.getTitle(index);
        index++;
        return title;
    }

    public void remove() {
        throw new RuntimeException("not implemented");
    }

}
