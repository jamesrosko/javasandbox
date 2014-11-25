package com.jamesrosko.patterns.observer;

import org.apache.log4j.Logger;

public class EventObserver implements Observer {

    private static Logger log = Logger.getLogger(EventObserver.class);

    private String name;
    private int count;

    public EventObserver(String name) {
        this.name = name;
    }

    public void handleEvent() {
        count++;
        log.info(name + " is handling the event");
    }

    public int getCount() {
        return count;
    }

}
