package com.jamesrosko.patterns.abstractfactory;

public class CarFactory {

    private CarManufacturer carManufacturer;

    public CarFactory(CarManufacturer carManufacturer) {
        this.carManufacturer = carManufacturer;
    }

    public Car produce(CarType carType) {
        return carManufacturer.produce(carType);
    }

}
