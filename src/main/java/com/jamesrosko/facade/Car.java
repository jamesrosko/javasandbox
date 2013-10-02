package com.jamesrosko.facade;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class Car {

    private static Logger log = Logger.getLogger(Car.class);

    private List<String> history = new ArrayList<String>();

    public List<String> getHistory() {
        return history;
    }

    public void start() {
        log.info("start");
        history.add("start");
    }

    public void stop() {
        log.info("stop");
        history.add("stop");
    }

    public void goStraight() {
        log.info("go straight");
        history.add("go straight");
    }

    public void shutOff() {
        log.info("shut off");
        history.add("shut off");
    }

    public void turnLeft() {
        log.info("turn left");
        history.add("turn left");
    }

    public void turnRight() {
        log.info("turn right");
        history.add("turn right");
    }
}
