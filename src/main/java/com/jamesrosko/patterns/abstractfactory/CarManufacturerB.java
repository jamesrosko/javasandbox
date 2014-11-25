package com.jamesrosko.patterns.abstractfactory;

public class CarManufacturerB implements CarManufacturer {

    private static final String MANUFACTURER_NAME = "maker b";

    public Car produce(CarType carType) {
        /**
         * Different implementation than CarManufacturerA
         */
        Car car = carType.buildCar();
        car.setMaker(MANUFACTURER_NAME);
        return car;
    }

}
