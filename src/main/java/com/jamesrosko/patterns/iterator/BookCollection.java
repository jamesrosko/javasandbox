package com.jamesrosko.patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookCollection {

    private List<String> titles;

    public BookCollection() {
        this.titles = new ArrayList<String>();
    }

    public void setTitle(String title) {
        titles.add(title);
    }

    public Iterator<String> createIterator() {
        return new BookIterator(this);
    }

    public String getTitle(int index) {
        return titles.get(index);
    }

    public int size() {
        return titles.size();
    }

}
