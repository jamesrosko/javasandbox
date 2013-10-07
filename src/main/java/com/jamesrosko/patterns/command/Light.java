package com.jamesrosko.patterns.command;

import org.apache.log4j.Logger;

public class Light {

    private static Logger log = Logger.getLogger(Light.class);

    public void turnOn() {
        log.info("The light is on.");
    }

    public void turnOff() {
        log.info("The light is off.");
    }

}
