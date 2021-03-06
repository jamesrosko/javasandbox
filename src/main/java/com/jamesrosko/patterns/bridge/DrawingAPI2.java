package com.jamesrosko.patterns.bridge;

import org.apache.log4j.Logger;

public class DrawingAPI2 implements DrawingAPI {
    private static Logger log = Logger.getLogger(DrawingAPI2.class);

    public void drawCircle(double x, double y, double radius) {
        String location = String.format(" at %f:%f radius %f", x, y, radius);
        log.info(this.getClass().getCanonicalName() + location);
    }

}
