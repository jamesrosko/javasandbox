package com.jamesrosko.patterns.iterator;

import java.util.Iterator;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class BookIterator implements Iterator<String> {

    private BookCollection bookCollection;
    private int index;

    public BookIterator(BookCollection bookCollection) {
        this.bookCollection = bookCollection;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return bookCollection.size() > index;
    }

    @Override
    public String next() {
        String title = bookCollection.getTitle(index);
        index++;
        return title;
    }

    @Override
    public void remove() {
        throw new NotImplementedException();
    }

}
