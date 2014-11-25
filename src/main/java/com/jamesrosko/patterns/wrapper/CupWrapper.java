package com.jamesrosko.patterns.wrapper;

import org.apache.log4j.Logger;

public class CupWrapper implements Cup {

    private static Logger log = Logger.getLogger(CupWrapper.class);

    private Cup cup;

    public CupWrapper(Cup cup) {
        this.cup = cup;
    }

    public void fill() {
        log.info("fill");
        cup.fill();
        log.info("Is empty: " + cup.isEmpty());
    }

    public void drink() {
        log.info("drink");
        cup.drink();
        log.info("Is empty: " + cup.isEmpty());

    }

    public boolean isEmpty() {
        return cup.isEmpty();
    }

}
