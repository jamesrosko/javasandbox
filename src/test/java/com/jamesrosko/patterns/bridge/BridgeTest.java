package com.jamesrosko.patterns.bridge;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BridgeTest {

    @Test
    public void bridge() {
        List<Shape> shapes = new ArrayList<Shape>();

        CircleShape circleShape1 = new CircleShape(1, 3, 7, new DrawingAPI1());
        shapes.add(circleShape1);
        CircleShape circleShape2 = new CircleShape(5, 7, 11, new DrawingAPI2());
        shapes.add(circleShape2);

        for (Shape shape : shapes) {
            shape.draw();
            shape.resizeByPercentage(250);
            shape.draw();
        }

        assertThat(circleShape1.getRadius(), is(17.5d));
        assertThat(circleShape2.getRadius(), is(27.5d));
    }
}
