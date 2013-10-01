package com.jamesrosko.singleton;

public class CannotMockMeSingleton {

    private static CannotMockMeSingleton instance;

    private String value;

    private CannotMockMeSingleton() {
    }

    public static CannotMockMeSingleton getInstance() {
        if (instance == null) {
            instance = new CannotMockMeSingleton();
        }
        return instance;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
