package com.jamesrosko.patterns.bridge;

abstract class Shape {

    protected DrawingAPI drawingApi;

    protected Shape(DrawingAPI drawingApi) {
        this.drawingApi = drawingApi;
    }

    protected abstract void resizeByPercentage(double percent);

    protected abstract void draw();
    
    protected abstract double getRadius();

}
