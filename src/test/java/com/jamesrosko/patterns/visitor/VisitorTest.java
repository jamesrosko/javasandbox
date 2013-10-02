package com.jamesrosko.patterns.visitor;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class VisitorTest {

    @Test
    public void serviceA() {

        Car car = new Car();
        car.setName("carA");
        car.accept(new ServiceA());

        assertThat(car.getType(), is("type a"));
    }

    @Test
    public void serviceB() {

        Car car = new Car();
        car.setName("carB");
        car.accept(new ServiceB());

        assertThat(car.getType(), is("type b"));
    }

    @Test
    public void visiteAllServices() {
        List<Service> services = Arrays.asList(new ServiceA(), new ServiceB());
        Car car = new Car();
        car.setName("all car");
        for (Service service : services) {
            car.accept(service);
        }
        assertThat(car.getType(), is("type b"));
    }

}
