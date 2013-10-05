package com.jamesrosko.patterns.abstractfactory;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class AbstractFactoryTest {

    private CarManufacturer carManufacturerA;
    private CarManufacturer carManufacturerB;

    @Before
    public void setup() {
        carManufacturerA = new CarManufacturerA();
        carManufacturerB = new CarManufacturerB();
    }

    @Test
    public void produceCarManufacturerANotNull() {
        CarFactory carFactory = new CarFactory(carManufacturerA);
        Car actual = carFactory.produce(CarType.MID_SIZE);
        assertThat(actual, notNullValue());
    }

    @Test
    public void produceCarManufacturerBNotNull() {
        CarFactory carFactory = new CarFactory(carManufacturerB);
        Car actual = carFactory.produce(CarType.MID_SIZE);
        assertThat(actual, notNullValue());
    }

    @Test
    public void compactCarFromManufacturerA() {
        CarFactory carFactory = new CarFactory(carManufacturerA);
        Car actual = carFactory.produce(CarType.COMPACT);
        assertThat(actual.getCarType(), is(CarType.COMPACT));
        assertThat(actual.getMaker(), is("maker a"));
    }

    @Test
    public void midSizeCarFromManufacturerA() {
        CarFactory carFactory = new CarFactory(carManufacturerA);
        Car actual = carFactory.produce(CarType.MID_SIZE);
        assertThat(actual.getCarType(), is(CarType.MID_SIZE));
        assertThat(actual.getMaker(), is("maker a"));
    }

    @Test
    public void compactCarFromManufacturerB() {
        CarFactory carFactory = new CarFactory(carManufacturerB);
        Car actual = carFactory.produce(CarType.COMPACT);
        assertThat(actual.getCarType(), is(CarType.COMPACT));
        assertThat(actual.getMaker(), is("maker b"));
    }

    @Test
    public void midSizeCarFromManufacturerB() {
        CarFactory carFactory = new CarFactory(carManufacturerB);
        Car actual = carFactory.produce(CarType.MID_SIZE);
        assertThat(actual.getCarType(), is(CarType.MID_SIZE));
        assertThat(actual.getMaker(), is("maker b"));
    }

    @Test
    public void compactCarCargoVolume() {
        CarFactory carFactory = new CarFactory(carManufacturerA);
        Car actual = carFactory.produce(CarType.COMPACT);
        assertThat(actual.getCargoVolume(), is(100));
    }

    @Test
    public void midSizeCarCargoVolume() {
        CarFactory carFactory = new CarFactory(carManufacturerA);
        Car actual = carFactory.produce(CarType.MID_SIZE);
        assertThat(actual.getCargoVolume(), is(110));
    }

}
