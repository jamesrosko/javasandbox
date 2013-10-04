package com.jamesrosko.patterns.observer;

import java.util.HashSet;
import java.util.Set;

public class EventRunner {

    private Set<Observer> observers;

    public EventRunner() {
        observers = new HashSet<Observer>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.handleEvent();
        }
    }

}
