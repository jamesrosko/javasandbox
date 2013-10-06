package com.jamesrosko.patterns.bridge;

import org.apache.log4j.Logger;

public class CircleShape extends Shape {

    private static Logger log = Logger.getLogger(CircleShape.class);
    private double x, y, radius;

    public CircleShape(int x, int y, int radius, DrawingAPI drawingApi) {
        super(drawingApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    protected void resizeByPercentage(double percent) {
        radius *= 0.01 * percent;
        log.info("resize by " + percent + " percent");
    }

    @Override
    protected void draw() {
        drawingApi.drawCircle(x, y, radius);
    }

    @Override
    protected double getRadius() {
        return radius;
    }
}
